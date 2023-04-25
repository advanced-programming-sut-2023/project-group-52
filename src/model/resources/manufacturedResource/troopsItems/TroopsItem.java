package model.resources.manufacturedResource.troopsItems;

import model.map.Troop;
import model.resources.manufacturedResource.ManufacturedProducts;

public class TroopsItem extends ManufacturedProducts {
    protected Troop owner;

    public TroopsItem() {
    }

    public Troop getOwner() {
        return owner;
    }
}
