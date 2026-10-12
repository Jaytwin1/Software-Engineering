package project.jobhandle;

import project.api.usercompute.UserComputeAPI;
import project.api.usercompute.UserComputeRequest;
import project.api.usercompute.UserComputeResponse;
import project.api.compute.ComputeEngineAPI;
import project.api.compute.ComputeJobRequest;
import project.api.compute.ComputeJobResponse;
import project.api.compute.ComputeInput;
import project.api.storagecompute.StorageComputeAPI;
import project.api.storagecompute.StorageComputeRequest;
import project.api.storagecompute.StorageComputeResponse;
import project.api.storagecompute.DataInput;
import project.api.storagecompute.DataOutput;
import project.implementation.compute.ComputeInputImpl;
import project.implementation.compute.ComputeJobRequestImpl;
import project.implementation.storagecompute.StorageComputeRequestImpl;
import project.implementation.storagecompute.DataInputImpl;
import project.implementation.storagecompute.DataOutputImpl;

public class JobHandler {

    private final UserComputeAPI userComputeAPI;
    private final ComputeEngineAPI computeEngineAPI;
    private final StorageComputeAPI storageComputeAPI;

    public JobHandler(UserComputeAPI userComputeAPI,
                      ComputeEngineAPI computeEngineAPI,
                      StorageComputeAPI storageComputeAPI) {

        this.userComputeAPI = userComputeAPI;
        this.computeEngineAPI = computeEngineAPI;
        this.storageComputeAPI = storageComputeAPI;
    }

    public StorageComputeResponse handleJob(UserComputeRequest userReq) {

        // 1. USER COMPUTE PHASE
        UserComputeResponse userResp = userComputeAPI.process(userReq);

        // Extract processed data (int[])
        int[] processedData = userResp.getProcessedData();


        // 2. COMPUTE ENGINE PHASE
        ComputeInput computeInput = new ComputeInputImpl(processedData);
        ComputeJobRequest computeReq = new ComputeJobRequestImpl(computeInput);

        ComputeJobResponse computeResp = computeEngineAPI.compute(computeReq);

        // Extract compute output (int[])
        int[] computeOutputData = computeResp.getOutput().getData();


        // 3. STORAGE COMPUTE PHASE
        DataInput storageInput = new DataInputImpl(computeOutputData);
        DataOutput storageOutput = new DataOutputImpl();

        StorageComputeRequest storageReq =
                new StorageComputeRequestImpl(storageInput, storageOutput);

        return storageComputeAPI.transfer(storageReq);
    }
}
