package arrays;
import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scanner.next();

            if (!(letra.equalsIgnoreCase("a")|
            letra.equalsIgnoreCase("e") |
            letra.equalsIgnoreCase("i") |
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u")) ) {
            consoantes[count] = letra;
            quantConsoantes++;
         }
count++;   }
 while(count < consoantes.length);

System.out.println("consoantes: ");
for ( String consoante : consoantes) {
    if (consoante != null)
    System.out.println(consoantes +" ");
}
System.out.println ("Quantidade consoantes " + quantConsoantes);
System.out.println (consoantes.length);

}}

        