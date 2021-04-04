package App.simulation;

import App.domain.Courier;
import App.services.DayService;
import App.repository.BranchRepositoryStubImpl;

import java.util.List;

public class Day_sim {
    private BranchRepositoryStubImpl branches;
    private List<Courier> couriers;
    private static DayService dayService = new DayService();
    /*public static void main (String[] args) {
        dayService.start();
    }*/
}
