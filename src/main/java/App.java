import animals.Animal;
import animals.Bird;
import animals.Fish;
import animals.Penguin;
import animals.Shark;
import animals.Sparrow;
import animals.Tiger;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Aviary<Fish> fishAviary = new Aviary<>();
        fishAviary.addAnimal(new Shark());
        Aviary<Bird> birdAviary = new Aviary<>();
        birdAviary.addAnimal(new Penguin());
        birdAviary.addAnimal(new Sparrow());
        Aviary<Animal> allAnimalsAviary = new Aviary<>();
        allAnimalsAviary.addAnimal(new Tiger());
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
    }

    private static void foodForAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

}
