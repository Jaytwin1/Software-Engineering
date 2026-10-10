package project.implementation.usercompute;

import project.api.usercompute.UserComputeResponse;

public class UserComputeResponseIm implements UserComputeResponse {

    private final boolean success;
    private final String message;
    private final int[] processedData;

    public UserComputeResponseIm(boolean success, String message, int[] processedData) {
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
