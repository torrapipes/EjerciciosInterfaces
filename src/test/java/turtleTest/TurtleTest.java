package turtleTest;

import turtle.Swimmable;
import turtle.Turtle;
import turtle.Walkable;

public class TurtleTest {

    public static void main(String[] args) {

        Turtle turti = new Turtle("Turti");
        // Using turtle.Turtle type as turtle.Turtle, turtle.Walkable and turtle.Swimmable
        letItBite(turti);
        letItWalk(turti);
        letItSwim(turti);
    }
    public static void letItBite(Turtle t) {
        t.bite();
    }
    public static void letItWalk(Walkable w) {
        w.walk();
    }
    public static void letItSwim(Swimmable s) {
        s.swim();;
    }

}
