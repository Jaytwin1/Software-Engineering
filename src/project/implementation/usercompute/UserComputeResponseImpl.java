package project.implementation.usercompute;

import project.api.usercompute.UserComputeResponse;

public class UserComputeResponseImpl implements UserComputeResponse {

    private final boolean success;
    private final String message;
    private final int[] processedData;

    public UserComputeResponseImpl(boolean success, String message, int[] processedData) {
        this.success = success;
        this.message = message;
        this.processedData = processedData;
    }

    @Override
    public boolean isSuccess() {
        return success;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public int[] getProcessedData() {
        return processedData;
    }
}
