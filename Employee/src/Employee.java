public class Employee {
    private int Emp_ID;
    private String Name;
    private String Depart;
    private double Salary;
    private double Bouns;
    private boolean Resident;

    public Employee(){
        Emp_ID = 100;
        Name = "No Name";
        Salary = 3000;
        Bouns = 500;
        Depart = "not assigned";
        Resident = false;
    }
    public Employee(int ID, String name){
        Emp_ID = ID;
        Name = name;
    }
    public Employee(int I, String n, boolean resident){
        // "this" --> must be done in the first line
        this(I, n); // Types and order of parameters must be the same
        Resident = resident;
    }
    public Employee(int ID, String name, String depart, double salary, double bouns, boolean resident) {
        this (ID, name, resident);
        Depart = depart;
        Salary = salary;
        Bouns = bouns;
    }
    public void setSalary(double salary){
        Salary = salary;
    }
    public void setSalary(double salary, double bouns){
        this.setSalary(salary);
        Bouns = bouns;
    }
    public void setDepart(String depart){
        Depart = depart;
    }
    public void setEmp_ID(int ID){
        Emp_ID = ID;
    }
    public void printEmpData(){
        System.out.println("ID: " + Emp_ID);
        System.out.println("Name: " + Name);
        System.out.println("Depart: " + Depart);
        System.out.println("Salary: " + Salary);
        System.out.println("Bouns: " + Bouns);
        System.out.println("Resident: " + Resident);
    }
}
