package seminar.One;

public class ShotgunWeapon  extends Weapon{
    @Override
    public String getName() {
        
        return "Берет";
    }

    @Override
    public int getDamage() {
        
        return 50;
    }

    @Override
    public int getFireRate() {
        
        return 5;
    }

    @Override
    public int getChargesNumber() {
        
        return 1;
    }

    @Override
    public String getFireSound() {
       
        return "Бабах!!!";
    }
}
