package App.services;


import App.dto.LetterDto;
import App.model.Branch;
import App.model.Courier;
import App.model.Letter;
import App.repository.*;

import App.services.springData.LetterService;
import App.services.springJPA.LetterServiceJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DayService {
    @Autowired
    BranchRepository branchRepository;
    @Autowired
    CourierRepository courierRepository;
    @Autowired
    LetterRepository letterRepository;
    @Autowired
    DeliveryRepository deliveryRepository;

    List<Branch> branches;

    public void start(LetterService letterService, LetterServiceJPA lsjpa) {
        branches  = branchRepository.findAll();
        for (int i = 540; i<= 1080; i++) {

            if (i%30==0) {
                System.out.println(Libs.Int_To_Time.getTime(i));
            }
        }

        LetterDto letter = new LetterDto(new Letter(branches.get(0),branches.get(1), 18));

        System.out.println(letterRepository.findByStartId(1));
        System.out.println("----------------");
        //letterService.save(letter);
        lsjpa.save(letter);
        //lsjpa.get(15);
        //letterService.delete(letterService.listAll().size()-1);
        //letterService.delete(0);
        System.out.println(letterRepository.findAll());
        /*for(Branch b: branchRepository.getAll()) {
            System.out.println(b);
        }
        for(Courier c: courierRepository.getAll()) {
            System.out.println(c);
        }*/
    }

}
