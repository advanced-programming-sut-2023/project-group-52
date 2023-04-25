package model.people;

import model.Government;
import model.Job;
import model.building.Building;

public class Person {
    private Government government;
    private int wealth;
    private Job job;
    private Building livingPlace;

    public Person(Government government) {
        this.government = government;
    }
    public void giveTaxe(int taxrate){
        return;
    }

    public Government getGovernment() {
        return government;
    }

    public int getWealth() {
        return wealth;
    }

    public Job getJob() {
        return job;
    }

    public Building getLivingPlace() {
        return livingPlace;
    }
}
