package App.domain;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;


public class Branch
{
    private String name;

    private String address;

    private UUID uuid = UUID.randomUUID();



    public Branch (String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return Objects.equals(uuid, branch.uuid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uuid);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

}