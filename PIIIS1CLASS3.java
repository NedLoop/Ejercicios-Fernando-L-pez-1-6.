package piiis1class3;
import java.util.Scanner;
public class PIIIS1CLASS3 {
    public static void main(String[] args) {
        //crear el objeto a la clase Scanner
        Scanner ingresar = new Scanner(System.in);
        //Declarar variables
        double nota;
        
        System.out.println("Favor ingresar un valor desde 1 hasta 10");
        nota = ingresar.nextDouble();
        
        while (nota<1 | nota>10)
        {
            System.out.println("Lo siento, pero el valor proporcionado no es valido");
            nota = ingresar.nextDouble();
        }
        
        
    }
    
}
