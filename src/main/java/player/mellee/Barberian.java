package player.mellee;

import behaviours.IAbilities;
import player.Player;

import java.util.ArrayList;

public class Barberian extends Player {

    public Barberian(int hp, ArrayList<IAbilities> weaponList, IAbilities currentWeapon) {
        super(hp, weaponList, currentWeapon);
    }
}
