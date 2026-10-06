
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numinicial = 0, numfinal = 0, soma = 0, controle = 0;

        System.out.print("Digite o numero inicial: ");
        numinicial = leia.nextInt();
        controle = numinicial;

        System.out.print("Digite o numero final: ");
        numfinal = leia.nextInt();

        while (controle <= numfinal) {
            soma += controle;
            controle++;
        }
        System.out.println("A soma dos números dentro da faixa numeros de : " + numinicial + " a " + numfinal + " é igual a: " + soma);
    }
}
