
package BeingsOfTheEarth;

import Default.LivingBeings;

public class Animal extends LivingBeings implements EarthBeing {

    @Override
    public void born() {
        System.out.println("The animal has just been born");
    }

    @Override
    public void grow() {
        System.out.println("The animal is growing");
    }

    @Override
    public void respawn() {
        System.out.println("The animal has just respawned");
    }

    @Override
    public void reproduce() {
        System.out.println("The animal is reproducing");

    }

    @Override
    public void die() {
        System.out.println("The animal just died");
    }
}
