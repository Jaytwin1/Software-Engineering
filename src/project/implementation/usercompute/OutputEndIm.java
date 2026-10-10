package project.implementation.usercompute;

import project.api.usercompute.OutputEnd;

public class OutputEndIm implements OutputEnd {

    private final String identifier;

    public OutputEndIm(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }
}
