package project.implementation.compute;

import project.api.compute.ComputeOutput;

public class ComputeOutputIm implements ComputeOutput {

    private int[] data;

    @Override
    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public int[] getData() {
        return data;
    }
}
