package lesson8.homework.Animals;

public class Dog extends Animal{
  public Dog (String animal, String name, String color, int age, String food){
  super(animal, name, color, age, food);
}

@Override
public void voice() {
  System.out.println("Wof wof!");
}
@Override
public void eat(String food){
  if (food.equals("Meat")){
    System.out.println("I like to eat " + food);
  } else {
    System.out.println("I don't like to eat " + food);
  }
}
}
