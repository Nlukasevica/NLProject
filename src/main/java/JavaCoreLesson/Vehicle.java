package JavaCoreLesson;

public class Vehicle {
    public String Make;
    public String Model;
    public int Year;
    public String Color;
    public String ManufactureCountry;

    public void drive (int speed){
        System.out.println(Make + " " + Model + " " + "driving with speed = " + speed);
    }
    public void beep (){
        System.out.println(Make + " " + " is beeping");
    }
}
