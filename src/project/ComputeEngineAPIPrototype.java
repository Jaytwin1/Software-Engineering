package project;

import project.annotations.ConceptualAPIPrototype;
import project.implementation.compute.ComputeJobResponseIm;
import project.implementation.compute.ComputeOutputIm;

public class ComputeEngineAPIPrototype implements ComputeEngineAPI {

    
    @ConceptualAPIPrototype
    public ComputeJobResponse compute(ComputeJobRequest request) {

        // Mock behavior: pretend compute engine sums the numbers
        int[] input = request.getInput().getData();

        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }

        ComputeOutputIm output = new ComputeOutputIm();
        output.setData(new int[]{sum});

        return new ComputeJobResponseIm(
                output,
                true,
                "Mock compute engine executed successfully."
        );
}
}
