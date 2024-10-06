public class Rectangle {
    private double length;
    private double width;

    // Constructors
    public Rectangle(){
        length = 10;
        width = 5;
        System.out.println("a new room created with 10x5");
    }
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

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
