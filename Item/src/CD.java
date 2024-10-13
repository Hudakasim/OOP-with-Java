public class CD implements RetailItem, DisplayLable{

    private String title;
    private String artist;
    private double Price;

    public CD(String title, String artist, double price){
        this.title = title;
        this.artist = artist;
        this.Price = price;
    }
    public CD(){

    }

    public double getItemPrice() {
        return Price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void display(){
        System.out.println("Store name: " + storName);
        System.out.println(title);
        System.out.println(artist);
        System.out.println(Price);
    }
}
