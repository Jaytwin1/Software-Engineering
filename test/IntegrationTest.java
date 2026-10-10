import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import project.api.usercompute.*;
import project.api.storagecompute.*;



class ComputeEngineIntegrationTest {

    @Test
    void integrationTest() {

        // 1. Instantiate real @NetworkAPI implementation
        UserComputeAPI userApi = new UserComputeAPIImpl();

        // 2. Instantiate real @ConceptualAPI implementation
        StorageComputeAPI storageApi = new StorageComputeAPIImpl();

        // 3. Instantiate test-only @ProcessAPI implementation
        TestDataStore dataStore = new TestDataStore();

        // Input: [1, 10, 25]
        List<Integer> inputList = List.of(1, 10, 25);
        TestInput inputConfig = new TestInput(inputList);

        // Output list
        List<String> outputList = new ArrayList<>();
        TestOutput outputConfig = new TestOutput(outputList);

        // Run test-only data store
        dataStore.readAndWrite(inputConfig, outputConfig);

        // Validate output (will fail later when compute engine is implemented)
        assert(!outputList.isEmpty());
    }
}
