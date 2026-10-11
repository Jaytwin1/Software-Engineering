package project.implementation.storagecompute;

import project.StorageComputeResponse;

public class StorageComputeResponseIm implements StorageComputeResponse {

    private final boolean success;
    private final String message;

    public StorageComputeResponseIm(boolean success, String message) {
        this.success = success;
        this.message = message;
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
