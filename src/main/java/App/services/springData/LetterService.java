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
public class LetterService {
    @Autowired
    private LetterRepository letterRepository;

    @Autowired
    private BranchRepository branchRepository;

    public void save(LetterDto letterDto){
        var wsOptional1 = branchRepository.findByName(letterDto.getStart().getName());
        var wsOptional2= branchRepository.findByName(letterDto.getFinish().getName());
        if (wsOptional1.isEmpty() || wsOptional2.isEmpty()) {
            return;
        }
        Branch start = wsOptional1.orElse(new Branch());
        Branch finish = wsOptional2.orElse(new Branch());
        letterRepository.save(new Letter(start, finish, letterDto.getUrgency()));
    }
    public Letter getLetter(LetterDto letterDto) {
        var wsOptional1 = branchRepository.findByName(letterDto.getStart().getName());
        var wsOptional2= branchRepository.findByName(letterDto.getFinish().getName());
        if (wsOptional1.isEmpty() || wsOptional2.isEmpty()) {
            return null;
        }
        Branch start = wsOptional1.orElse(new Branch());
        Branch finish = wsOptional2.orElse(new Branch());
        return new Letter(start, finish, letterDto.getUrgency());
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
