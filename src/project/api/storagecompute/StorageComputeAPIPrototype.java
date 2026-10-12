package project.api.storagecompute;

import project.annotations.ProcessAPIPrototype;

public class StorageComputeAPIPrototype implements StorageComputeAPI {

    @Override
    @ProcessAPIPrototype
    public StorageComputeResponse transfer(StorageComputeRequest request) {

        // Mock behavior for prototype
        int[] mockResult = new int[]{10, 20, 30};

        return new StorageComputeResponse(
                true,
                "Mock storage compute transfer completed successfully.",
                mockResult
        );
    }
}
