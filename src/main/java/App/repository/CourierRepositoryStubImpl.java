package App.repository;

import App.model.Courier;
import App.model.Delivery;

import java.util.*;
import org.springframework.stereotype.Repository;

@Repository

public class CourierRepositoryStubImpl implements CourierRepository {
    private List<Courier> source = Arrays.asList(new Courier("Попов Василий Федорович", 0, new ArrayList<Delivery>()));
    @Override
    public List<Courier> getAll()
    {
        return source;
    }

    @Override
    public Courier getByName(String name)
    {
        Courier finded = null;
        for(Courier test : source){
            if((test.getName() == name)){
                finded = test;

                break;
            }

        }
        return finded;
    }

    @Override
    public Courier getById(Integer id) {
        Courier finded = null;
        for(Courier test : source){
            if((test.getId() == id)){
                finded = test;

                break;
            }

        }
        return finded;
    }

    @Override
    public Courier getByHomeBranch(int index) {
        Courier finded = null;
        for(Courier test : source){
            if((test.getHome_branch_index() == index)){
                finded = test;

                break;
            }

        }
        return finded;
    }
}
