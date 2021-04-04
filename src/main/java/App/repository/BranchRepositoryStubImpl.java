package App.repository;

import App.domain.Branch;
import App.domain.Courier;
import App.domain.Letter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class BranchRepositoryStubImpl implements BranchRepository
{
    private List<Branch> source = Arrays.asList(new Branch("Шарбол","ул. Дзержинского, д.11"),new Branch("Фикси-ко","ул. Колотушкина, д.13"),new Branch("Колхоз","ул. Агрономов, д.69"));
    @Override
    public List<Branch> getAll()
    {
        return source;
    }

    @Override
    public Branch getByName(String name)
    {
        Branch finded = null;
        for(Branch test : source){
            if((test.getName() == name)){
                finded = test;

                break;
            }

        }
        return finded;
    }

    @Override
    public Branch getByIndex(int index) { return source.get(index); }
}