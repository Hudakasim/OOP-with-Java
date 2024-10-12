public class Employee extends Person{
    private double salary;
    private int rank;
    private String job;

    public Employee(){

    }
    public Employee(String name, int age, String address, String nationality, double salary, int rank, String job){
        super(name, age, address, nationality);
        this.salary = salary;
        this.rank = rank;
        this.job = job;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setRank(int rank){
        this.rank = rank;
    }
    public void setJob(String job){
        this.job = job;
    }

    public double getSalary(){
        return salary;
    }
    public int getRank(){
        return rank;
    }
    public String getJob(){
        return job;
    }
}
