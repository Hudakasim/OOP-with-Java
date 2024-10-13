public class Main {
    public static void main(String[] args) {
//        RetailItem r1 = new RetailItem();  ---> Error: this is abstract

        CD item1 = new CD("Sun Rise", "Jaim", 120);
        System.out.println(item1.getItemPrice());

        RetailItem R1 = new CD();
        R1.getItemPrice();
        // R1.setTitle(); ---> R1 obj is just familier with the methods in RetailItem NOT CD

        DisplayLable D1 = new CD("Sun Rise", "Jaim", 120);
        D1.display();


    }
}