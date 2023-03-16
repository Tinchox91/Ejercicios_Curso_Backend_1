
package Primer_soft;

import java.util.Scanner;


public class Ejercicio_3 {
 
  
    public void convertircadena()
    { 
            String mayus,min,frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese frase: ");
        frase = leer.nextLine();
        mayus = frase.toUpperCase();
        min = frase.toLowerCase();
        System.out.println("la frase en masyuculas es: "+mayus);
        System.out.println("la frase en minusculas es: "+min);
        
    
    }
}
