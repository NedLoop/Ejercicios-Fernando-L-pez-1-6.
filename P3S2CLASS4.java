package p3s2class4;
import java.util.Scanner;
public class P3S2CLASS4 {
    public static void main(String[] args) {
        Scanner ojetoNum = new Scanner(System.in);
        
        int valinicial, valfinal;
        
        valinicial=5;
        System.out.println("Multiplos de 5 hasta 500");
        
        while (valinicial<=500)
            
        {
            System.out.println(valinicial+",");
            valinicial=valinicial+5;
        }
    
        
    }
    
}
