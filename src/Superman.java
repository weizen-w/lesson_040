import interfaces.CanFly;
import interfaces.CanRun;
import interfaces.CanSwim;

public class Superman implements CanFly, CanRun, CanSwim {

  @Override
  public String fly() {
    return "Супермен умеет летать";
  }

  @Override
  public String run() {
    return "Супермен умеет бежать";
  }

  @Override
  public String swim() {
    return "Супермен умеет плавать";
  }
}
