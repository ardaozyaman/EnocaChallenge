package enoca.io.demo.dataAccess.abstracts;

import enoca.io.demo.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
