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
import project.implementation.compute.ComputeInputIm;
import project.implementation.compute.ComputeJobRequestIm;
import project.implementation.storagecompute.StorageComputeRequestIm;
import project.implementation.storagecompute.DataInputIm;
import project.implementation.storagecompute.DataOutputIm;

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
        ComputeInput computeInput = new ComputeInputIm(processedData);
        ComputeJobRequest computeReq = new ComputeJobRequestIm(computeInput);

        ComputeJobResponse computeResp = computeEngineAPI.compute(computeReq);

        // Extract compute output (int[])
        int[] computeOutputData = computeResp.getOutput().getData();


        // 3. STORAGE COMPUTE PHASE
        DataInput storageInput = new DataInputIm(computeOutputData);
        DataOutput storageOutput = new DataOutputIm();

        StorageComputeRequest storageReq =
                new StorageComputeRequestIm(storageInput, storageOutput);

        return storageComputeAPI.transfer(storageReq);
    }
}
