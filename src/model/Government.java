package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Government {
    private HashMap<Food,Integer> foodSupply;
    private Map map;
    private int popularity;
    private ArrayList<Person> allPeople;
    private ArrayList<Cell> domain;
    private int taxRate;

    public Government(Map map, ArrayList<Cell> domain) {
        this.map = map;
        this.domain = domain;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    public HashMap<Food, Integer> getFoodSupply() {
        return foodSupply;
    }

    public int getPopularity() {
        return popularity;
    }

    public ArrayList<Person> getAllPeople() {
        return allPeople;
    }

    public int getTaxRate() {
        return taxRate;
    }

    public void addDomain(Cell cell){
        return;
    }
    public void collectAlltaxes(){
        return;
    }
    public void feedingEveryOneInOnrCell(int x,int y){
        return;
    }
    public void feedEveryoneInDomain(){
        return;
    }
    public void addPopularityBecauseOfFoodDiversity(){

    }
    public void addPopularityBecauseOfEvertThing(){

    }
}
