import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class User {

    private String name;
    private int primogems;
    private int pitty;
    private ArrayList<Character> characters;
    private ArrayList<Weapon> weapons;

    public User() {
        this.setName("Player1");
        this.primogems = 1600;
        this.pitty = 0;
        this.characters = new ArrayList<Character>();
        this.weapons = new ArrayList<Weapon>();
    }

    public User(String name) {
        this.setName(name);
        this.primogems = 1600;
        this.pitty = 0;
        this.characters = new ArrayList<Character>();
        this.weapons = new ArrayList<Weapon>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrimogems() {
        return this.primogems;
    }

    public void addPrimogems(int primogems) {
        this.primogems += primogems;
    }

    public void showCharacters() {
        int size = characters.size();
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.println(characters.get(i));
        }
        System.out.println();
    }

    public void showWeapons() {
        int size = weapons.size();
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.println(weapons.get(i));
        }
        System.out.println();
    }

    public void addCharactersAndWeapons(ArrayList<Summonable> items) {
        int size = items.size();
        System.out.println();
        for (int i = 0; i < size; i++) {
            Summonable item = items.get(i);
            if (item instanceof Character) {
                this.characters.add((Character) item);
            } else {
                this.weapons.add((Weapon) item);
            }
            System.out.println(items.get(i));
        }
        System.out.println();
    }

}
