package App.repository;

import App.domain.Branch;

import java.util.List;

public interface BranchRepository {
    List<Branch> getAll();
    Branch getByIndex(int index);
    Branch getByName(String name);
}
