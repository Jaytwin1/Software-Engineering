package project.api.usercompute;

public interface UserComputeResponse {
    boolean isSuccess();
    String getMessage();
    int[] getProcessedData();
}
