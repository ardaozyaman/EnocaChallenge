package enoca.io.demo.webApi.controllers;

import enoca.io.demo.business.abstracts.BrandService;
import enoca.io.demo.business.requests.brand.CreateBrandRequest;
import enoca.io.demo.business.requests.brand.UpdateBrandRequest;
import enoca.io.demo.business.responses.brand.GetAllBrandsResponse;
import enoca.io.demo.business.responses.brand.GetByIdBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

// http://localhost:8080/swagger-ui/index.html ile end pointlere ulaşabilirsiniz
@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
    private BrandService brandService;

    @GetMapping()
    public List<GetAllBrandsResponse> getAll() {
        return brandService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdBrandResponse getBydId(@PathVariable int id) {
        return brandService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() CreateBrandRequest createBrandRequest) {
        this.brandService.add(createBrandRequest);
    }

    @PutMapping()
    public void update(@RequestBody() UpdateBrandRequest updateBrandRequest) {
        this.brandService.update(updateBrandRequest);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        this.brandService.delete(id);
    }
}
