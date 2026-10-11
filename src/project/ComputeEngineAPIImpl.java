package project;

public class ComputeEngineAPIImpl implements ComputeEngineAPI {

    // Dependency (from your system design diagram)
    private final StorageComputeAPI storageComputeAPI;

    // Explicit constructor (required for Checkpoint 3)
    public ComputeEngineAPIImpl(StorageComputeAPI storageComputeAPI) {
        this.storageComputeAPI = storageComputeAPI;
    }

    @Override
    public ComputeJobResponse compute(ComputeJobRequest request) {
        // Empty implementation — return default value
        return null;
    }
}
