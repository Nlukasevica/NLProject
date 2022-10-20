package HWLesson9;

public class AppHw9 {
    public static void main (String[] args){
        Furniture chair = new Furniture();
        chair.colorFurniture = "White";
        chair.material = "Lather";
        chair.numberSetOfFurniture = 6;
        chair.discount = false;
        chair.priceFurniture = 500;
        String chairFurnitureInfo = chair.getFurnitureInfo();
        System.out.println(chairFurnitureInfo);
    }
}
