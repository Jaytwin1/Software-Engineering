package project.implementation.storagecompute;

import project.api.storagecompute.DataOutput;

public class DataOutputIm implements DataOutput {

    private int[] data;

    @Override
    public void setData(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }
}
