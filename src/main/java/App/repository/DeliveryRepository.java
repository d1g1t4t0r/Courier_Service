package App.repository;

import App.model.Branch;
import App.model.Delivery;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DeliveryRepository extends CrudRepository<Delivery, Integer> {
    /*List<Delivery> getAll();
    Delivery getByID(Integer id);
    Delivery getByStatus(boolean delivered);*/
}
