package project.annotations.api.compute;

public interface FactorResponse {
    FactorOutput getOutput();
    boolean isSuccess();
    String getMessage();
}
