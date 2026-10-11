package project.implementation.compute;

import project.ComputeInput;
import project.ComputeJobRequest;

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
