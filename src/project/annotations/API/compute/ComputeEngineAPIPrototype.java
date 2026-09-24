package project.annotations.api.compute;

import project.annotations.ConceptualAPIPrototype;

public class ComputeEngineAPIPrototype {

    @ConceptualAPIPrototype
    public ComputeJobResponse computePrototype(ComputeJobRequest request) {

        // Prototype only:
        // 1. Receive input from Job Manager
        // 2. Perform computation (conceptually)
        // 3. Return results wrapped in ComputeOutput

        return null; // Prototype methods return nothing 
    }
}
