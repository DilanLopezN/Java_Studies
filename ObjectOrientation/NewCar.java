package ObjectOrientation;


public class NewCar {
  public static void main(String[] args) {
    CarroMethods carro1 = new CarroMethods();
    System.out.println(carro1.estaLigado());

    carro1.ligar();
    System.out.println(carro1.estaLigado());

    System.out.println(carro1.motor.giros());

    carro1.acelerar();
    System.out.println(carro1.motor.giros());

    carro1.frear();
    carro1.frear();
    carro1.frear();
    carro1.frear();
    System.out.println(carro1.motor.giros());

  }
}
