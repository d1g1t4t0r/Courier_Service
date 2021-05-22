package App.repository;

import App.model.Branch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BranchRepository extends CrudRepository<Branch, Integer> {
   /* List<Branch> getAll();
    Branch getByIndex(int index);
    Branch getByName(String name);*/
}
