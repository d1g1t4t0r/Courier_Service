package App.repository;

import App.domain.Branch;
import App.domain.Courier;
import App.domain.Delivery;

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
    public Courier getById(UUID id) {
        Courier finded = null;
        for(Courier test : source){
            if((test.getUuid() == id)){
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
