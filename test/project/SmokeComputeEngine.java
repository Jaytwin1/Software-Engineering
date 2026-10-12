package project;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import project.api.compute.ComputeEngineAPI;
import project.api.compute.ComputeEngineAPI.ComputeEngineRequest;
import project.api.storagecompute.StorageComputeAPI;
import project.implementation.compute.ComputeEngineAPIImpl;

class SmokeComputeEngine {

    @Test
    void smokeTest() {

        // Mock dependency
        StorageComputeAPI storageMock = Mockito.mock(StorageComputeAPI.class);

        // Explicit constructor call (required)
        ComputeEngineAPIImpl api = new ComputeEngineAPIImpl(storageMock);

        // Mock request
        ComputeEngineRequest req = Mockito.mock(ComputeEngineRequest.class);

        // Call method (returns null — expected for Checkpoint 3)
        api.compute(req);
    }
}
