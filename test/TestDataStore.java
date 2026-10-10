
import project.annotations.ProcessAPI;

@ProcessAPI
public class TestDataStore {

    public void readAndWrite(TestInput input, TestOutput output) {

        // Read integers
        for (Integer value : input.getData()) {

            // Write strings (simple conversion)
            output.write("Value: " + value);
        }
    }
}
