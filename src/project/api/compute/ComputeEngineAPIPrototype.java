package project.api.compute;

import project.annotations.ConceptualAPIPrototype;
<<<<<<< HEAD

public class ComputeEngineAPIPrototype {

    @ConceptualAPIPrototype
    public ComputeJobResponse computePrototype(ComputeJobRequest request) {

        // Prototype only:
        // 1. Receive input from Job Manager
        // 2. Perform computation (conceptually)
        // 3. Return results wrapped in ComputeOutput

        return null; // Prototype methods return nothing 
=======
import project.implementation.compute.ComputeJobResponseIm;
import project.implementation.compute.ComputeOutputIm;

public class ComputeEngineAPIPrototype implements ComputeEngineAPI {

    @Override
    @ConceptualAPIPrototype
    public ComputeJobResponse compute(ComputeJobRequest request) {

        // Mock behavior: pretend compute engine sums the numbers
        int[] input = request.getInput().getData();

        int sum = 0;
        for (int n : input) sum += n;

        ComputeOutputIm output = new ComputeOutputIm();
        output.setData(new int[]{sum});

        return new ComputeJobResponseIm(
                output,
                true,
                "Mock compute engine executed successfully."
        );
>>>>>>> Checkpoint3
    }
}
