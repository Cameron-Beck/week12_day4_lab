package player.healer;

import behaviours.IAbilities;
import player.Player;

import java.util.ArrayList;

public abstract class Healer extends Player {
    public Healer(int hp, ArrayList<IAbilities> weaponList, IAbilities currentWeapon) {
        super(hp, weaponList, currentWeapon);
    }
}
