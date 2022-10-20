package HWLesson9;

public class Furniture {
    public String material;
    public boolean discount;
    public String colorFurniture;
    public int priceFurniture;
    public String nameFurniture;
    public int numberSetOfFurniture;

    public String getFurnitureInfo (){
        return "Information about chair furniture"+ "\n Color:" + colorFurniture + "\nMaterial:" + material+ "Name Furniture"+ nameFurniture;
    }

}
