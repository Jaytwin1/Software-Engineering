import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import project.api.usercompute.*;

class TestUserComputeAPI {

    @Test
    void smokeTest() {

        // Explicit constructor call
        UserComputeAPIImpl api = new UserComputeAPIImpl();

        // Mock request
        UserComputeRequest req = Mockito.mock(UserComputeRequest.class);

        api.process(req); // returns null — expected
    }
}
