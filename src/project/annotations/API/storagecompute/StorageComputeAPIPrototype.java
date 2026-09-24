package project.annotations.api.storagecompute;

import project.annotations.ProcessAPIPrototype;

public class StorageComputeAPIPrototype {

    @ProcessAPIPrototype
    public StorageComputeResponse transferPrototype(StorageComputeRequest request) {

        // Prototype only:
        // 1. Read integers from request.getInput()
        // 2. Pass them to compute engine
        // 3. Write results into request.getOutput()
        // 4. Return a response

        return null; // Prototype methods return nothing meaningful
    }
}
