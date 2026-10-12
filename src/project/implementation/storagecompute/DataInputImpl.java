package project.implementation.storagecompute;

import project.api.storagecompute.DataInput;

public class DataInputImpl implements DataInput {

    private final int[] data;

    public DataInputImpl(int[] data) {
        this.data = data;
    }

    @Override
    public int[] getData() {
        return data;
    }
}
