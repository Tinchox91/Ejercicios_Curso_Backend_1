
package Guia_3;

import java.util.Scanner;


public class Estructuras_de_control {
     
    
           public void pareimpar()
                   
           
    {
        Scanner leer = new Scanner(System.in);
      int  num,modu;    
        System.out.println("ingrese un numero: ");
   num= leer.nextInt();
   modu = num % 2;
   String res = (modu==0) ? "El numero "+ num + " es par" : "El numero "+ num + " es impar";
    System.out.println(res);
    
                    
}
                     public void compara()
                   
           
    {
        Scanner leer = new Scanner(System.in);
      String p1,p2;    
        System.out.println("ingrese palabra: ");
        p1 = leer.next();
        p2= "eureka";
        if (p1.equals(p2)) {
        System.out.println("¡Eureka! Las palabras son iguales.");
    } else {
        System.out.println("Las palabras son distintas.");
    }
   
}
                       public void ocholetras()
                   
           
    {
        Scanner leer = new Scanner(System.in);
      String p1;
      int p2;
        System.out.println("ingrese palabra: ");
        p1 = leer.next();
        
        if (p1.length()==8) {
        System.out.println("CORRECTO");
    } else {
        System.out.println("INCORRECTO");
    }
   
}

                       public void frase()
                   
           
    {
        Scanner leer = new Scanner(System.in);
      String cadena;
          char resp = 'A';      
        System.out.println("ingrese palabra: ");
        cadena = leer.next();
        String subcadena = cadena.substring(0,1);
             
        
        if  (subcadena.equals(String.valueOf(resp))) 
        {
        System.out.println("CORRECTO");
    } else {
        System.out.println("INCORRECTO");
    }
   
}
                        public void bucle1()
                   
           
    {
        int lim,sum;
        Scanner leer = new Scanner(System.in);
     System.out.println("Indica el valor limite: ");
     lim = leer.nextInt();
     sum =0;
     while (sum< lim) {
         System.out.println("ingrese un numero");
         sum = leer.nextInt()+ sum;
         
     }
     System.out.println("ah llegado al limite de " + lim);
               
      
}


    public static void main(String[] args) {
        Estructuras_de_control ej1 = new Estructuras_de_control();
         Estructuras_de_control ej2 = new Estructuras_de_control();
         Estructuras_de_control ej3 = new Estructuras_de_control();
         Estructuras_de_control ej4 = new Estructuras_de_control();
         Estructuras_de_control ej5 = new Estructuras_de_control();
        int op;
        Scanner leer = new Scanner (System.in);         
        
        
        
        System.out.println("indica la opcion: ");
 op = leer.nextInt();
 switch (op) {
        	case 1:
          ej1.pareimpar();
                  
           break;

        	case 2:
           ej2.compara();
            break;
            case 3:
           ej3.ocholetras();
            break;
            case 4:
           ej3.frase();
            break;
            case 5:
             ej5.bucle1();
            break;


        	default:
           System.out.println("El valor ingresado en la variable opcion es diferente" + "a todos los casos analizados por el switch");
    	}

 
}
    }