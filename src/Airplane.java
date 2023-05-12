import interfaces.CanFly;

public class Airplane implements CanFly {

  @Override
  public String fly() {
    return "Самолёт летит";
  }
}
