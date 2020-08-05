package animals;

public interface Flyable {
    default void fly() {
        System.out.println("Look at me! I am flying!");
    }
}
