import interfaces.CanRun;
import interfaces.CanSwim;

public class Penguin implements CanRun, CanSwim {

  @Override
  public String run() {
    return "Пингвин умеет бежать";
  }

  @Override
  public String swim() {
    return "Пингвин умеет плавать";
  }
}
