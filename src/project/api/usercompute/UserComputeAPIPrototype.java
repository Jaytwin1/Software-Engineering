package project.api.usercompute;

import project.annotations.NetworkAPIPrototype;

public class UserComputeAPIPrototype implements UserComputeAPI {

    @Override
    @NetworkAPIPrototype
    public UserComputeResponse process(UserComputeRequest request) {

        // Mock behavior for prototype
        int[] mockProcessed = new int[]{1, 2, 3};

        return new UserComputeResponse(mockProcessed);
    }
}
