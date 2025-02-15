public class Person {
    private String Name;
    private int Age;
    private String Address;
    private String Nationality;

    public Person(){
        System.out.println("The super class constructor");
    }

    public Person(String name, int age, String address, String nationality){
        Name = name;
        Age = age;
        Address = address;
        Nationality = nationality;
    }

    public void setName(String name){
        Name = name;
    }
    public void setAge(int age){
        Age = age;
    }
    public void setAddress(String address){
        Address = address;
    }
    public void setNationality(String nationality){
        Nationality = nationality;
    }

    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public String getAddress(){
        return Address;
    }
    public String getNationality(){
        return Nationality;
    }

    public void printAllInfo (){
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Address: " + Address);
        System.out.println("Nationality: " + Nationality);
    }
}
