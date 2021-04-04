package App.domain;


import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Letter {

    private Branch start;

    private Branch finish;

    private int urgency;
    private UUID uuid = UUID.randomUUID();

    public Letter (Branch start, Branch finish, int urgency) {
        start = this.start;
        finish = this.finish;
        urgency = this.urgency;
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

    public UUID getUuid() {
        return uuid;
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
        return Objects.equals(uuid, letter.uuid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uuid);
    }

    @Override
    public String toString() {
        return "Letter{" +
                "uuid=" + uuid +
                ", start_branch='" + start + '\'' +
                ", finish_branch=" + finish +
                ", urgency="+
                '}';
    }
}
