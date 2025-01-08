package lesson9.homework.taskWithStar;

public class MyMain {
  public static void main(String[] args) {
      try {
          Person originalPerson = new Person("Alice", 30);
          System.out.println("Original object: " + originalPerson);

          Person clonedPerson = (Person) originalPerson.clone();
          System.out.println("Cloned object: " + clonedPerson);

          clonedPerson.setName("Bob");
          clonedPerson.setAge(25);
          System.out.println("After changing cloned object: " + clonedPerson);
          System.out.println("Orginal after changing cloned object: " + originalPerson);

      } catch (CloneNotSupportedException e) {
          e.printStackTrace();
      }
  }
}
