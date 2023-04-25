package model.building.CastleBuilding.bridges;

import model.map.Cell;
import model.building.Building;
import model.resources.primaryMaterials.Wood;

public class DrawBridge extends Building {
    private Boolean isItDown;
    private static int opponentSpeedReduction;

    public DrawBridge(Cell cell) {
        super(cell);
        isItDown=false;
        neededBuildingMaterial=new Wood();
        numberOfGoldCoinNeeded=0;
        numberOfNeededBuildingMaterial=10;
    }

    public Boolean getIsItDown() {
        return isItDown;
    }
    public void changeState(){
        isItDown=(!isItDown);
    }
}
