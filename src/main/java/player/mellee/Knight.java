package player.mellee;

import behaviours.IAbilities;
import player.Player;

import java.util.ArrayList;

public class Knight extends Player {

    public Knight(int hp, ArrayList<IAbilities> weaponList, IAbilities currentWeapon) {
        super(hp, weaponList, currentWeapon);
    }
}
