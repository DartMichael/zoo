import animals.Animal;
import animals.Bird;
import animals.Fish;
import animals.Flyable;
import animals.Penguin;
import animals.Shark;
import animals.Sparrow;
import animals.Tiger;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Aviary<Fish> fishAviary = new Aviary<>();
        fishAviary.addAnimal(new Shark("shark"));
        Aviary<Bird> birdAviary = new Aviary<>();
        birdAviary.addAnimal(new Penguin("penguin"));
        birdAviary.addAnimal(new Sparrow("sparrow"));
        Aviary<Animal> allAnimalsAviary = new Aviary<>();
        allAnimalsAviary.addAnimal(new Tiger("tiger"));
        List<Bird> birds = birdAviary.getAnimals();
        List<Fish> fish = fishAviary.getAnimals();
        List<Animal> animals = allAnimalsAviary.getAnimals();
        foodForAnimals(birds);
        foodForAnimals(fish);
        foodForAnimals(animals);
        Zoo zoo = new Zoo();
        zoo.addAviary(allAnimalsAviary);
        zoo.addAviary(birdAviary);
        zoo.addAviary(fishAviary);
        fly(List.of(new Penguin("penguin"), new Sparrow("sparrow")));
        swim(List.of(new Shark("shark")));
    }

    private static void fly(List<Bird> birds) {
        for (Bird bird : birds) {
            if (bird instanceof Flyable) {
                ((Flyable) bird).fly();
            }
        }
    }

    private static void swim(List<Fish> fish) {
        for (Fish animal : fish) {
            animal.swim();
        }
    }

    private static void foodForAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }
}
