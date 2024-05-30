//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    Employee salariedEmployee = new SalariedEmployee("Tom","1111",500000);
    Employee hourlyEmployee = new HourlyEmployee("Sandy","2222",150,160);


    System.out.println("員工名：" + salariedEmployee.getName());
    System.out.println("ID：" + salariedEmployee.getId());
    System.out.println("薪資：" + salariedEmployee.calculateSalary());
    System.out.println();

    System.out.println("員工名：" + hourlyEmployee.getName());
    System.out.println("ID：" + hourlyEmployee.getId());
    System.out.println("薪資：" + hourlyEmployee.calculateSalary());
    System.out.println();

    System.out.println("薪資是否相等：" + salariedEmployee.equalsSalary(hourlyEmployee));

  }
}