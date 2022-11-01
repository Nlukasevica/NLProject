package LessonsNineWith2ndPart;

public class Color {
    private String name;
    private String shade;
    private int number;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getShade(){
        return shade;
    }
    public void setShade(String shade){
        this.shade= shade;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number= number;
    }
    public void flashingSparkscolor (){
        System.out.println(shade + " " + "Flashing bright in red color" );

    }
    public String getAllInfo (){
        return "Color Information: " + "\nColor of the dress: " +  name + "\nType of shade:" +  shade + "\nHow many:" + number;
    }
}
