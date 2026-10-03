package project.annotations.api.usercompute;

public interface UserComputeRequest {
    InputSource getSource();
    OutputEnd getEnd();
    String getDelimiter();   // null or empty means “use default”
}

