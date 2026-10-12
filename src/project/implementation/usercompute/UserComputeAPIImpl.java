package project.implementation.usercompute;
import project.annotations.NetworkAPI;
import project.api.usercompute.UserComputeAPI;
import project.api.usercompute.UserComputeRequest;
import project.api.usercompute.UserComputeResponse;

@NetworkAPI 
public class UserComputeAPIImpl implements UserComputeAPI {

    public UserComputeAPIImpl() { }

    @Override
    public UserComputeResponse process(UserComputeRequest request) {
        return null; // empty implementation
    }
}
