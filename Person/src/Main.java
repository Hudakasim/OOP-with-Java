public class Main {
    public static void main(String[] args) {

//        Student S1 = new Student("Ahmet", 20, "Qatar", "Qatari", "3", "SE", 3.87);
//        System.out.println(S1.getName());
//
//        // default constructor of super class
//        Student S2 = new Student();


        SalariedEmployee sel1 = new SalariedEmployee("Ahmet", 20, "Qatar", "Qatari", 25000,"prof" , "teacher", 5000,100 );
        System.out.println(sel1.getSalary());

        Employee E1 = new Employee("Ahmet", 20, "Qatar", "Qatari", 25000,"prof" , "teacher");
        E1.printAllInfo();
    }
}