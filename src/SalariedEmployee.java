public class SalariedEmployee extends Employee {

  private double annualSalary;

  public SalariedEmployee(String name, String id, double annualSalary) {
    super(name, id);
    this.annualSalary = annualSalary;
  }

  public double getAnnualSalary() {
    return annualSalary;
  }

  public void setAnnualSalary(double annualSalary) {
    this.annualSalary = annualSalary;
  }

  @Override
  double calculateSalary() {
    double result = annualSalary/12;
    return result ;
  }

}
