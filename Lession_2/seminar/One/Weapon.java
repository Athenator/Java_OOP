package seminar.One;

public abstract class Weapon {
    public abstract String getName();
    public abstract int getDamage();
    public abstract int getFireRate();
    public abstract int getChargesNumber();
    public abstract String getFireSound();
    public void fire () {
        System.out.println(getFireSound());
    }
    
}
