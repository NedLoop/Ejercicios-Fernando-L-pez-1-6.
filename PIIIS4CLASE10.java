package piiis4clase10;
import java.util.Scanner;
public class PIIIS4CLASE10 {
   public static void main(String[] args) {
        int fact=1, num, cont=1;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num = Entrada.nextInt();
        do {
            fact = fact*cont;
            cont = cont+1;
        } while (cont<=num);
        System.out.println("El factorial es: "+fact);
        }
    }

}
