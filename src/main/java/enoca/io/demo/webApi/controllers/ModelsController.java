package enoca.io.demo.webApi.controllers;

import enoca.io.demo.business.abstracts.ModelService;
import enoca.io.demo.business.requests.model.CreateModelRequest;
import enoca.io.demo.business.responses.model.GetAllModelsResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {
    private ModelService modelService;

    @GetMapping()
    public List<GetAllModelsResponse> getAll() {
        return modelService.getAll();
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() CreateModelRequest createModelRequest) {
        this.modelService.add(createModelRequest);
    }
}
