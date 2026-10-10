package project.api.compute;

public interface ComputeJobResponse {
    ComputeOutput getOutput();
    boolean isSuccess();
    String getMessage();
}
