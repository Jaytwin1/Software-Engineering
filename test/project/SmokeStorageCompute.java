package project;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SmokeStorageCompute {

    @Test
    void smokeTest() {

        // Explicit constructor call
        StorageComputeAPIImpl api = new StorageComputeAPIImpl();

        // Mock request
        StorageComputeRequest req = Mockito.mock(StorageComputeRequest.class);

        api.transfer(req); // returns null — expected
    }
}
