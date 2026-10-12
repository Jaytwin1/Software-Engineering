package project.implementation.usercompute;

import project.api.usercompute.OutputEnd;

public class OutputEndImpl implements OutputEnd {

    private final String identifier;

    public OutputEndImpl(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }
}
