package ObjectOrientation.inheritance;

public class Car {
  int velocity = 0;

  void speed(int speedVelocity) {
    velocity += speedVelocity;

  
  }

  int brake(int brakeVelocity) {
    velocity -= brakeVelocity;

    return velocity;
  }
  
}


