package period1sem5class15;
import java.util.Scanner;
public class PERIOD1SEM5CLASS15 {
 public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese base la base: ");
        double base = Entrada.nextDouble();
        System.out.println("Ingrese el exponente: ");
        double exponente = Entrada.nextDouble();
        double resultado = Math.pow(base, exponente);
        System.out.println("El resultado es: "+resultado);
    }
    
}
