package project.api.usercompute;

import project.annotations.NetworkAPIPrototype;
import project.implementation.usercompute.UserComputeResponseIm;

public class UserComputeAPIPrototype implements UserComputeAPI {

    @Override
    @NetworkAPIPrototype
    public UserComputeResponse process(UserComputeRequest request) {

        // Mock behavior for prototype
        int[] mockProcessed = new int[]{1, 2, 3};

        return new UserComputeResponseIm(
                true,
                "Mock user compute processed successfully.",
                mockProcessed
        );
    }
}
