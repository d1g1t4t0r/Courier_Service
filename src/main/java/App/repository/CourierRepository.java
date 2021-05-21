package App.repository;

import App.model.Courier;

import java.util.List;

public interface CourierRepository {
    List<Courier> getAll();
    Courier getById(Integer id);
    Courier getByName(String name);
    Courier getByHomeBranch(int index);
}
