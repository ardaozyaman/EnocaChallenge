package enoca.io.demo.business.abstracts;

import enoca.io.demo.business.requests.model.CreateModelRequest;
import enoca.io.demo.business.responses.model.GetAllModelsResponse;

import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();

    void add(CreateModelRequest createModelRequest);
}
