package p3sem3clase8;
import java.util.Scanner;
public class P3SEM3CLASE8 {
   public static void main(String[] args) {
    Scanner Reader = new Scanner(System.in);
    String quieroJugar = "si";
    while (quieroJugar.equals("si")){
        System.out.println("¿Quieres seguir jugando?");
        quieroJugar = Reader.next();
    }
    }
    
}
