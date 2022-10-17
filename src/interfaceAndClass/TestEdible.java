package interfaceAndClass;

public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Orange(), new Apple(), new Chicken(), new Tiger()};
        for (int i=0; i < objects.length; i++) {
            if (objects [i] instanceof Edible){
              // Edible e = (Edible) objects[i];

                System.out.println(((Edible) objects[i]).howToEat());
            }

          if (objects [i] instanceof Animal){
              //Animal a = (Animal) objects[i];
              System.out.println(((Animal) objects[i]).sound());
            }

        }

    }
}
