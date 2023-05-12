import interfaces.CanFly;
import interfaces.CanRun;
import interfaces.CanSwim;

public class Duck implements CanFly, CanRun, CanSwim {

  @Override
  public String fly() {
    return "Утка летит";
  }

  @Override
  public String run() {
    return "Утка бежит";
  }

  @Override
  public String swim() {
    return "Утка плывёт";
  }
}
