package project.api.usercompute;

import project.annotations.NetworkAPI;

@NetworkAPI
public interface UserComputeAPI {

    UserComputeResponse process(UserComputeRequest request);

    // Nested request type
    class UserComputeRequest {
        private final int[] data;

        public UserComputeRequest(int[] data) {
            this.data = data;
        }

        public int[] getData() {
            return data;
        }
    }

    // Nested response type
    class UserComputeResponse {
        private final int[] result;

        public UserComputeResponse(int[] result) {
            this.result = result;
        }

        public int[] getResult() {
            return result;
        }
    }
}
