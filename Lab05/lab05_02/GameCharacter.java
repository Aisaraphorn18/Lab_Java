package lab05_02;

public class GameCharacter {
    enum Status { ALIVE, DEAD }

    protected String name;
    protected int hitpoints;
    protected int strength;
    protected int dexterity;
    protected int wisdom;
    protected Status status;

    public GameCharacter(String name, int hp, int str, int dex, int wis) {
        if (name.isEmpty() || hp < 0 || str < 0 || dex < 0 || wis < 0)
            throw new IllegalArgumentException("Bad arguments");

        this.name = name;
        this.hitpoints = hp;
        this.strength = str;
        this.dexterity = dex;
        this.wisdom = wis;
        this.status = Status.ALIVE;
    }

    public void takeHits(int attackStrength) {
        if (attackStrength < 0)
            throw new IllegalArgumentException("Attack strength cannot be negative");

        if (status == Status.DEAD) {
            System.out.printf("%s is already dead.\n", name);
        } else {
            hitpoints -= attackStrength;
            if (hitpoints <= 0) {
                status = Status.DEAD;
                System.out.printf("%s is dead.\n", name);
            } else {
                System.out.printf("%s is attacked. Remaining HP: %d\n", name, hitpoints);
            }
        }
    }

    public void attack(GameCharacter opponent) {
        System.out.println("General game character cannot attack.");
    }
}

