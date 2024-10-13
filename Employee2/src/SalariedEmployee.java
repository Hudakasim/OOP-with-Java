public class SalariedEmployee extends Employee {
    private double bonus;
    private double deduction;

    public SalariedEmployee(){

    }
    public SalariedEmployee(String name, int age, double salary, String rank, String job, double bonus, double deduction) {
        super(name, age, salary, rank, job);
        this.bonus = bonus;
        this.deduction = deduction;
    }

    @Override
    public double getSalary() {
        return salary + bonus - deduction;
    }

}
