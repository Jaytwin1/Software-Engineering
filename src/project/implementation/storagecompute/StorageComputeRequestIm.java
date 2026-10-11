package project.implementation.storagecompute;

import project.DataInput;
import project.DataOutput;
import project.StorageComputeRequest;

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
