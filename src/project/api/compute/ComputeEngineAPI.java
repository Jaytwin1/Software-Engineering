package project.api.compute;

import project.annotations.ConceptualAPI;

@ConceptualAPI
public interface ComputeEngineAPI {

    ComputeJobResponse compute(ComputeJobRequest request);

}
