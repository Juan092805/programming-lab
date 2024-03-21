package Default;

import BeingsOfTheEarth.Human;
import SkyBeings.Bird;
import BeingsOfTheEarth.Animal;
public class Main {

    public static void main(String[] args) {

        LivingBeingCreator creator = new LivingBeingCreator();

        Human human1 = (Human) creator.createLivingBeings("Human");// (Human) castear el dato, modoficar la variable siempre q sea posible

        human1.born();
        human1.fly();
        human1.grow();
        Bird bird2 = (Bird) creator.createLivingBeings("Bird");
        bird2.born();
        bird2.fly();
        bird2.grow();
        Animal animal3 = (Animal) creator.createLivingBeings("Animal");
        animal3.born();
        animal3.reproduce();
        animal3.grow();

    }
}
