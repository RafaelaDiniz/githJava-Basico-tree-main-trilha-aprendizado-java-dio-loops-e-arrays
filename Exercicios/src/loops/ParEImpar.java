package loops;
import java.util.Scanner;

public class ParEImpar {

    public static void main(String[] args) {
        /*
    Faça um programa que peça N números inteiros,
    calcule e mostre a quantidade de números pares
    e a quantidade de números impares.
    */
    Scanner scanner = new Scanner(System.in);
    int numero;
    int quantNumeros;
    int quantPares = 0;
    int quantImpares = 0;

    System.out.println(" Quantidade de números: ");
    quantNumeros = scanner.nextInt();
    int count = 0;
    do {
        System.out.println("numero: ");
        numero= scanner.nextInt();

    
    if (numero % 2 == 0) quantPares++;
    else quantImpares++;


    count++;
    } 
    while (count < quantNumeros);

    System.out.println("Quantidade pares:" + quantPares);
    System.out.println("Quantidade ímpares: " + quantImpares);

    }       
}


