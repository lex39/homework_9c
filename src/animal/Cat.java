package animal;

public class Cat extends Animal{
  String name;

  public void drinkMilk() {
    System.out.println("Кошка пьёт воду");
  }

  public Cat(String name) {this.name = name;}
}
