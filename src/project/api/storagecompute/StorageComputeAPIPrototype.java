package project.api.storagecompute;

import project.annotations.ProcessAPIPrototype;
import project.implementation.storagecompute.StorageComputeResponseIm;
public class StorageComputeAPIPrototype implements StorageComputeAPI {

    @Override
    @ProcessAPIPrototype
    public StorageComputeResponse transfer(StorageComputeRequest request) {

        // Mock behavior: pretend storage succeeded
        int[] data = request.getInput().getData();

        // Pretend we "stored" it by copying into output
        request.getOutput().setData(data);

        return new StorageComputeResponseIm(
                true,
                "Mock storage transfer completed successfully."
        );
    }
}
