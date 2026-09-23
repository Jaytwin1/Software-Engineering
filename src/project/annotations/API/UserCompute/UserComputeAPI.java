package project.annotations.API.UserCompute;

@NetworkAPI
public interface UserComputeAPI {

    UserComputeResponse process(UserComputeRequest request);

}

