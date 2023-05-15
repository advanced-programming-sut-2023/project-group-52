package model.building.generalTypes;

import model.building.Building;
import model.building.industry.storage.Storage;
import model.map.Cell;
import model.resources.Resource;
import model.resources.manufacturedResource.ManufacturedProducts;
import model.resources.primaryMaterials.PrimaryMaterials;

import java.util.ArrayList;

public class Manufacturer extends Building {
    protected ArrayList<ManufacturedProducts> allproducts;
    protected Resource ingredient;
    protected ManufacturedProducts manufacturedProducts;
    protected int rate;
    public Manufacturer(Cell cell) {
        super(cell);
    }
    public void manufacture(){

    }
}
