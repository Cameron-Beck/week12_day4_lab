package abilities.weapons;

public abstract  class Weapons {
    private String name;
    private int damage;

    public Weapons(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}
