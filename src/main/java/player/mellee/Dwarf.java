package player.mellee;

import behaviours.IAbilities;
import player.Player;

import java.util.ArrayList;

public class Dwarf extends Player {

    public Dwarf(int hp, ArrayList<IAbilities> weaponList, IAbilities currentWeapon) {
        super(hp, weaponList, currentWeapon);
    }
}
