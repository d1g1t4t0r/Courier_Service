package App.dto;


import App.model.Branch;
import App.model.Letter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "letters")
public class LetterDto {

    private BranchDto start;

    private BranchDto finish;

    private int urgency;


    public LetterDto(BranchDto start, BranchDto finish, int urgency) {
        start = this.start;
        finish = this.finish;
        urgency = this.urgency;
    }
    public LetterDto(Letter letter) {
        start = new BranchDto(letter.getStart());
        finish =new BranchDto(letter.getFinish());
        urgency = letter.getUrgency();
    }
    public BranchDto getStart() {
        return start;
    }

    public BranchDto getFinish() {
        return finish;
    }

    public int getUrgency() {
        return urgency;
    }


    public void setStart(BranchDto start) {
        this.start = start;
    }

    public void setFinish(BranchDto finish) {
        this.finish = finish;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }


    @Override
    public String toString() {
        return "Letter{" +
                ", start_branch='" + start + '\'' +
                ", finish_branch=" + finish +
                ", urgency= "+ urgency +
                '}';
    }
}
