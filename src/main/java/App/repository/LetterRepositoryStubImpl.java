package App.repository;
import App.domain.Courier;
import App.domain.Letter;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository

public class LetterRepositoryStubImpl implements LetterRepository {
    private List<Letter> source = Arrays.asList();

    @Override
    public List<Letter> getAll() {
        return source;
    }

    @Override
    public Letter getByStartID(UUID id) {
        Letter finded = null;
        for(Letter test : source){
            if((test.getStart().getUuid() == id)){
                finded = test;

                break;
            }

        }
        return finded;
    }

    @Override
    public Letter getByFinishID(UUID id) {
        Letter finded = null;
        for(Letter test : source){
            if((test.getFinish().getUuid() == id)){
                finded = test;

                break;
            }

        }
        return finded;
    }
}
