public class HourlyEmployee extends Employee{
    private double workingHours;
    private double hourRate;

    HourlyEmployee(String name, int age, double salary, String rank, String job, double w, double h){
        super(name, age, salary, rank, job);
        workingHours = w;
        hourRate = h;
    }

    @Override
    public double getSalary() {
        return workingHours * hourRate;
    }
}
