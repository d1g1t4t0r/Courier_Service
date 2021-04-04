package App.repository;

import App.domain.Courier;

import java.util.List;
import java.util.UUID;

public interface CourierRepository {
    List<Courier> getAll();
    Courier getById(UUID id);
    Courier getByName(String name);
    Courier getByHomeBranch(int index);
}
