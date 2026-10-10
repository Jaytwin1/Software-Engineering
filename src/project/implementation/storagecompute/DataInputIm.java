package project.implementation.storagecompute;

import project.api.storagecompute.DataInput;

public class DataInputIm implements DataInput {

    private final int[] data;

    public DataInputIm(int[] data) {
        this.data = data;
    }

    @Override
    public int[] getData() {
        return data;
    }
}
