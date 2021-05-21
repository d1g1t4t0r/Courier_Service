package App.repository;

import App.model.Letter;

import java.util.List;

public interface LetterRepository {
    List<Letter> getAll();
    Letter getByStartID(Integer id);
    Letter getByFinishID(Integer id);
}
