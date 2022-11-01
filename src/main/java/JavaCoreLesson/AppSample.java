package JavaCoreLesson;

public class AppSample {
    public static void main (String[]args){
       Person natasha = new Person();
       natasha.name = "Natasha";
       natasha.lastName= "Lukasevich";
       natasha.yearOfBirth = 1976;

       Person daniel = new Person ();
       daniel.name = "Daniel";
       daniel.lastName = "Paderin";
       daniel.yearOfBirth = 2009;

       Person mia = new Person();
       mia.name = "Mia";
       mia.lastName= "Paderin";
       mia.yearOfBirth = 2011;
       mia.email = "Mia@gmail.com";

       Vehicle mercedes = new Vehicle();
       mercedes.Make = " Mercedes GL";
       mercedes.Model = "450";
       mercedes.ManufactureCountry = "USA";
       mercedes.Year = 2011;
       mercedes.Color = "Black";
       mercedes.drive(100);
       mercedes.beep();

       Vehicle toyota = new Vehicle();
       toyota.Make = "Toyota";
       toyota.Year = 2005;
       toyota.Model = "Odessa";
       toyota.drive(85);
       toyota.beep();

       House paderinHouse = new House();
       paderinHouse.address = "463 Buckeye Drive";
       paderinHouse.city = "Wheeling";
       paderinHouse.state = "IL";
       paderinHouse.zip = 60090;

       paderinHouse.bathrooms = 4;
       paderinHouse.bedrooms = 5;
       paderinHouse.yearOfBuilt =2018;
       paderinHouse.footage = 3600;

       paderinHouse.sellByOwner = false;
       paderinHouse.basement = false;
       paderinHouse.price= 555000;

        System.out.println(daniel.lastName);
        System.out.println(natasha.yearOfBirth);
        System.out.println (mia.email);
        System.out.println (mercedes.ManufactureCountry);
        System.out.println (mercedes.Color);
        System.out.println (mercedes.Make);
        String address = paderinHouse.getAddress();
        System.out.println(address);
        String houseInfo = paderinHouse.getHouseInfo();
        System.out.println (houseInfo);
        Double price = paderinHouse.getSellingInfo();
        System.out.println(price);






    }


}
