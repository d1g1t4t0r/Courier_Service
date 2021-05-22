//package App.repository;
//import App.model.Letter;
//import org.springframework.stereotype.Repository;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//
//public class LetterRepositoryStubImpl implements LetterRepository {
//    private List<Letter> source = Arrays.asList();
//
//    @Override
//    public List<Letter> getAll() {
//        return source;
//    }
//
//    @Override
//    public Letter getByStartID(Integer id) {
//        Letter finded = null;
//        for(Letter test : source){
//            if((test.getStart().getId() == id)){
//                finded = test;
//
//                break;
//            }
//
//        }
//        return finded;
//    }
//
//    @Override
//    public Letter getByFinishID(Integer id) {
//        Letter finded = null;
//        for(Letter test : source){
//            if((test.getFinish().getId() == id)){
//                finded = test;
//
//                break;
//            }
//
//        }
//        return finded;
//    }
//
//    @Override
//    public <S extends Letter> S save(S s) {
//        return null;
//    }
//
//    @Override
//    public <S extends Letter> Iterable<S> saveAll(Iterable<S> iterable) {
//        return null;
//    }
//
//    @Override
//    public Optional<Letter> findById(Integer integer) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Integer integer) {
//        return false;
//    }
//
//    @Override
//    public Iterable<Letter> findAll() {
//        return null;
//    }
//
//    @Override
//    public Iterable<Letter> findAllById(Iterable<Integer> iterable) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Integer integer) {
//
//    }
//
//    @Override
//    public void delete(Letter letter) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Integer> iterable) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Letter> iterable) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//}
