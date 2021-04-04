package App.services;


import App.domain.Branch;
import App.domain.Courier;
import App.domain.Delivery;
import App.domain.Letter;
import App.repository.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void start() {
        for (int i = 540; i<= 1080; i++) {

            if (i%30==0) {
                System.out.println(Libs.Int_To_Time.getTime(i));
            }
        }
        for(Branch b: branchRepository.getAll()) {
            System.out.println(b);
        }
        for(Courier c: courierRepository.getAll()) {
            System.out.println(c);
        }
    }
}
