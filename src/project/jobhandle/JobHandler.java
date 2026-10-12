package project.jobhandle;

import project.api.usercompute.UserComputeAPI;
import project.api.usercompute.UserComputeAPI.UserComputeRequest;
import project.api.usercompute.UserComputeAPI.UserComputeResponse;

import project.api.compute.ComputeEngineAPI;
import project.api.compute.ComputeEngineAPI.ComputeEngineRequest;
import project.api.compute.ComputeEngineAPI.ComputeEngineResponse;

import project.api.storagecompute.StorageComputeAPI;
import project.api.storagecompute.StorageComputeAPI.StorageComputeRequest;
import project.api.storagecompute.StorageComputeAPI.StorageComputeResponse;

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

    public StorageComputeResponse handleJob(int[] rawData) {

        // 1. USER COMPUTE PHASE
        UserComputeRequest userReq = new UserComputeRequest(rawData);
        UserComputeResponse userResp = userComputeAPI.process(userReq);
        int[] userProcessed = userResp.getResult();

        // 2. COMPUTE ENGINE PHASE
        ComputeEngineRequest computeReq = new ComputeEngineRequest(userProcessed);
        ComputeEngineResponse computeResp = computeEngineAPI.compute(computeReq);
        int[] engineProcessed = computeResp.getResult();

        // 3. STORAGE COMPUTE PHASE
        StorageComputeRequest storageReq = new StorageComputeRequest(engineProcessed);
        return storageComputeAPI.transfer(storageReq);
    }
}
