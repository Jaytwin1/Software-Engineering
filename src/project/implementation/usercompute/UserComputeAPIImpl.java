package project.implementation.usercompute;

import project.annotations.NetworkAPI;
import project.api.usercompute.UserComputeAPI;

@NetworkAPI
public class UserComputeAPIImpl implements UserComputeAPI {

    @Override
    public UserComputeResponse process(UserComputeRequest request) {
        int[] data = request.getData();
        int[] out = new int[data.length];

        // Example placeholder logic
        for (int i = 0; i < data.length; i++) {
            out[i] = data[i] + 1;
        }

        return new UserComputeResponse(out);
    }
}
