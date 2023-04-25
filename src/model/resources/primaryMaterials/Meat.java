package model.resources.primaryMaterials;

public class Meat extends PrimaryMaterials{
    private boolean isItprocessed;

    public Meat() {
        isItprocessed=false;
    }
    public void setItprocessed(){
        isItprocessed=true;
    }

    public boolean isItprocessed() {
        return isItprocessed;
    }
}
