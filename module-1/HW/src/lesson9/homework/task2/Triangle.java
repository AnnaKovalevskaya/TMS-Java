package lesson9.homework.task2;

public class Triangle extends Figure {
  private double sideA;
  private double sideB;
  private double sideC;

  public Triangle(double sideA, double sideB, double sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  @Override
  public double getArea() {
    double p = getPerimeter() / 2;
    return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
  }

  @Override
  public double getPerimeter() {
    return sideA + sideB + sideC;
  }
}
