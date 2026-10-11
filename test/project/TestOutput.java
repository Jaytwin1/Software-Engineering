import java.util.List;

public class TestOutput {

    private final List<String> output;

    public TestOutput(List<String> output) {
        this.output = output;
    }

    public List<String> getOutput() {
        return output;
    }

    public void write(String value) {
        output.add(value);
    }
}
