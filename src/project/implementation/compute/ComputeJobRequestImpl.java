package project.implementation.compute;

import project.api.compute.ComputeJobRequest;
import project.api.compute.ComputeInput;

public class ComputeJobRequestImpl implements ComputeJobRequest {

    private final ComputeInput input;

    public ComputeJobRequestImpl(ComputeInput input) {
        this.input = input;
    }

    @Override
    public ComputeInput getInput() {
        return input;
    }
}
