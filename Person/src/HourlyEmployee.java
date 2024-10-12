public class HourlyEmployee extends Employee{
    private double workingHours;
    private double hourRate;

    HourlyEmployee(){

    }
    public void setWorkingHours(double workingHours){
        this.workingHours = workingHours;
    }
    public void setHourRate(double hourRate){
        this.hourRate = hourRate;
    }

    public double getWorkingHours(){
        return workingHours;
    }
    public double getHourRate(){
        return hourRate;
    }

    @Override
    public double getSalary() {
        return workingHours * hourRate;
    }
}
