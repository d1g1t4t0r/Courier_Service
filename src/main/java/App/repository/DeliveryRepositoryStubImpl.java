package App.repository;

import App.model.Delivery;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class DeliveryRepositoryStubImpl implements DeliveryRepository{
    private List<Delivery> source = Arrays.asList();
    @Override
    public List<Delivery> getAll() {
        return source;
    }

    @Override
    public Delivery getByID(Integer id) {
        Delivery finded = null;
        for(Delivery test : source){
            if((test.getId() == id)){
                finded = test;

                break;
            }

        }
        return finded;
    }

    @Override
    public Delivery getByStatus(boolean delivered) {
        Delivery finded = null;
        for(Delivery test : source){
            if((test.isDelivered() == delivered)){
                finded = test;

                break;
            }

        }
        return finded;
    }
}
