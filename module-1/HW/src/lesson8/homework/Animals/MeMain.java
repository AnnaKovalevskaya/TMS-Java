package lesson8.homework.Animals;

public class MeMain {
  public static void main(String[] args) {
    Animal dog = new Dog("Dog", "Rex", "Black", 3, "Meat");
    dog.voice();
    dog.eat("Meat");
    dog.eat("Grass");

    Animal tiger = new Tiger("Tiger", "Atos", "Orange", 3, "Meat");
    tiger.voice();
    tiger.eat("Meat");
    tiger.eat("Grass");

    Animal rabbit = new Rabbit("Rabbit", "Puffer", "White", 1, "Grass");
    rabbit.voice();
    rabbit.eat("Grass");
    rabbit.eat("Meat");
}
}
