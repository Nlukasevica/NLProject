package LessonsNineWith2ndPart;

public class Vehicle {

    private String Make;
    private String Model;
    private int Year;
    private String Color;


    public String getMake (){
        return Make;
    }
    public void setMake (String Make){
        this.Make = Make;
    }
    public String getModel (){
        return Model;
    }
    public void setModel(String Model){
        this.Model= Model;
    }

    public String getColor(){
        return Color;
    }
    public void setColor(String Color){
        this.Color = Color;
    }
    public int getYear(){
        return Year;
    }
    public void setYear (int Year){
        this.Year= Year;

    }
    public void drive (int speed){
        System.out.println(Make + " " + Model + " " + "driving with speed = " + speed);
    }
    public void beep (){
        System.out.println(Make + " " + " is beeping");
    }

    public void flashing (){
        System.out.println (Color + " " + Make + " " + "is flashing bright" );
    }

}
