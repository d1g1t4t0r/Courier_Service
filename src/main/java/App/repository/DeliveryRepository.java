package App.repository;

import App.domain.Delivery;
import App.domain.Letter;

import java.util.List;
import java.util.UUID;

public interface DeliveryRepository {
    List<Delivery> getAll();
    Delivery getByID(UUID id);
    Delivery getByStatus(boolean delivered);
}
