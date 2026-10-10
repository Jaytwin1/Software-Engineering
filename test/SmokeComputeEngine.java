
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import project.api.compute.*;
import project.api.storagecompute.StorageComputeAPI;
class TestComputeEngineAPI {

    @Test
    void smokeTest() {

        // Mock dependency
        StorageComputeAPI storageMock = Mockito.mock(StorageComputeAPI.class);

        // Explicit constructor call (required)
        ComputeEngineAPIImpl api = new ComputeEngineAPIImpl(storageMock);

        // Mock request
        ComputeJobRequest req = Mockito.mock(ComputeJobRequest.class);

        // Call method (returns null — expected for Checkpoint 3)
        api.compute(req);
    }
}
