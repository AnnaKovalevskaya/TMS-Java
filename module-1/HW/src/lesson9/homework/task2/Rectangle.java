package lesson9.homework.task2;

public class Rectangle extends Figure {
  private double sideA;
  private double sideB;

  public Rectangle(double sideA, double sideB) {
    this.sideA = sideA;
    this.sideB = sideB;
  }

  @Override
  public double getArea() {
    return sideA * sideB;
  }

  @Override
  public double getPerimeter() {
    return 2 * (sideA + sideB);
  }
}
