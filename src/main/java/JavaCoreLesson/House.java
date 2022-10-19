package JavaCoreLesson;

public class House {
    public int zip;
    public String address;
    public String city;
    public String state;
    public int yearOfBuilt;
    public int bedrooms;
    public int bathrooms;
    public double footage;
    public boolean sellByOwner;
    public boolean basement;
    public int price;

    public String getAddress(){
        return "Street Address: " + address + " \nCity: " + city + "\nState: " + state + ", Zip: "+ zip ;
    }

    public String getHouseInfo(){
        return "House Inforamtion:" + "\nWhen was built:" + yearOfBuilt+ "\nbedrooms:"+ bedrooms+ "bathrooms:"+ bathrooms + "\nSize"+ footage;
    }
     public double getSellingInfo (){
        if (sellByOwner){
            return price;
        }
        return price * 1.2;

}

}
