package enoca.io.demo.business.abstracts;

import enoca.io.demo.business.requests.brand.CreateBrandRequest;
import enoca.io.demo.business.requests.brand.UpdateBrandRequest;
import enoca.io.demo.business.responses.brand.GetAllBrandsResponse;
import enoca.io.demo.business.responses.brand.GetByIdBrandResponse;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();

    GetByIdBrandResponse getById(int id);

    void add(CreateBrandRequest createBrandRequest);

    void update(UpdateBrandRequest updateBrandRequest);

    void delete(int id);

}
