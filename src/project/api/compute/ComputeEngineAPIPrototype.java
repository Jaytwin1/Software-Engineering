package project.api.compute;

import project.annotations.ConceptualAPIPrototype;
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
    }
}
