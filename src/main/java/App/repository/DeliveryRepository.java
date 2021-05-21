package App.repository;

import App.model.Delivery;

import java.util.List;

public interface DeliveryRepository {
    List<Delivery> getAll();
    Delivery getByID(Integer id);
    Delivery getByStatus(boolean delivered);
}
