package project;

public interface ComputeJobResponse {
    ComputeOutput getOutput();
    boolean isSuccess();
    String getMessage();
}
