package project.implementation.compute;

import project.api.compute.ComputeEngineAPI;
import project.api.storagecompute.StorageComputeAPI;

public class ComputeEngineAPIImpl implements ComputeEngineAPI {

    private final StorageComputeAPI storageComputeAPI;

    public ComputeEngineAPIImpl(StorageComputeAPI storageComputeAPI) {
        this.storageComputeAPI = storageComputeAPI;
    }

    @Override
    public ComputeEngineResponse compute(ComputeEngineRequest request) {
        return null; // Checkpoint 3
    }
}
