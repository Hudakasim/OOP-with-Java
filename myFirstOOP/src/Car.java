public class Car {
    private String maker;
    private int yearModel;
    private static int noOfObj;

    public Car(String maker, int yearModel){
        this.maker = maker;
        this.yearModel = yearModel;
        noOfObj ++;
    }
    public Car(){
        maker = "Honda";
        yearModel = 2017;
        noOfObj ++;
    }
    public void setmaker(String m){
        maker = m;
    }
    public void setmodel(int year){
        if (year > 0){
            yearModel = year;
        }
        else {
            System.out.println("Invalid year");
        }
    }

    public String getmaker(){
        return maker;
    }
    public int getmodel(){
        return yearModel;
    }
    public static int getnoOfObj(){
        return noOfObj;
    }
}
