package App.repository;
import App.model.Letter;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository

public class LetterRepositoryStubImpl implements LetterRepository {
    private List<Letter> source = Arrays.asList();

    @Override
    public List<Letter> getAll() {
        return source;
    }

    @Override
    public Letter getByStartID(Integer id) {
        Letter finded = null;
        for(Letter test : source){
            if((test.getStart().getId() == id)){
                finded = test;

                break;
            }

        }
        return finded;
    }

    @Override
    public Letter getByFinishID(Integer id) {
        Letter finded = null;
        for(Letter test : source){
            if((test.getFinish().getId() == id)){
                finded = test;

                break;
            }

        }
        return finded;
    }
}
