package project.api.compute;

import project.annotations.ConceptualAPIPrototype;
import project.implementation.compute.ComputeJobResponseImpl;
import project.implementation.compute.ComputeOutputImpl;

public class ComputeEngineAPIPrototype implements ComputeEngineAPI {

    @Override
    @ConceptualAPIPrototype
    public ComputeJobResponse compute(ComputeJobRequest request) {

        // Mock behavior: pretend compute engine sums the numbers
        int[] input = request.getInput().getData();

        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }

        ComputeOutputImpl output = new ComputeOutputImpl();
        output.setData(new int[]{sum});

        return new ComputeJobResponseImpl(
                output,
                true,
                "Mock compute engine executed successfully."
        );
}
}
