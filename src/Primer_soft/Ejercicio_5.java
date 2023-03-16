
package Primer_soft;

import java.util.Scanner;


public class Ejercicio_5 {
    public void calculadora(){
      int num,doble,triple;      
      float raiz;
      Scanner leer = new Scanner(System.in);
      System.out.println ("ingrese su numero: ");
      num = leer.nextInt();
      doble = num*2;
      triple= num*3;
      raiz = (float) Math.sqrt(num);
       System.out.println ("el doble de "+num+"es: "+doble);
       System.out.println ("el triple de "+num+"es: "+triple);
       System.out.println ("la raiz cuadrada de "+num+"es: "+raiz);
    
}
    }
