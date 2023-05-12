import interfaces.CanFly;
import interfaces.CanRun;
import interfaces.CanSwim;

public class Superman implements CanFly, CanRun, CanSwim {

  @Override
  public String fly() {
    return "летит";
  }

  @Override
  public String run() {
    return "бежит";
  }

  @Override
  public String swim() {
    return "плывёт";
  }
}
