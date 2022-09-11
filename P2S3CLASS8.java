package p2s3class8;
import java.util.Scanner;
public class P2S3CLASS8 {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int numero;
        numero = ingresar.nextInt();
        for (int i =1; i<=10; i++){
            System.out.println(numero + " * " + i + "=" + numero * i);
        }
    }
    
}
