package animals;

public interface SameAbilities {
    default void eat() {
        System.out.println("Do not look at me! I am eating!");
    }
}
