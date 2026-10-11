package project;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface StorageComputeAPI {

    StorageComputeResponse transfer(StorageComputeRequest request);

}
