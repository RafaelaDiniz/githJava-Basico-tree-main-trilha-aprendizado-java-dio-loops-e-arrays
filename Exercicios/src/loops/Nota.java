package loops;
import java.util.Scanner;

public class Nota {
    /* Faça um programa que peça uma nota entre 0 e 10.
     * mostre uma mensagem caso o valor seja invalido e continue pedindo.
     * até que o usuário informe um valor válido
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        System.out.println("nota: ");
        nota = scanner.nextInt();

        while (nota < 0 | nota > 10){
            System.out.println("nota inválida ! Digite nota novamente");
            nota = scanner.nextInt();
            
        }
    }
}
