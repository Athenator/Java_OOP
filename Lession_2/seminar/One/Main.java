package seminar.One;

public class Main {
    public static void main(String[] args) {
        GunWeapon g = new GunWeapon();
        RifleWeapon r = new RifleWeapon();
        ShotgunWeapon s = new ShotgunWeapon();
        // g.fire();
        // r.fire();
        // s.fire();

        //  Дополнительная возможность выбора оружия, пользователем.
        // Weapon [] weapons{
        //     new GunWeapon (),
        //     new RiflWeapon(),
        //     new ShotgunWeapon ()
        // }
        // int index = scanner.nextInt();
        // weapons[index]
        
        testWeapon(g, 100);
        // testWeapon(r, 100);
        testWeapon(s, 100);
    }

    private static void testWeapon(Weapon weapon,int target) {
        while(target > 0) {
            weapon.fire();
            target -= weapon.getDamage();
            System.out.println("У мишение осталось: " + target + " ед. здоровья");
            try {
                Thread.sleep(60000 / weapon.getFireRate());
                
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            
        }
    }
}
