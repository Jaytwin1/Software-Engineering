package project;

public interface FactorResponse {
    FactorOutput getOutput();
    boolean isSuccess();
    String getMessage();
}