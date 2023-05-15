package model.people;

import controller.GameMenuController;
import model.Government;
import model.Job;
import model.building.Building;

public class Person {
    private Government government;
    private float goldCoins;
    private Job job;
    private Building livingPlace;

    public Person(Government government) {
        this.government = government;
    }
    public float giveTax()
    {
        float taxAmount= GameMenuController.taxAmountCalculator(government.getTaxRate());
        if(taxAmount>goldCoins) taxAmount=goldCoins;
        goldCoins-=taxAmount;
        return taxAmount;
    }

    public Government getGovernment() {
        return government;
    }

    public float getGoldCoins() {
        return goldCoins;
    }

    public Job getJob() {
        return job;
    }

    public Building getLivingPlace() {
        return livingPlace;
    }
}
