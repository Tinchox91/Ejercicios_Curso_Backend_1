
package Primer_soft;

import java.util.Scanner;


public class ejercicio_1 {
    int num1,num2,total;
     public void ingresarNumero() {
         Scanner leer = new Scanner (System.in);
        System.out.println("ingrese el primer numero: ");
        num1 = leer.nextInt();
        System.out.println("ingrese el segundo numero: ");
        num2 = leer.nextInt();
        total = num1+ num2;
        System.out.println("el total de la suma es: " + total);
        
     }
    
}
