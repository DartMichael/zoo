package animals;

import java.util.ArrayList;
import java.util.List;

public class Aviary<A extends Animal> {
    private List<A> animals = new ArrayList<>();

    public void addAnimal(A animal){
        animals.add(animal);
    }

    public List<A> getAnimals() {
        return animals;
    }

    public void setAnimals(List<A> animals) {
        this.animals = animals;
    }
}
