package p1sem6class17;
import java.util.Scanner;
public class P1SEM6CLASS17 {
 public static void main(String[] args) {
      String nombre, clave;
      Scanner Entrada = new Scanner (System.in);
      System.out.println("Ingrese Nombre de Usuario:  ");
      nombre = Entrada.nextLine();
      System.out.println("Ingrese Clave de Usuario:  ");
      clave = Entrada.nextLine();
      if(nombre.equals("juan") && clave.equals("123456"))
      System.out.println("Bienvenido al sistema");
    }
 else{
    System.out.println("Nombre de Usuario o Contraseña Incorrecto");
      
      
    }
}

