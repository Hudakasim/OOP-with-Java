public class Main {
    public static void main(String[] args) {
//        Employee E1 = new Employee( 30722088, "Huda", "SE", 30701, 1000 ,true);
//        E1.printEmpData();
        Employee E2 = new Employee(230088, "Fatma", false);
        E2.printEmpData();
        System.out.println("***********After setSalary***************************");
        E2.setSalary(5000);
        E2.printEmpData();
        System.out.println("***********After setSalary with 2 parameters**********");
        E2.setSalary(5000,700);
        E2.printEmpData();
    }
}