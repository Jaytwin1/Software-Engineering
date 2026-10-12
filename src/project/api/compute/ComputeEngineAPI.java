package project.api.compute;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface ComputeEngineAPI {

    ComputeEngineResponse compute(ComputeEngineRequest request);

    // Nested request type
    class ComputeEngineRequest {
        private final int[] data;
        public ComputeEngineRequest(int[] data) { this.data = data; }
        public int[] getData() { return data; }
    }

    // Nested response type
    class ComputeEngineResponse {
        private final int[] result;
        public ComputeEngineResponse(int[] result) { this.result = result; }
        public int[] getResult() { return result; }
    }
}
