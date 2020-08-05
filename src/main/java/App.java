import animals.*;

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
        List<Bird> birdAviaryAnimals = birdAviary.getAnimals();
        for (Bird animal: birdAviaryAnimals){
            animal.eat();
        }
        List<Fish> fishAviaryAnimals = fishAviary.getAnimals();
        for (Fish fish : fishAviaryAnimals){
            fish.eat();
        }
        List<Animal> animals = allAnimalsAviary.getAnimals();
        for (Animal animal : animals){
            animal.eat();
        }
        Zoo zoo = new Zoo();
        zoo.addAviary(allAnimalsAviary);
        zoo.addAviary(birdAviary);
        zoo.addAviary(fishAviary);
    }
}
