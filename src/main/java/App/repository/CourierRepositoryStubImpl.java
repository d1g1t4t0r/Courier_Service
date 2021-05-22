//package App.repository;
//
//import App.model.Courier;
//import App.model.Delivery;
//
//import java.util.*;
//import org.springframework.stereotype.Repository;
//
//
//public class CourierRepositoryStubImpl implements CourierRepository {
//    private List<Courier> source = Arrays.asList(new Courier("Попов Василий Федорович", 0, new ArrayList<Delivery>()));
//    @Override
//    public List<Courier> getAll()
//    {
//        return source;
//    }
//
//    @Override
//    public Courier getByName(String name)
//    {
//        Courier finded = null;
//        for(Courier test : source){
//            if((test.getName() == name)){
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
//    public Courier getById(Integer id) {
//        Courier finded = null;
//        for(Courier test : source){
//            if((test.getId() == id)){
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
//    public Courier getByHomeBranch(int index) {
//        Courier finded = null;
//        for(Courier test : source){
//            if((test.getHome_branch_index() == index)){
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
//    public <S extends Courier> S save(S s) {
//        return null;
//    }
//
//    @Override
//    public <S extends Courier> Iterable<S> saveAll(Iterable<S> iterable) {
//        return null;
//    }
//
//    @Override
//    public Optional<Courier> findById(Integer integer) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Integer integer) {
//        return false;
//    }
//
//    @Override
//    public Iterable<Courier> findAll() {
//        return null;
//    }
//
//    @Override
//    public Iterable<Courier> findAllById(Iterable<Integer> iterable) {
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
//    public void delete(Courier courier) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Integer> iterable) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Courier> iterable) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//}
