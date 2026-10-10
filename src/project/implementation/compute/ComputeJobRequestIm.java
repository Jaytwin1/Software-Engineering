package project.implementation.compute;

import project.api.compute.*;

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
