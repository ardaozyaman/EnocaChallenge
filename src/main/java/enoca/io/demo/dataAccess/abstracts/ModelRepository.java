package enoca.io.demo.dataAccess.abstracts;

import enoca.io.demo.entities.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Integer> {
}
