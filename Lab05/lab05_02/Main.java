package lab05_02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GameCharacter> characters = new ArrayList<>();

        characters.add(new Warrior("Eisen", 100, 25, 15, 10));
        characters.add(new Monk("Zhang", 80, 20, 26, 20));
        characters.add(new Mage("Frieren", 60, 15, 20, 35, 3));

        var eisen = characters.get(0);
        var zhang = characters.get(1);
        var frieren = characters.get(2);

        zhang.attack(eisen);
        frieren.attack(eisen);
        eisen.attack(frieren);
        zhang.attack(eisen);
        frieren.attack(zhang);
        eisen.attack(zhang);
        zhang.attack(eisen);
        frieren.attack(zhang);
        eisen.attack(zhang);
        zhang.attack(eisen);
        frieren.attack(zhang);
        eisen.attack(zhang);
    }
}
