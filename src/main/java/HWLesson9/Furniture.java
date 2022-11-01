package HWLesson9;

public class Furniture {
    public String material;
    public boolean discount;
    public String colorFurniture;
    public double priceFurniture;
    public String nameFurniture;
    public int numberSetOfFurniture;
    public int yearOfManufacture;

    public String getFurnitureInfo() {
        return "Information about chair furniture" + "\n Color:" + colorFurniture + "\nMaterial:" + material + "\nName Furniture:" + nameFurniture + "\nManufacture" + yearOfManufacture+ "\nReg.Price"+ priceFurniture;
    }

    public double getDiscount() {
        if (discount) {
            return priceFurniture;
        }
        return priceFurniture - 200;


    }
}
