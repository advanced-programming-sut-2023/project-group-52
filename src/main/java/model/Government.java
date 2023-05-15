package model;

import model.building.Building;
import model.building.CastleBuilding.stonegateHouses.StoneGatehouse;
import model.map.Cell;
import model.map.Map;
import model.people.Person;

import java.util.ArrayList;
import java.util.HashMap;

public class Government {
    private int maxResourceCapacity;
    private HashMap<Food, Integer> foodSupply;
    private Map map;
    private int maxPopulation;
    private int popularity;
    private ArrayList<Person> allPeople;
    private ArrayList<Cell> domain;
    private int taxRate;
    private int  foodRate;
    private int religounRate;
    private int fearRate;
    private float wealth;
    public Government(Map map, ArrayList<Cell> domain) {
        this.map = map;
        this.domain = domain;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    public String getfoodList() {
        return null;
    }

    public void setReligounRate(int religounRate) {
        this.religounRate = religounRate;
    }

    public void setFearRate(int fearRate) {
        this.fearRate = fearRate;
    }

    public Boolean DoesAStoneGateExits() {
        for(Cell cell:domain){
            if(cell.getBuilding() instanceof StoneGatehouse) return true;
        }
        return false;
    }


    public void setFoodRate(int foodRate) {
        this.foodRate = foodRate;
    }

    public void changeFood(int number, Food food) {

    }
    public void changePopularity(int number){

    }
    public void changeMaxPopularity(int number){

    }

    public void addpopularity(int number) {

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

    public void addDomain(Cell cell) {
        domain.add(cell);
        return;
    }

    public void collectAllTaxes() {
        for (Cell cell:domain){
            for (Person person:allPeople){
                if(person.getGovernment().equals(this)){
                    float tax=person.giveTax();
                    wealth+=tax;
                }
            }
        }
        return;
    }

    public void feedingEveryOneInOneCell(int x, int y) {
        return;
    }

    public void feedEveryoneInDomain() {
        return;
    }

    public void addPopularityBecauseOfFoodDiversity() {
    }
    public void addPopularityBecauseOfEvertThing() {

    }
    public Boolean doYouHaveEnoughStoneToRepairThisBuilding(Building building){
        return true;
    }
    public void addStorage(int amount){
        maxResourceCapacity+=amount;
    }

}
