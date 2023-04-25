package model.resources.primaryMaterials;

public class Crop extends PrimaryMaterials{
    private Boolean isItGrownUp;
    private static int  timeAmountToGrow;
    private int stageOfBeingGrownUp;

    public Crop() {
        isItGrownUp=false;
        stageOfBeingGrownUp=0;
    }
    public void grow(){
        if(timeAmountToGrow==stageOfBeingGrownUp){
            isItGrownUp=true;
            return;
        }
        stageOfBeingGrownUp+=1;
    }

    public Boolean getItGrownUp() {
        return isItGrownUp;
    }
}
