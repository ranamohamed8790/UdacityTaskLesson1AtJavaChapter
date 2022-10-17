package interfaceAndClass;

public class Chicken extends Animal implements Edible{
    @Override
    public String howToEat() {
        return "Chicken: Fry it\n" ;
    }

    @Override
    String sound() {
        return "Chicken: CoCO\n";
    }
}

