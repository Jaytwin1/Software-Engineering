package project.implementation.compute;

import project.api.compute.ComputeInput;

public class ComputeInputImpl implements ComputeInput {

    private final int[] data;

    public ComputeInputImpl(int[] data) {
        this.data = data;
    }

    @Override
    public int[] getData() {
        return data;
    }
}
