package App.services.springJPA;

import App.dto.BranchDto;
import App.dto.LetterDto;
import App.model.Branch;
import App.model.Letter;
import App.repository.BranchRepository;
import App.repository.LetterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LetterServiceJPA {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void save(LetterDto letterDto){

        TypedQuery<Branch> startTypedQuery = em.createQuery("select branch from Branch branch where branch.name = :name", Branch.class).setParameter("name", letterDto.getStart().getName());
        Branch start = startTypedQuery.getSingleResult();
        TypedQuery<Branch> finishTypedQuery = em.createQuery("select branch from Branch branch where branch.name = :name", Branch.class).setParameter("name", letterDto.getFinish().getName());
        Branch finish = finishTypedQuery.getSingleResult();
        em.persist(new Letter(start, finish, letterDto.getUrgency()));
    }

    public Letter getLetter(LetterDto letterDto){

        TypedQuery<Branch> startTypedQuery = em.createQuery("select branch from Branch branch where branch.name = :name", Branch.class).setParameter("name", letterDto.getStart().getName());
        Branch start = startTypedQuery.getSingleResult();
        TypedQuery<Branch> finishTypedQuery = em.createQuery("select branch from Branch branch where branch.name = :name", Branch.class).setParameter("name", letterDto.getFinish().getName());
        Branch finish = finishTypedQuery.getSingleResult();
        return new Letter(start, finish, letterDto.getUrgency());
    }

    public List<LetterDto> listAll() {
        List<LetterDto> result = new ArrayList<>();
        TypedQuery<Letter> letters = em.createQuery("select letter from Letter letter", Letter.class);
        for (var l: letters.getResultList()){
            result.add(new LetterDto(new BranchDto(l.getStart()), new BranchDto(l.getFinish()), l.getUrgency()));
        }
        return result;
    }

    public LetterDto get(Integer id) {
        Letter letter = em.find(Letter.class, id);
        return letter != null ? new LetterDto(letter) : null;
    }

    public void delete(Integer id){
        Letter letter = em.find(Letter.class, id);
        if(letter != null)
            em.remove(letter);
    }
}
