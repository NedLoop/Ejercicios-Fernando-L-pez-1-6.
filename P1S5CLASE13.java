package p1s5class13;
import java.util.Scanner;
public class P1S5CLASE13 {
 public static void main(String[] args) {
       int plato, cantida;
       Scanner Entrada = new Scanner(System.in);
       System.out.println("Ingrese 1 o 2 según el plato que desee: " );
       plato = Entrada.nextInt();
       System.out.println("Numero de ordenes: " );
     int cantidad = Entrada.nextInt();
     double totalInicial = 0, descuento, totalFinal = 0, precioPlato1 = 5, precioPlato2 = 7;
     if (plato == 1){
         if (cantidad >= 1 & cantidad <=5 ){
             descuento = 0.05;
             totalInicial = cantidad * precioPlato1;
             totalFinal = totalInicial - (totalInicial * descuento);
         } else if (cantidad >= 6 & cantidad <=10 ){
             descuento = 0.07;
             totalInicial = cantidad * precioPlato1;
             totalFinal = totalInicial - (totalInicial * descuento);
         } else if (cantidad >= 11){
             descuento = 0.09;
             totalInicial = cantidad * precioPlato1;
             totalFinal = totalInicial - (totalInicial * descuento);
         
     } else {
             System.out.println("Cantidad equivocada");
         }
     } else if (plato == 2){
           if (cantidad >= 1 & cantidad <=5 ){
             descuento = 0.06;
             totalInicial = cantidad * precioPlato1;
             totalFinal = totalInicial - (totalInicial * descuento);
         } else if (cantidad >= 6 & cantidad <=10 ){
             descuento = 0.09;
             totalInicial = cantidad * precioPlato1;
             totalFinal = totalInicial - (totalInicial * descuento);
         } else if (cantidad >= 11){
             descuento = 0.12;
             totalInicial = cantidad * precioPlato1;
             totalFinal = totalInicial - (totalInicial * descuento);
         
     } else {
             System.out.println("Cantidad equivocada");
     }
     } else {
         System.out.println("Plato equivocado");
     }
     System.out.println("El menu es: "+plato);
     System.out.println("La cantidad es: "+cantidad);
     System.out.println("El total inicial es: "+totalInicial);
     System.out.println("EL final total es: "+totalFinal);
    }
    
}
