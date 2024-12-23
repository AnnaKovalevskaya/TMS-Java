package lesson8.homework.Animals;

public class Animal {
  private String animal;
  private String name;
  private String color;
  private int age;
  private String food;

  public Animal(String animal, String name, String color, int age, String food) {
      this.animal = animal;
      this.name = name;
      this.color = color;
      this.age = age;
      this.food = food;
  }

  public void voice(){
      System.out.println("This is general class Animal and it must be overloaded in a child class.");
  }

  public void eat(String food){
      System.out.println("This is general class Animal and it must be overloaded in a child class.");
  }

  @Override
  public String toString() {
      return "Animal: \n" +
              "Animal: " + this.animal + '\n' +
              "Name: " + this.name + '\n' +
              "Color: " + this.color + '\n' +
              "Age: " + this.age + "\n" +
              "Food: " + this.food;
  }
}
