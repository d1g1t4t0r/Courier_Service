package App.services.springData;

import App.dto.BranchDto;
import App.dto.DeliveryDto;
import App.dto.LetterDto;
import App.model.Branch;
import App.model.Delivery;
import App.model.Letter;
import App.repository.BranchRepository;
import App.repository.DeliveryRepository;
import App.repository.LetterRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DeliveryService {
    @Autowired
    private DeliveryRepository deliveryRepository;
    @Autowired
    private LetterRepository letterRepository;

    @Autowired
    private BranchRepository branchRepository;


    public void save(DeliveryDto deliveryDto, LetterService letterService){
        var wsOptional1 = branchRepository.findByName(deliveryDto.getCurrent().getName());
        var wsOptional2= branchRepository.findByName(deliveryDto.getNext().getName());
        if (wsOptional1.isEmpty() || wsOptional2.isEmpty()) {
            return;
        }
        Branch current = wsOptional1.orElse(new Branch());
        Branch next = wsOptional2.orElse(new Branch());
        deliveryRepository.save(new Delivery(current, next, deliveryDto.getDelivery_time(), letterService.getLetter(deliveryDto.getLetter()), deliveryDto.isDelivered()));
    }

    public List<LetterDto> listAll() {
        List<LetterDto> result = new ArrayList<>();
        for (var l: letterRepository.findAll()){
            result.add(new LetterDto(new BranchDto(l.getStart()), new BranchDto(l.getFinish()), l.getUrgency()));
        }
        return result;
    }

    public LetterDto get(Integer id) {
        Optional<Letter> letterOptional = letterRepository.findById(id);
        return  letterOptional.map(LetterDto::new).orElse(null);
    }

    public void delete(Integer id){
        letterRepository.deleteById(id);
    }
}
