package App.model;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "letters")
public class Letter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "start_id")
    private Branch start;

    @ManyToOne
    @JoinColumn(name = "finish_id")
    private Branch finish;

    @Column(name = "urgency")
    private int urgency;


    public Letter (Branch start, Branch finish, int urgency) {
        this.start = start;
        this.finish= finish;
        this.urgency=urgency;
    }

    public  Letter (){

    }

    public Branch getStart() {
        return start;
    }

    public Branch getFinish() {
        return finish;
    }

    public int getUrgency() {
        return urgency;
    }

    public Integer getId() {
        return id;
    }

    public void setStart(Branch start) {
        this.start = start;
    }

    public void setFinish(Branch finish) {
        this.finish = finish;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter = (Letter) o;
        return Objects.equals(id, letter.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Letter{" +
                "id=" + id +
                ", start_branch='" + start + '\'' +
                ", finish_branch=" + finish +
                ", urgency="+
                '}';
    }
}
