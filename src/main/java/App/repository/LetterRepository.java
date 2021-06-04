package App.repository;

import App.model.Branch;
import App.model.Letter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LetterRepository extends CrudRepository<Letter, Integer> {
    List<Letter> findAll();
    List<Letter> findByStartId(Integer id);
    List<Letter> findByFinishId(Integer id);
}
