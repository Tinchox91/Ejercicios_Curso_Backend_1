
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
                       public void menu()
                   
           
    {
        int num1,num2,op,total;
        char s='N';
        
        boolean s1=false;
        Scanner leer = new Scanner(System.in);
     System.out.println("ingresa dos numeros enteros positivos: ");
     num1= leer.nextInt();
     num2= leer.nextInt();
     do{
         
        System.out.println("Elija opcion: ");
        System.out.println("1.sumar");
        System.out.println("2.restar");
        System.out.println("3.multiplicar");
        System.out.println("4.dividir");
        System.out.println("5.Salir");
        op= leer.nextInt();
        switch (op) {
            case 1:
                total= num1+num2;
                System.out.println("la suma es "+total);
                break;
                        case 2:
                total= num1-num2;
                System.out.println("la resta es "+total);
                break;
                        case 3:
                total= num1*num2;
                System.out.println("la multiplicacion es "+total);
                break;
                        case 4:
                total= num1/num2;
                System.out.println("la division es "+total);
                break;
                        case 5:
               
                System.out.println("Desea salir? S/N);");
                        s = leer.next().charAt(0);
                       if (s == 'S' || s == 's') {
                           s1= true ;
                           }
                       else{
                           s1= false;
                       }
                           
                        
                break;
                        default :
                            System.out.println("Opcion ivalida");
        }
     
    
     }while (s1==false);     
      
}
        public void rs232(){
            Scanner leer = new Scanner(System.in);
            String cadena;
            int val1,val2;
            val1=0;
            val2=0;
            
            String val = "&&";
           do{
           System.out.println("ingrese cadena");
                do{
                                cadena = leer.next();
                                if (cadena.length()> 4){
                                    System.out.println("La longitud de la cadena es incorrecto vuelva a ingresar");
                                }
            } while (cadena.length() > 4  );
               
                if (cadena.substring(0,1).equals("x") && cadena .substring(3,4).equals("o")){
               val1= val1+1;
                }
                else{val2=val2+1;
              
           }
                if (cadena.equals(val)){
                    val2=val2-1;
                    if (val2< 0) {
                        val2=0;
                    }
                }
                   
                
           }while  (!cadena.equals(val));
            System.out.println("INFORME");
                System.out.println("La cantidad de falsas son:"+ val2);
                System.out.println("La cantidad de verdaderas son : "+ val1);
            
            
            
            
            
    
} 
        public void cuadrado(){
           Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud del cuadrado: ");
        int longitud = scanner.nextInt();

        for (int i = 1; i <= longitud; i++) {
            for (int j = 1; j <= longitud; j++) {
                if (i == 1 || i == longitud || j == 1 || j == longitud) {
                    System.out.print("*");
                //} else if (j == (longitud) && i == (longitud)) {
                   // System.out.print(" "); 
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
            
            
        

    public static void main(String[] args) {
        Estructuras_de_control ej1 = new Estructuras_de_control();
         Estructuras_de_control ej2 = new Estructuras_de_control();
         Estructuras_de_control ej3 = new Estructuras_de_control();
         Estructuras_de_control ej4 = new Estructuras_de_control();
         Estructuras_de_control ej5 = new Estructuras_de_control();
         Estructuras_de_control ej6 = new Estructuras_de_control();
         Estructuras_de_control ej7 = new Estructuras_de_control();
         Estructuras_de_control ej8 = new Estructuras_de_control();
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
            case 6:
                ej6.menu();
                break;
            case 7:
                ej7.rs232();
            case 8:
                ej8.cuadrado();

        	default:
           System.out.println("El valor ingresado en la variable opcion es diferente" + "a todos los casos analizados por el switch");
    	}

 
}
    }