import interfaces.CanRun;
import interfaces.CanSwim;

public class People implements CanRun, CanSwim {

  @Override
  public String run() {
    return "Человек умеет бегать";
  }

  @Override
  public String swim() {
    return "Человек умеет плавать";
  }
}
