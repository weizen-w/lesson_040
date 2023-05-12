import interfaces.CanFly;
import interfaces.CanRun;
import interfaces.CanSwim;

public class Superman implements CanFly, CanRun, CanSwim {

  @Override
  public String fly() {
    return "Супермен летит";
  }

  @Override
  public String run() {
    return "Супермен бежит";
  }

  @Override
  public String swim() {
    return "Супермен плывёт";
  }
}
