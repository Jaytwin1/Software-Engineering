package project.implementation.compute;

import project.api.compute.ComputeJobResponse;
import project.api.compute.ComputeOutput;

public class ComputeJobResponseImpl implements ComputeJobResponse {

    private final ComputeOutput output;
    private final boolean success;
    private final String message;

    public ComputeJobResponseImpl(ComputeOutput output, boolean success, String message) {
        this.output = output;
        this.success = success;
        this.message = message;
    }

    @Override
    public ComputeOutput getOutput() {
        return output;
    }

    @Override
    public boolean isSuccess() {
        return success;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
