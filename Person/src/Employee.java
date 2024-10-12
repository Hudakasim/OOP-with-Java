public class Employee extends Person{
    double salary;
    private String rank;
    private String job;

    public Employee(){

    }
    public Employee(String name, int age, String address, String nationality, double salary,String rank, String job){
        super(name, age, address, nationality);
        this.salary = salary;
        this.rank = rank;
        this.job = job;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setRank(String rank){
        this.rank = rank;
    }
    public void setJob(String job){
        this.job = job;
    }

    public double getSalary(){
        return salary;
    }
    public String getRank(){
        return rank;
    }
    public String getJob(){
        return job;
    }

    // add to the other method in the super class
    @Override
    public void printAllInfo(){
        super.printAllInfo();
        System.out.println("Salary: " + salary);
        System.out.println("Rank: " + rank);
        System.out.println("Job: " + job);
    }
}
