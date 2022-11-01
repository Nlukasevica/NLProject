package LessonsNineWith2ndPart;

public class App3 {
    public static void main(String[]args){
        Person natasha = new Person();
        natasha.setName("Natasha");

        Person paderin = new Person();
        paderin.setLastName("Paderin");

        Person birthYear = new Person();
        birthYear.setYearOfBirth(1976);

        Vehicle mazda = new Vehicle();
        mazda.setMake("Mazda");
        mazda.setModel("CX-50");
        mazda.setColor("Black");
        mazda.setYear(2022);
        mazda.drive(120);
        mazda.beep();
        mazda.flashing();

        Color color = new Color();
        color.setName("Red");
        color.setShade("RedRedRed");
        color.setNumber(100);
        color.flashingSparkscolor();
        String colorInfo = color.getAllInfo();


        System.out.println(natasha.getName());
        System.out.println(paderin.getLastName());
        System.out.println(birthYear.getYearOfBirth());
        System.out.println("*************************");
        System.out.println(mazda.getMake());
        System.out.println(mazda.getModel());
        System.out.println(mazda.getColor());
        System.out.println(mazda.getYear());
        mazda.drive(120);
        mazda.beep();
        mazda.flashing();
        System.out.println("****************************");
        System.out.println(color.getName());
        System.out.println(color.getShade());
        System.out.println(color.getNumber());
        color.flashingSparkscolor();
        System.out.println (colorInfo);







    }


}
