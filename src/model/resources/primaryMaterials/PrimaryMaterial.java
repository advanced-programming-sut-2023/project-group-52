package model.resources.primaryMaterials;

public enum PrimaryMaterial {
    WOOD(100);
    private int price;

    PrimaryMaterial(int price) {
        this.price = price;
    }
}
