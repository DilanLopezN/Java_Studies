package ObjectOrientation.inheritance;

public class Car {
  int velocity = 0;

  int speed(int speedVelocity) {
    velocity += speedVelocity;

    return velocity;
  }

  int brake(int brakeVelocity) {
    velocity -= brakeVelocity;

    return velocity;
  }


  
}


