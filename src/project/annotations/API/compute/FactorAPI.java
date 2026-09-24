package project.annotations.api.compute;

import project.annotations.ConceptualAPI;

@ConceptualAPI
public interface FactorAPI {

    FactorResponse computeFactors(FactorRequest request);

}
