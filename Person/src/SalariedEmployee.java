public class SalariedEmployee extends Employee {
    private double bonus;
    private double deduction;

    public SalariedEmployee(){

    }
    public SalariedEmployee(String name, int age, String address, String nationality, double salary, String rank, String job, double bonus, double deduction) {
        super(name, age, address, nationality, salary, rank, job);
        this.bonus = bonus;
        this.deduction = deduction;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }
    public double getBonus() {
        return bonus;
    }
    public double getDeduction() {
        return deduction;
    }

    // salaried employee get their own version of getSalary because it's different
    @Override
    public double getSalary() {
        return salary + bonus - deduction;
    }

}
