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
    // cp constructor
    public Rectangle (Rectangle srcObj){
        length = srcObj.length;
        width = srcObj.width;
    }


    public void setlength(double l){
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

    public boolean cmp(Rectangle r){
        if (this.length == r.length && this.width == r.width)
            return true;
        else
            return false;
    }
}
