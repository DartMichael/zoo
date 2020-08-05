package animals;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<animals.Aviary> aviaries = new ArrayList<>();

    public void addAviary(animals.Aviary aviary){
        aviaries.add(aviary);
    }

    public List<animals.Aviary> getAviaries() {
        return aviaries;
    }

    public void setAviaries(List<animals.Aviary> aviaries) {
        this.aviaries = aviaries;
    }
}
