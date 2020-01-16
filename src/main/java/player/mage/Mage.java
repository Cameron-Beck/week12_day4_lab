package player.mage;

import behaviours.IAbilities;
import player.Player;

import java.util.ArrayList;

public  abstract class Mage extends Player {

    public Mage(int hp, ArrayList<IAbilities> weaponList, IAbilities currentWeapon) {
        super(hp, weaponList, currentWeapon);
    }
}
