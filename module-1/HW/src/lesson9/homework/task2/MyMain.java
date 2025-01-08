package lesson9.homework.task2;
public class MyMain {
  public static void main(String[] args) {
      Figure[] figures = new Figure[5];

      // Создание массива фигур
      figures[0] = new Triangle(3, 4, 5);
      figures[1] = new Rectangle(4, 5);
      figures[2] = new Circle(3);
      figures[3] = new Triangle(5, 12, 13);
      figures[4] = new Rectangle(6, 8);

      // Подсчет суммы периметров всех фигур
      double totalPerimeter = 0;
      for (Figure figure : figures) {
          totalPerimeter += figure.getPerimeter();
      }

      // Вывод суммы периметров
      System.out.println("Sum of perimeters: " + totalPerimeter);
  }
}
