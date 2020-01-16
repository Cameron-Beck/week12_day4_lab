package player.healer;

import behaviours.IAbilities;

import java.util.ArrayList;

public class Cleric extends Healer {

    public Cleric(int hp, ArrayList<IAbilities> weaponList, IAbilities currentWeapon) {
        super(hp, weaponList, currentWeapon);
    }
}
