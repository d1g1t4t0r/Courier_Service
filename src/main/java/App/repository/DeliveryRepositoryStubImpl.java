//package App.repository;
//
//import App.model.Delivery;
//import org.springframework.stereotype.Repository;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//public class DeliveryRepositoryStubImpl implements DeliveryRepository{
//    private List<Delivery> source = Arrays.asList();
//    @Override
//    public List<Delivery> getAll() {
//        return source;
//    }
//
//    @Override
//    public Delivery getByID(Integer id) {
//        Delivery finded = null;
//        for(Delivery test : source){
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
//    public Delivery getByStatus(boolean delivered) {
//        Delivery finded = null;
//        for(Delivery test : source){
//            if((test.isDelivered() == delivered)){
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
//    public <S extends Delivery> S save(S s) {
//        return null;
//    }
//
//    @Override
//    public <S extends Delivery> Iterable<S> saveAll(Iterable<S> iterable) {
//        return null;
//    }
//
//    @Override
//    public Optional<Delivery> findById(Integer integer) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Integer integer) {
//        return false;
//    }
//
//    @Override
//    public Iterable<Delivery> findAll() {
//        return null;
//    }
//
//    @Override
//    public Iterable<Delivery> findAllById(Iterable<Integer> iterable) {
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
//    public void delete(Delivery delivery) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Integer> iterable) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Delivery> iterable) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//}
