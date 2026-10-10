package project.implementation.usercompute;

import project.api.usercompute.InputSource;

public class InputSourceIm implements InputSource {

    private final String identifier;

    public InputSourceIm(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }
}
