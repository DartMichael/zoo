import animals.Flyable;
import java.util.ArrayList;
import java.util.List;

public class Aviary<A> {
    private List<A> animals = new ArrayList<>();
    private List<Flyable> flyableAviary = new ArrayList<>();

    public void addAnimal(A animal) {
        animals.add(animal);
    }

    public void addFlyableAnimal(Flyable animal) {
        flyableAviary.add(animal);
    }

    public List<A> getAnimals() {
        return animals;
    }

    public void setAnimals(List<A> animals) {
        this.animals = animals;
    }

    public List<Flyable> getFlyableAviary() {
        return flyableAviary;
    }

    public void setFlyableAviary(List<Flyable> flyableAviary) {
        this.flyableAviary = flyableAviary;
    }
}
