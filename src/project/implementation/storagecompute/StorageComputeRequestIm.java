package project.implementation.storagecompute;

import project.api.storagecompute.DataInput;
import project.api.storagecompute.DataOutput;
import project.api.storagecompute.StorageComputeRequest;

public class StorageComputeRequestIm implements StorageComputeRequest {

    private final DataInput input;
    private final DataOutput output;

    public StorageComputeRequestIm(DataInput input, DataOutput output) {
        this.input = input;
        this.output = output;
    }

    @Override
    public DataInput getInput() {
        return input;
    }

    @Override
    public DataOutput getOutput() {
        return output;
    }
}
