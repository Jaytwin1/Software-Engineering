package project.annotations.api.compute;

import project.annotations.ConceptualAPI;

@ConceptualAPI
public interface ComputeEngineAPI {

    ComputeJobResponse compute(ComputeJobRequest request);

}
