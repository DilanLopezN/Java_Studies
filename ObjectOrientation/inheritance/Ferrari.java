package ObjectOrientation.inheritance;

public class Ferrari extends Car {

  @Override
  void speed(int speedVelocity) {
    velocity = speedVelocity + 5;
  }
  
   public static void main(String[] args) {

      Ferrari ferrari1 = new Ferrari();

      ferrari1.speed(10);

      System.out.println(ferrari1.velocity);

   }}
