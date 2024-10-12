public class Main {
    public static void main(String[] args) {

//        Rectangle R1 = new Rectangle(2, 6);
//        Rectangle R2 = new Rectangle(2, 6);

//        if (R1.cmp(R2))
//            System.out.println("the two objects are equal");
//        else
//            System.out.println("the two objects are not equal");

//        // will cmp the addresses of the objs
//        if (R1 == R2)
//            System.out.println("the two object have the same reference");
//        else
//            System.out.println("the two object have not the same reference");
//
//        // 2 objs will point to the same address
//        R2 = R1;
//        R2.setlength(100);
//        System.out.println(R1.getlength());

        // DEEP COPYING
        Rectangle R1 = new Rectangle(49,100);
        Rectangle R2 = new Rectangle(R1);

        System.out.println(R2.getlength() + " " + R2.getwidth());

    }
}