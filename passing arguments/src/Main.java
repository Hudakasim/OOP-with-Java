public class Main {
    public static void main(String[] args) {

        // Passing double as argument (PASS BY VALUE)
//        Rectangle room1 = new Rectangle();
//        double roomlength = 50;
//        room1.setlength(roomlength);
//
//        System.out.println(roomlength);

        // Passing abj as argument (PASS BY REFERENCE)
//        Rectangle MyInputObj = new Rectangle(10, 30);
//
//        System.out.println("BEFORE modify: " + MyInputObj.getlength() + ", "+ MyInputObj.getwidth() );
//        Rectangle.modifyobject(MyInputObj);
//        System.out.println("AFTER modify: " + MyInputObj.getlength() + ", "+ MyInputObj.getwidth() );


        Rectangle R1 = new Rectangle(11,11);
        Rectangle R2 = new Rectangle(12, 10);
        /* Rectangle R3 = new Rectangle();
        Rectangle R4 = R3.add(R1, R2); */
        Rectangle R4 = R1.add(R2);

        System.out.println(R4.getlength());
        System.out.println(R4.getwidth());
    }
}