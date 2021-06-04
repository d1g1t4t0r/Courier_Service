package App.services.springData;

import App.dto.BranchDto;
import App.dto.LetterDto;
import App.model.Branch;
import App.model.Letter;
import App.repository.BranchRepository;
import App.repository.LetterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BranchService {

    @Autowired
    private BranchRepository branchRepository;

    public void save(BranchDto branchDto){
        branchRepository.save(new Branch(branchDto.getName(), branchDto.getAddress()));
    }

    public List<BranchDto> listAll() {
        List<BranchDto> result = new ArrayList<>();
        for (var b: branchRepository.findAll()){
            result.add(new BranchDto(b.getName(), b.getAddress()));
        }
        return result;
    }

    public BranchDto get(Integer id) {
        Optional<Branch> branchOptional = branchRepository.findById(id);
        return  branchOptional.map(BranchDto::new).orElse(null);
    }

    public void delete(Integer id){
        branchRepository.deleteById(id);
    }
}
