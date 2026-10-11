package project.implementation.usercompute;

import project.InputSource;
import project.OutputEnd;
import project.UserComputeRequest;

public class UserComputeRequestIm implements UserComputeRequest {

    private final InputSource source;
    private final OutputEnd end;
    private final String delimiter;

    public UserComputeRequestIm(InputSource source, OutputEnd end, String delimiter) {
        this.source = source;
        this.end = end;
        this.delimiter = delimiter;
    }

    @Override
    public InputSource getSource() {
        return source;
    }

    @Override
    public OutputEnd getEnd() {
        return end;
    }

    @Override
    public String getDelimiter() {
        return delimiter;
    }
}
