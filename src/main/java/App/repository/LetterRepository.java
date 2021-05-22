package App.repository;

import App.model.Branch;
import App.model.Letter;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LetterRepository extends CrudRepository<Letter, Integer> {
    /*List<Letter> getAll();
    Letter getByStartID(Integer id);
    Letter getByFinishID(Integer id);*/
}
