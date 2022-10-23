import java.util.Scanner;

public class EstruturasDeDecisao1 {

    public static void main(String[] args) {
        int num1, num2;
        double div = 0;
        boolean ok = false;

        try (Scanner Entrada = new Scanner (System.in)) {
            System.out.println("Digite um número inteiro maior que 100 (ex: 150):");

            num1 = Entrada.nextInt();

            System.out.println("Digite um número inteiro menor que 10 (ex: 6)");

            num2 = Entrada.nextInt();
        }

        if ((num1 > 100) && (num2 < 10)) {
            System.out.println("Muito bem, valores válidos.");
            ok = true;
            div = num1 / num2;
        } else if (((num1 < 100) && (num2 < 10)) || ((num1 > 100) && (num2 > 10))) {
            System.out.println("Alguns dos números está fora dos limites.");
        } else {
            System.out.println("Você não respeita as regras");
        }

        if (ok) {
            System.out.println("O valor da divisão é: " + div);
        }
    }
}