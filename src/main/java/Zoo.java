import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Aviary> aviaries = new ArrayList<>();

    public void addAviary(Aviary aviary) {
        aviaries.add(aviary);
    }

    public List<Aviary> getAviaries() {
        return aviaries;
    }

    public void setAviaries(List<Aviary> aviaries) {
        this.aviaries = aviaries;
    }
}
