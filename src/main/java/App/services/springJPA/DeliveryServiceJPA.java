package App.services.springJPA;

import App.dto.BranchDto;
import App.dto.DeliveryDto;
import App.dto.LetterDto;
import App.model.Branch;
import App.model.Delivery;
import App.model.Letter;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class DeliveryServiceJPA {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void save(DeliveryDto deliveryDto, LetterServiceJPA letterServiceJPA){

        TypedQuery<Branch> currentTypedQuery = em.createQuery("select branch from Branch branch where branch.name = :name", Branch.class).setParameter("name", deliveryDto.getCurrent().getName());
        Branch current = currentTypedQuery.getSingleResult();
        TypedQuery<Branch> nextTypedQuery = em.createQuery("select branch from Branch branch where branch.name = :name", Branch.class).setParameter("name", deliveryDto.getNext().getName());
        Branch finish = nextTypedQuery.getSingleResult();
        em.persist(new Delivery(current, finish, deliveryDto.getDelivery_time(), letterServiceJPA.getLetter(deliveryDto.getLetter()), deliveryDto.isDelivered()));
    }


    public List<DeliveryDto> listAll() {
        List<DeliveryDto> result = new ArrayList<>();
        TypedQuery<Delivery> deliveries = em.createQuery("select delivery from Delivery delivery", Delivery.class);
        for (var d: deliveries.getResultList()){
            result.add(new DeliveryDto(new BranchDto(d.getCurrent()), new BranchDto(d.getNext()), d.getDelivery_time(), new LetterDto(d.getLetter()), d.isDelivered()));
        }
        return result;
    }

    public DeliveryDto get(Integer id) {
        Delivery delivery = em.find(Delivery.class, id);
        return delivery != null ? new DeliveryDto(delivery) : null;
    }

    public void delete(Integer id){
        Delivery delivery = em.find(Delivery.class, id);
        if(delivery != null)
            em.remove(delivery);
    }
}
