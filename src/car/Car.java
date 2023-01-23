package car;

public class Car {
  String color;
  String type;
  int year;

  public void carStart() {
    System.out.println("Автомобиль заведен.");
  }

  public void carOff() {
    System.out.println("Автомобиль заглушен.");
  }

  public void setCarColor(String color) {this.color = color;}

  public void setCarType(String type) {this.type = type;}

  public void setCarYear(Integer year) {this.year = year;}

  public Car( String color, String type, Integer year) {
    setCarColor(color);
    setCarType(type);
    setCarYear(year);
    System.out.println("Вы создали автомобиль: " + color + " - цвет, " + type
            + " - тип кузова, " + year + " - год производства.");
  }
}
