package model.people;

import model.Government;
import model.people.Person;

public class Troop extends Person {
    private int hp;
    protected int maxHp;
    public Troop(Government government) {
        super(government);
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }
    public void getHurt(int damage){
        hp-=damage;
    }
}
