package project.implementation.compute;

import project.api.compute.ComputeJobRequest;
import project.api.compute.ComputeInput;

public class ComputeJobRequestIm implements ComputeJobRequest {

    private final ComputeInput input;

    public ComputeJobRequestIm(ComputeInput input) {
        this.input = input;
    }

    @Override
    public ComputeInput getInput() {
        return input;
    }
}
