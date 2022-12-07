package ObjectOrientation.Enum;

public class Jogador {
  int x;
  int y;

  boolean andar(EnumDirecao direcao) {
    
      switch (direcao) {
        case NORTE:
          y--;
          break;
          case LESTE:
          x++
          break;
          case SUL:
          y++
          break;
          case OESTE:
          x--
          break;
        default: 
          break;
      }


    return true;

  }
}