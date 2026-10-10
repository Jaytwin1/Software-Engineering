package project.api.storagecompute;

import project.annotations.ProcessAPIPrototype;
<<<<<<< HEAD

public class StorageComputeAPIPrototype {

    @ProcessAPIPrototype
    public StorageComputeResponse transferPrototype(StorageComputeRequest request) {

        // Prototype only:
        // 1. Read integers from request.getInput()
        // 2. Pass them to compute engine
        // 3. Write results into request.getOutput()
        // 4. Return a response

        return null; // Prototype methods return nothing 
=======
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
>>>>>>> Checkpoint3
    }
}
