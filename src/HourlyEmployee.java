public class HourlyEmployee extends Employee {

  private double hourlyWage;
  private int hoursWorked;

  public HourlyEmployee(String name, String id, double hourlyWage, int hoursWorked) {
    super(name, id);
    this.hourlyWage = hourlyWage;
    this.hoursWorked = hoursWorked;
  }

  public double getHourlyWage() {
    return hourlyWage;
  }

  public void setHourlyWage(double hourlyWage) {
    this.hourlyWage = hourlyWage;
  }

  public int getHoursWorked() {
    return hoursWorked;
  }

  public void setHoursWorked(int hoursWorked) {
    this.hoursWorked = hoursWorked;
  }

  @Override
  double calculateSalary() {
    double result = hourlyWage * hoursWorked;
    return result;
  }


}
