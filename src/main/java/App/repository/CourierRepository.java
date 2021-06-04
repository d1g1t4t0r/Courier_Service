package App.repository;

import App.model.Branch;
import App.model.Courier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourierRepository extends CrudRepository<Courier, Integer> {
    List<Courier> findAll();
    Optional<Courier> getById(Integer id);
    Optional<Courier> getByName(String name);
    List<Courier> getByHomeBranch(int index);
}
