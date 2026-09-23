package project.annotations.API.UserCompute;
import project.annotations.NetworkAPI;
@NetworkAPI
public interface UserComputeAPI {

    UserComputeResponse process(UserComputeRequest request);

}

