package App.repository;

import App.domain.Letter;

import java.util.List;
import java.util.UUID;

public interface LetterRepository {
    List<Letter> getAll();
    Letter getByStartID(UUID id);
    Letter getByFinishID(UUID id);
}
