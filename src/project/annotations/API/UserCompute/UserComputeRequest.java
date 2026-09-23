package project.annotations.API.UserCompute;

public interface UserComputeRequest {
    InputSource getSource();
    OutputEnd getEnd();
    String getDelimiter();   // null or empty means “use default”
}

