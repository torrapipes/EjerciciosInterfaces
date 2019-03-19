package turtle;

public interface Swimmable {

    // An abstract method

    void swim();

    // A static convenience method

    public static void letThemSwim(Swimmable[] list) {

        for (int i = 0; i < list.length; i++) {

            list[i].swim();

        }

    }

}
