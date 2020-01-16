package player.mage;

import behaviours.IAbilities;

import java.util.ArrayList;

public class Warlocks extends Mage {

    public Warlocks(int hp, ArrayList<IAbilities> weaponList, IAbilities currentWeapon) {
        super(hp, weaponList, currentWeapon);
    }
}
