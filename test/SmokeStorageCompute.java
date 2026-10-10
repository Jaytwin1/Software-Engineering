import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import project.api.storagecompute.*;

class TestStorageComputeAPI {

    @Test
    void smokeTest() {

        // Explicit constructor call
        StorageComputeAPIImpl api = new StorageComputeAPIImpl();

        // Mock request
        StorageComputeRequest req = Mockito.mock(StorageComputeRequest.class);

        api.transfer(req); // returns null — expected
    }
}
