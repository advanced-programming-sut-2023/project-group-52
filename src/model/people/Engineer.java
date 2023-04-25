package model.people;

import model.Government;
import model.people.Person;

public class Engineer extends Person {
    private Boolean haveOilSmelt;
    public Engineer(Government government) {
        super(government);
        haveOilSmelt=false;
    }
    public void equipWithOilSmelt(){
        haveOilSmelt=true;
    }
}
