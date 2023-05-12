import interfaces.CanFly;
import interfaces.CanRun;
import interfaces.CanSwim;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Superman superman = new Superman();
    Airplane airplane = new Airplane();
    Duck duck = new Duck();
    Penguin penguin = new Penguin();
    People people = new People();
    System.out.println();
    List<CanFly> flyable = new ArrayList<>();
    flyable.add(superman);
    flyable.add(airplane);
    flyable.add(duck);
    makeThemFly(flyable);
    System.out.println();
    List<CanRun> runable = new ArrayList<>();
    runable.add(superman);
    runable.add(duck);
    runable.add(penguin);
    runable.add(people);
    makeThemRun(runable);
    System.out.println();
    List<CanSwim> swimmable = new ArrayList<>();
    swimmable.add(superman);
    swimmable.add(duck);
    swimmable.add(penguin);
    swimmable.add(people);
    makeThemSwim(swimmable);
    System.out.println();
  }

  public static void makeThemFly(List<CanFly> flyable) {
    System.out.println("Main.makeThemFly(flyable=" + flyable + ")");
    for (CanFly flyableObject : flyable) {
      System.out.println(flyableObject + ".fly()");
      flyableObject.fly();
    }
  }

  public static void makeThemRun(List<CanRun> runable) {
    System.out.println("Main.makeThemRun(runable=" + runable + ")");
    for (CanRun runableObject : runable) {
      System.out.println(runableObject + ".run()");
      runableObject.run();
    }
  }

  public static void makeThemSwim(List<CanSwim> swimmable) {
    System.out.println("Main.makeThemSwim(swimmable=" + swimmable + ")");
    for (CanSwim swimmableObject : swimmable) {
      System.out.println(swimmableObject + ".swim()");
      swimmableObject.swim();
    }
  }
}
