package SkyBeings;

import Default.LivingBeings;

public class Bird extends LivingBeings implements SkyBeing {
    @Override
    public void born() {
        System.out.println("The bird has just been born");
    }

    @Override
    public void grow() {
        System.out.println("The bird is growing");
    }

    @Override
    public void reproduce() {
        System.out.println("The bird is reproducing");
    }

    @Override
    public void die() {
        System.out.println("The bird just died");
    }

    @Override
    public void fly() {
        System.out.println("The bird is flying");
    }

    @Override
    public void changeDimension() {
        System.out.println("The bird its moving to another country");
    }

    @Override
    public void regenerate() {
        System.out.println("The bird is regenerating his cells");
    }
}
