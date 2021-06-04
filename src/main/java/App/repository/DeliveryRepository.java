package App.repository;

import App.model.Branch;
import App.model.Delivery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryRepository extends CrudRepository<Delivery, Integer> {
    /*List<Delivery> getAll();
    Delivery getByID(Integer id);
    Delivery getByStatus(boolean delivered);*/
}
