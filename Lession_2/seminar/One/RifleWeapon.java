package seminar.One;

public class RifleWeapon extends Weapon{
    @Override
    public String getName() {
        
        return "AWP";
    }

    @Override
    public int getDamage() {
        
        return 100;
    }

    @Override
    public int getFireRate() {
        
        return 1;
    }

    @Override
    public int getChargesNumber() {
        
        return 6;
    }

    @Override
    public String getFireSound() {
       
        return "Пау";
    }
}
