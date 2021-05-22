package App.repository;

import App.model.Branch;
import App.model.Courier;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourierRepository extends CrudRepository<Courier, Integer> {
   /* List<Courier> getAll();
    Courier getById(Integer id);
    Courier getByName(String name);
    Courier getByHomeBranch(int index);*/
}
