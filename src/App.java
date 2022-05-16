public class App {
    public static void main(String[] args) throws Exception {
        
        // Criar o objeto semaforo
        Semaforo semaforo = new Semaforo();
        semaforo.numero = "15052-4";
        semaforo.cor = "vermelho";
        
        // chamada do método trocarCor()
        semaforo.trocarCor(); 
    }
}
