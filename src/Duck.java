import interfaces.CanFly;
import interfaces.CanRun;
import interfaces.CanSwim;

public class Duck implements CanFly, CanRun, CanSwim {

  @Override
  public String fly() {
    return "Утка умеет летать";
  }

  @Override
  public String run() {
    return "Утка умеет бегать";
  }

  @Override
  public String swim() {
    return "Утка умеет плавать";
  }
}
