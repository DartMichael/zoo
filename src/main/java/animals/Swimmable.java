package animals;

public interface Swimmable {
    default void swim(){
        System.out.println("Look at me! I am swimming!");
    }
}
