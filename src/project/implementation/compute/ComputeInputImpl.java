package project.implementation.compute;

import project.api.compute.ComputeInput;

public class ComputeInputIm implements ComputeInput {

    private final int[] data;

    public ComputeInputIm(int[] data) {
        this.data = data;
    }

    @Override
    public int[] getData() {
        return data;
    }
}
