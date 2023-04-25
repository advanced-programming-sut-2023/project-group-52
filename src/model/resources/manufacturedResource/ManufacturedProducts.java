package model.resources.manufacturedResource;

import model.resources.Resource;
import model.resources.primaryMaterials.PrimaryMaterial;
import model.resources.primaryMaterials.PrimaryMaterials;

import java.util.HashMap;

public class ManufacturedProducts extends Resource {
    protected PrimaryMaterials ingredients;

    public ManufacturedProducts() {

    }

    public PrimaryMaterials getIngredients() {
        return ingredients;
    }
}
