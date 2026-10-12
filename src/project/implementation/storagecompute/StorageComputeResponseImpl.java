package project.implementation.storagecompute;

import project.api.storagecompute.StorageComputeResponse;

public class StorageComputeResponseImpl implements StorageComputeResponse {

    private final boolean success;
    private final String message;

    public StorageComputeResponseImpl(boolean success, String message) {
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
