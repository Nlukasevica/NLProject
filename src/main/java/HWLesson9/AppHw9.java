package HWLesson9;

public class AppHw9 {
    public static void main (String[] args){
        Furniture chair = new Furniture();
        chair.colorFurniture = "White";
        chair.material = "Lather";
        chair.numberSetOfFurniture = 6;
        chair.priceFurniture = 500;
        chair.nameFurniture = "Alexandra";
        chair.yearOfManufacture = 2022;
        chair.discount = false;
        System.out.println("***************chairFurnitureInfo****************");
        String chairFurnitureInfo = chair.getFurnitureInfo();
        System.out.println(chairFurnitureInfo);
        System.out.println("*******chairDiscount***********");
        Double chairDiscount = chair.getDiscount();
        System.out.println(chairDiscount);
    }
}
