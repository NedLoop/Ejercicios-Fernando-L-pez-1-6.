package piis2class4;
import java.util.Scanner;
public class PIIS2CLASS4 {
 public static void main(String[] args) {
        // Programa Java para demostrar switch cae
        // con tipo de datos primitivos (int)
        int day = 6;
        String dayString;
        // Instrucción switch con tipo de datos int
        switch (day)
        {
            case 1: dayString = "Lunes"; 
                    break; 
            case 2: dayString = "Martes"; 
                    break; 
            case 3: dayString = "Miércoles"; 
                    break;
            case 4: dayString = "Jueves"; 
                    break; 
            case 5: dayString = "Viernes"; 
                    break; 
            case 6: dayString = "Sabado"; 
                    break; 
            case 7: dayString = "Domingo"; 
                    break; 
            default: dayString = "Día invalido";
                    break;
        }
        System.out.println(dayString);
                   
                   
            
        }
    }
 
