package model.building.weopenCrafting;

import model.building.generalTypes.Manufacturer;
import model.map.Cell;
import model.resources.manufacturedResource.troopsItems.TroopsItem;
import model.resources.manufacturedResource.troopsItems.Weopens;
import model.resources.primaryMaterials.Iron;
import model.resources.primaryMaterials.PrimaryMaterials;

public class WeopenCrafter extends Manufacturer {
    protected static PrimaryMaterials ingredient=new Iron();
    protected TroopsItem manufacturedTroopsItem;
    public WeopenCrafter(Cell cell) {
        super(cell);
    }
}
