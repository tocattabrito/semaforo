

public class Semaforo {
 
  String numero;
  String cor;
  void trocarCor() {
      
    if (cor == "vermelho") {
      System.out.format("Semaforo: %s\nStatus: %s\n -- Mensagem --\n Pare!",numero, cor); 
      }

    if (cor == "verde") {
      System.out.format("Semaforo: %s\nStatus: %s\n -- Mensagem --\n Pare!",numero, cor);   
    }

    if (cor == "amarelo") {
      System.out.format("Semaforo: %s\nStatus: %s\n -- Mensagem --\n Pare!",numero, cor);    }
  }
}