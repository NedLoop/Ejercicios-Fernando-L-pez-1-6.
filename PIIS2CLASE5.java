package piis2clase5;
public class PIIS2CLASE5 {
    public static void main(String[] args) {
        // Programa Java para declarar
        // declaraciones switch case anidadas
        String Branch = "CSE";
        int year = 2;
        
        switch(year)
        {
            
            case 1 :
                System.out.println("Cusrsos electivos: Inglés, Calculo.");
                break;
            case 2 :
                switch (Branch) // switch anidado
                {
                    case "CSE":
                    case "CCE":
                        System.out.println("Cursos electivos: Machine Learning, Big Data.");
                    break;
                    
                    case "ECE":
                        System.out.println("Cursos electivos: Programación.");
                    break;
                    
                    default:
                        System.out.println("Cursos electivos: Ingeniería de Software.");
                }    
            
        }
    }
    
}
