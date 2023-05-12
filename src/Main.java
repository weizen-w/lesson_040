public class Main {

  public static void main(String[] args) {
    Superman superman = new Superman();
    System.out.println(superman.fly());
    System.out.println(superman.run());
    System.out.println(superman.swim());
    Airplane airplane = new Airplane();
    System.out.println(airplane.fly());
    Duck duck = new Duck();
    System.out.println(duck.fly());
    System.out.println(duck.run());
    System.out.println(duck.swim());
    Penguin penguin = new Penguin();
    System.out.println(penguin.run());
    System.out.println(penguin.swim());
    People people = new People();
    System.out.println(people.run());
    System.out.println(people.swim());
  }
}
