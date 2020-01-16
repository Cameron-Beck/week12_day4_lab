package player;

import behaviours.IAbilities;

import java.util.ArrayList;

public abstract class Player implements IAbilities {
    private int hp;
    private ArrayList<IAbilities> weaponList;
    private IAbilities currentWeapon;

    public Player(int hp, ArrayList<IAbilities> weaponList, IAbilities currentWeapon) {
        this.hp = hp;
        this.weaponList = weaponList;
        this.currentWeapon = currentWeapon;
    }


}
