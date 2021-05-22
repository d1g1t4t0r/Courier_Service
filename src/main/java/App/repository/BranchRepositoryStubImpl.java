//package App.repository;
//
//import App.model.Branch;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.stereotype.Repository;
//
//
//public class BranchRepositoryStubImpl implements BranchRepository
//{
//    private List<Branch> source = Arrays.asList(new Branch("Шарбол","ул. Дзержинского, д.11"),new Branch("Фикси-ко","ул. Колотушкина, д.13"),new Branch("Колхоз","ул. Агрономов, д.69"));
//    @Override
//    public List<Branch> getAll()
//    {
//        return source;
//    }
//
//    @Override
//    public Branch getByName(String name)
//    {
//        Branch finded = null;
//        for(Branch test : source){
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
//    public Branch getByIndex(int index) { return source.get(index); }
//
//    @Override
//    public <S extends Branch> S save(S s) {
//        return null;
//    }
//
//    @Override
//    public <S extends Branch> Iterable<S> saveAll(Iterable<S> iterable) {
//        return null;
//    }
//
//    @Override
//    public Optional<Branch> findById(Integer integer) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Integer integer) {
//        return false;
//    }
//
//    @Override
//    public Iterable<Branch> findAll() {
//        return null;
//    }
//
//    @Override
//    public Iterable<Branch> findAllById(Iterable<Integer> iterable) {
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
//    public void delete(Branch branch) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Integer> iterable) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Branch> iterable) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//}