package lesson9.homework.task1;

public class Main {
  public static void main(String[] args) {
      Employee[] employees = new Employee[] {
          new Director(),
        //   new Worker(),
          new Accountant()
      };

      for (Employee employee : employees) {
          employee.printPosition();
      }
  }
}
