package p1sem6class16;
import java.util.Scanner;
public class P1SEM6CLASS16 {
    public static void main(String[] args) {
        int n1, n2, n3;
    Scanner Entrada = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    n1 = Entrada.nextInt();
    System.out.println("Ingrese un número: ");
    n2 = Entrada.nextInt();
    System.out.println("Ingrese un número: ");
    n3 = Entrada.nextInt();
    if ((n1>n2)&&(n2>n3)){
        System.out.println("El orden es: "+n1+n2+n3);
    } 
    else if ((n1>n3)&&(n3>n2)){
        System.out.println("El orden es: "+n1+n3+n2);
    }
    else if ((n2>n1)&&(n1>n3)){
        System.out.println("El orden es: "+n2+n1+n3);
    }
    else if ((n2>n3)&&(n3>n1)){
        System.out.println("El orden es: "+n2+n3+n1);
    }
    else if ((n3>n2)&&(n2>n1)){
        System.out.println("El orden es: "+n3+n2+n1);
    } 
    else{
        System.out.println("El orden es: " + n3 + n2 + n1);
        
        
        
    }
    
        
    }
    
}
