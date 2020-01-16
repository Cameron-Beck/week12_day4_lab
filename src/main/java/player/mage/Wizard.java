package player.mage;

import behaviours.IAbilities;

import java.util.ArrayList;

public class Wizard extends Mage{

    public Wizard(int hp, ArrayList<IAbilities> weaponList, IAbilities currentWeapon) {
        super(hp, weaponList, currentWeapon);
    }
}
