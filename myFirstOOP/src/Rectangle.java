public class Rectangle {
    private double length;
    private double width;

    // SETTER methods
    public void setlength(double l){
        length = l;
    }
    public void setwidth(double w){
        width = w;
    }
    // GETTER methods
    public double getlength(){
        return length;
    }
    public double getwidth(){
        return width;
    }
    public double getarea(){
        return length*width;
    }
}
