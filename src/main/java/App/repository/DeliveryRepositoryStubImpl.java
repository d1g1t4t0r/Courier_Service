package App.repository;

import App.domain.Delivery;
import App.domain.Letter;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class DeliveryRepositoryStubImpl implements DeliveryRepository{
    private List<Delivery> source = Arrays.asList();
    @Override
    public List<Delivery> getAll() {
        return source;
    }

    @Override
    public Delivery getByID(UUID id) {
        Delivery finded = null;
        for(Delivery test : source){
            if((test.getUuid() == id)){
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
