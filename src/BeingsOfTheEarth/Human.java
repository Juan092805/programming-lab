package BeingsOfTheEarth;
import Default.LivingBeings;
import SkyBeings.SkyBeing;

public class Human extends LivingBeings implements EarthBeing, SkyBeing {
    @Override
    public void born() {
        System.out.println("The human has just been born");
    }

    @Override
    public void grow() {
        System.out.println("The human is growing");
    }

    @Override
    public void respawn() {
        System.out.println("The human just respawn");
    }

    @Override
    public void reproduce() {
        System.out.println("The human is reproducing");
    }

    @Override
    public void die() {
        System.out.println("The human just died");
    }

    @Override
    public void fly() {
        System.out.println("The human is in an airplane");
    }

    @Override
    public void changeDimension() {
        System.out.println("The human is moving to another country");
    }

    @Override
    public void regenerate() {
        System.out.println("The human is regenerating his cells ");
    }

}
