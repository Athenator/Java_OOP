package seminar.One;

public class GunWeapon extends Weapon{

    @Override
    public String getName() {
        
        return "Makarov";
    }

    @Override
    public int getDamage() {
        
        return 10;
    }

    @Override
    public int getFireRate() {
        
        return 30;
    }

    @Override
    public int getChargesNumber() {
        
        return 12;
    }

    @Override
    public String getFireSound() {
       
        return "Пиф";
    }
    
}
