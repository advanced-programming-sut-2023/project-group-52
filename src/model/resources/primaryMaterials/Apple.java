package model.resources.primaryMaterials;

public class Apple extends PrimaryMaterials{
    private Boolean isItGrownUp;
    private static int  timeAmountToGrow;
    private int stageOfBeingGrownUp;
    public Apple() {
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
}
