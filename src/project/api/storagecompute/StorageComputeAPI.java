package project.api.storagecompute;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface StorageComputeAPI {

    StorageComputeResponse transfer(StorageComputeRequest request);

    // Nested request type
    class StorageComputeRequest {
        private final int[] data;

        public StorageComputeRequest(int[] data) {
            this.data = data;
        }

        public int[] getData() {
            return data;
        }
    }

    // Nested response type
    class StorageComputeResponse {
        private final boolean success;
        private final String message;
        private final int[] result;

        public StorageComputeResponse(boolean success, String message, int[] result) {
            this.success = success;
            this.message = message;
            this.result = result;
        }

        public boolean isSuccess() {
            return success;
        }

        public String getMessage() {
            return message;
        }

        public int[] getResult() {
            return result;
        }
    }
}
