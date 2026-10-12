package project.implementation.usercompute;

import project.api.usercompute.UserComputeRequest;
import project.api.usercompute.InputSource;
import project.api.usercompute.OutputEnd;

public class UserComputeRequestImpl implements UserComputeRequest {

    private final InputSource source;
    private final OutputEnd end;
    private final String delimiter;

    public UserComputeRequestImpl(InputSource source, OutputEnd end, String delimiter) {
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
