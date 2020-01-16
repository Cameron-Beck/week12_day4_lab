package abilities.spells;

public abstract class Spells {
    private String name;
    private int damage;

    public Spells(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}
