package project.implementation.storagecompute;


import project.annotations.ProcessAPI;
import project.api.storagecompute.StorageComputeAPI;
import project.api.storagecompute.StorageComputeRequest;
import project.api.storagecompute.StorageComputeResponse;
@ProcessAPI 
public class StorageComputeAPIImpl implements StorageComputeAPI {

    public StorageComputeAPIImpl() { }

    @Override
    public StorageComputeResponse transfer(StorageComputeRequest request) {
        // Empty implementation — return default value
        return null;
    }
}
