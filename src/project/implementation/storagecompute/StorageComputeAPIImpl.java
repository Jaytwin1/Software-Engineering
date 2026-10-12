package project.implementation.storagecompute;

import project.annotations.ProcessAPI;
import project.api.storagecompute.StorageComputeAPI;

@ProcessAPI
public class StorageComputeAPIImpl implements StorageComputeAPI {

    @Override
    public StorageComputeResponse transfer(StorageComputeRequest request) {
        int[] data = request.getData();
        int[] out = new int[data.length];

        // Example placeholder logic
        for (int i = 0; i < data.length; i++) {
            out[i] = data[i] + 10;
        }

        return new StorageComputeResponse(
                true,
                "Storage compute processed successfully.",
                out
        );
    }
}
