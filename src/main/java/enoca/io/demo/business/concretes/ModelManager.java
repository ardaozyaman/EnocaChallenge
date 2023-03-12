package enoca.io.demo.business.concretes;

import enoca.io.demo.business.abstracts.ModelService;
import enoca.io.demo.business.requests.model.CreateModelRequest;
import enoca.io.demo.business.responses.model.GetAllModelsResponse;
import enoca.io.demo.core.utilities.mappers.ModelMapperService;
import enoca.io.demo.dataAccess.abstracts.ModelRepository;
import enoca.io.demo.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {
    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllModelsResponse> getAll() {
        List<Model> models = modelRepository.findAll();

        List<GetAllModelsResponse> modelsResponse = models.stream().map(model -> this.modelMapperService.forResponse()
                .map(model, GetAllModelsResponse.class)).collect(Collectors.toList());

        return modelsResponse;
    }

    @Override
    public void add(CreateModelRequest createModelRequest) {
        Model model = this.modelMapperService.forRequest().map(createModelRequest, Model.class);

        this.modelRepository.save(model);
    }
}
