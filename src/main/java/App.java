import animals.Animal;
import animals.Bird;
import animals.Fish;
import animals.Flyable;
import animals.Penguin;
import animals.Shark;
import animals.Sparrow;
import animals.Swimmable;
import animals.Tiger;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Shark shark = new Shark("shark");
        Sparrow sparrow = new Sparrow("sparrow");
        Tiger tiger = new Tiger("tiger");
        Penguin penguin = new Penguin("penguin");
        Aviary<Animal> animalAviary = new Aviary<>();
        animalAviary.addAnimal(penguin);
        animalAviary.addAnimal(sparrow);
        animalAviary.addAnimal(tiger);
        animalAviary.addAnimal(shark);
        Aviary<Fish> fishAviary = new Aviary<>();
        fishAviary.addAnimal(shark);
        Aviary<Bird> birdAviary = new Aviary<>();
        birdAviary.addAnimal(penguin);
        birdAviary.addAnimal(sparrow);
        Aviary<Flyable> flyingAnimalsAviary = new Aviary<>();
        flyingAnimalsAviary.addAnimal(sparrow);
        List<Flyable> flyingAnimals = flyingAnimalsAviary.getAnimals();
        Aviary<Swimmable> swimmingAnimalsAviary = new Aviary<>();
        swimmingAnimalsAviary.addAnimal(shark);
        swimmingAnimalsAviary.addAnimal(penguin);
        List<Swimmable> swimmingAnimals = swimmingAnimalsAviary.getAnimals();
        fly(flyingAnimals);
        swim(swimmingAnimals);
        List<Animal> animals = animalAviary.getAnimals();
        foodForAnimals(animals);
        Zoo zoo = new Zoo();
        zoo.addAviary(animalAviary);
        zoo.addAviary(birdAviary);
        zoo.addAviary(fishAviary);
    }

    private static void fly(List<Flyable> animals) {
        for (Flyable animal : animals) {
            animal.fly();
        }
    }

    private static void swim(List<Swimmable> animals) {
        for (Swimmable animal : animals) {
            animal.swim();
        }
    }

    private static void foodForAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }
}
