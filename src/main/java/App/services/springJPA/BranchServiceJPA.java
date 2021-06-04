package App.services.springJPA;

import App.dto.BranchDto;
import App.dto.LetterDto;
import App.model.Branch;
import App.model.Letter;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class BranchServiceJPA {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void save(BranchDto branchDto){
        em.persist(new Branch(branchDto.getName(), branchDto.getAddress()));
    }

    public List<BranchDto> listAll() {
        List<BranchDto> result = new ArrayList<>();
        TypedQuery<Branch> branches = em.createQuery("select branch from Branch branch", Branch.class);
        for (var b: branches.getResultList()){
            result.add(new BranchDto(b.getName(), b.getAddress()));
        }
        return result;
    }

    public BranchDto get(Integer id) {
        Branch branch = em.find(Branch.class, id);
        return branch != null ? new BranchDto(branch) : null;
    }

    public void delete(Integer id){
        Branch branch = em.find(Branch.class, id);
        if(branch != null)
            em.remove(branch);
    }
}
