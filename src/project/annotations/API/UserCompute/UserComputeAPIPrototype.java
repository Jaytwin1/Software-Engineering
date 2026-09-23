package project.annotations.API.UserCompute;

import project.annotations.NetworkAPIPrototype;

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
