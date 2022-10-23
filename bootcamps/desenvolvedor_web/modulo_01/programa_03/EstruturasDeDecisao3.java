import java.util.Scanner;

public class EstruturasDeDecisao3 {

    public static void main(String[] args) {
        int aux;
        boolean avista, carroNovo, seguir;
        double desconto, valorCarro;

        try (Scanner Entrada = new Scanner(System.in)) {
            do {
                desconto = 0.0;
                avista = false;
                carroNovo = false;
                seguir = false;

                System.out.println("PROGRAMA PARA VENDA DE CARRO \n\n\nDigite o valor do carro (ex: 75000):");
                valorCarro = Entrada.nextDouble();

                System.out.println("O pagamento será à vista? Sim (Aperte 1), Não (apertou outro número)");
                aux = Entrada.nextInt();

                if (aux == 1) 
                    avista = true;

                System.out.println("O carro escolhido é 0km? Sim (Aperte 1), Não (apertou outro número)");
                aux = Entrada.nextInt();
                
                if (aux == 1) 
                    carroNovo = true;
                
                if (avista && carroNovo) {
                    desconto = 0.15;
                } else if (avista) {
                    desconto = 0.08;
                } else if (carroNovo) {
                    desconto = 0.05;
                } else {
                    System.out.println("Ofereça um café para o cliente.");
                }

                valorCarro -= valorCarro * desconto;

                System.out.println("Valor final para pagamento:" + valorCarro);
                System.out.println("\n\n\n\n\nCalcular o valor de uma nova venda (Aperte 1).");
                System.out.println("Encerrar o programa             (Aperte outro número)");

                aux = Entrada.nextInt();

                if (aux == 1)
                    seguir = true;
            } while (seguir);
        }
    }
}