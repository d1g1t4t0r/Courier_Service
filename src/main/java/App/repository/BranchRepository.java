package App.repository;

import App.model.Branch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BranchRepository extends CrudRepository<Branch, Integer> {
    List<Branch> findAll();
    /*Branch getByIndex(int index);*/
    Optional<Branch> findByName(String name);
}
