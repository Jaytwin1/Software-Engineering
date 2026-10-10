package project.api.usercompute;

import project.annotations.NetworkAPIPrototype;
<<<<<<< HEAD

public class UserComputeAPIPrototype {

    @NetworkAPIPrototype
    public UserComputeResponse processPrototype(UserComputeRequest request) {

        // Prototype behavior description only — no real implementation.
        // 1. Read input from request.getSource()
        // 2. If request.getDelimiter() is null/empty, use default delimiters
        // 3. Format output using delimiter(s)
        // 4. Write output to request.getDestination()
        // 5. Return a success/failure response

        return null; // Prototype methods return nothing
}
}
=======
import project.implementation.usercompute.UserComputeResponseIm;

public class UserComputeAPIPrototype implements UserComputeAPI {

    @Override
    @NetworkAPIPrototype
    public UserComputeResponse process(UserComputeRequest request) {

        // Mock behavior for prototype
        int[] mockProcessed = new int[]{1, 2, 3};

        return new UserComputeResponseIm(
                true,
                "Mock user compute processed successfully.",
                mockProcessed
        );
    }
}
>>>>>>> Checkpoint3
