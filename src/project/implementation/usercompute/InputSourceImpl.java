package project.implementation.usercompute;

import project.api.usercompute.InputSource;

public class InputSourceImpl implements InputSource {

    private final String identifier;

    public InputSourceImpl(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }
}
