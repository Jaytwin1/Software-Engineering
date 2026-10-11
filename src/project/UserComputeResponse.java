package project;

public interface UserComputeResponse {
    boolean isSuccess();
    String getMessage();
    int[] getProcessedData();
}
