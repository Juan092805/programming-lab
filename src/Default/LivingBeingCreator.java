package Default;

import BeingsOfTheEarth.Animal;
import BeingsOfTheEarth.Human;
import SkyBeings.Bird;

public class LivingBeingCreator implements Creator {

    @Override
    public LivingBeings createLivingBeings(String x) {
        if (x.equals("Human")){
            return new Human();
        }else if (x.equals("Bird")){
            return new Bird();
        }else if (x.equals("Animal")){
            return new Animal();
        }
        return null;

    }

}
