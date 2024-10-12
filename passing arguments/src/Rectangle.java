public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        length = 10;
        width = 5;
    }
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void setlength(double l){
        l = 70;
        length = l;
    }
    public void setwidth(double w){
        width = w;
    }
    public double getlength(){
        return length;
    }
    public double getwidth(){
        return width;
    }


    public static Rectangle modifyobject(Rectangle r){
        r.length = 78;
        r.width = 66;
        return r;
    }


    public Rectangle add (Rectangle room1){
        Rectangle room3 = new Rectangle();

        room3.length = room1.length + this.length;
        room3.width = room1.width + this.width;
        return room3;
    }
}
