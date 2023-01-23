import animal.Cat;
import car.Car;

public class Main {
  public static void main(String[] args) {
    Car car = new Car("Красный", "Внедорожник", 1990);
    car.carStart();
    car.carOff();

    Cat cat = new Cat("Барсик");
    cat.drinkMilk();
  }
}