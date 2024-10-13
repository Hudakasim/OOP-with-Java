public abstract class Employee {
    private String Name;
    private int Age;
    protected double salary;
    private String rank;
    private String job;

    public Employee(){

    }
    public Employee(String name, int age, double salary,String rank, String job){
        this.Name = name;
        this.Age = age;
        this.salary = salary;
        this.rank = rank;
        this.job = job;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    // abstract method
    public abstract double getSalary();
}
