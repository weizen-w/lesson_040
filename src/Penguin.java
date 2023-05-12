import interfaces.CanRun;
import interfaces.CanSwim;

public class Penguin implements CanRun, CanSwim {

  @Override
  public String run() {
    return "Пингвин бежит";
  }

  @Override
  public String swim() {
    return "Пингвин плывёт";
  }
}
