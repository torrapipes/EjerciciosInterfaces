package turtle;

public class Turtle implements Walkable, Swimmable {

    private String name;
    public Turtle(String name) {
        this.name = name;
    }
    // Adding a bite() method to the turtle.Turtle class
    public void bite() {
        System.out.println(name + " (a turtle) is biting.");
    }
    // Implementation for the walk() method of the turtle.Walkable interface
    public void walk() {
        System.out.println(name + " (a turtle) is walking.");
    }
    // Implementation for the swim() method of the turtle.Swimmable interface
    public void swim() {
        System.out.println(name + " (a turtle) is swimming.");

    }

}
