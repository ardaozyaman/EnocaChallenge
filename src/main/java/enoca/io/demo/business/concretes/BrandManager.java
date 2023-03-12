package enoca.io.demo.business.concretes;

import enoca.io.demo.business.abstracts.BrandService;
import enoca.io.demo.business.requests.brand.CreateBrandRequest;
import enoca.io.demo.business.requests.brand.UpdateBrandRequest;
import enoca.io.demo.business.responses.brand.GetAllBrandsResponse;
import enoca.io.demo.core.utilities.mappers.ModelMapperService;
import enoca.io.demo.dataAccess.abstracts.BrandRepository;
import enoca.io.demo.entities.concretes.Brand;
import enoca.io.demo.business.responses.brand.GetByIdBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;


    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();

        List<GetAllBrandsResponse> brandsResponse = brands.stream().map(brand -> this.modelMapperService.forResponse()
                .map(brand, GetAllBrandsResponse.class)).collect(Collectors.toList());

        return brandsResponse;
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand = this.brandRepository.findById(id).orElseThrow();

        GetByIdBrandResponse response = this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);

        return response;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {


        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);

        this.brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);

        this.brandRepository.save(brand);
    }

    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);
    }
}
