
package Guia4;

import java.util.Scanner;


public class Subprogramas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op,op2;
        boolean val;
        val = false;
       
        while (!val){
             System.out.println("indica opcion: ");
        System.out.println("1.calculadora");
        System.out.println("2.datos de personas");
        System.out.println("3.convertidor de monedas");
        System.out.println("4.numero primo");
        System.out.println("5.salir");
        op = leer.nextInt();
        switch (op){
            case 1:
                int n1,n2;
                System.out.println("ingrese dos numeros");
                n1= leer.nextInt();
                n2=leer.nextInt();
                System.out.println("ingrese opcion: ");
                System.out.println("sumar");
                System.out.println("restar");
                System.out.println("dividir");
                System.out.println("multiplicar");
                op2= leer.nextInt();
                int total;
                switch (op2){
                    case 1:
                         total = sumar(n1,n2);
                        System.out.println("la suma es: "+total);
                        break;
                    case 2:
                         total = restar(n1,n2);
                        System.out.println("la resta es: "+total);
                        break;
                    case 3:  total = dividir(n1,n2);
                        System.out.println("la dividision es: " + total);
                        break;
                    case 4: total= multiplicar(n1,n2);
                        System.out.println("la multiplicaion es: "+total);
                        break;
                    default:System.out.println("opcion invalida!");
                        
                }
                
                
                break;
            case 2:
                personas();
                break;
            case 3:
                converter();
                break;
            case 4:System.out.println("ingrese numero:_");
            int num = leer.nextInt();
            boolean essprimo;
            essprimo= esprimo(num);
            if (essprimo==true){
                System.out.println(num+ " es primo");
            }else System.out.println(num+ " no es primo");
            
            
            
            case 5:
                val= true;
                break;
            default:
                System.out.println("numero invalido");
        }
        
        }
        
    }
    public static int sumar(int n1,int n2){
        int suma;
        suma= n1+n2;
        return suma;
        }
         public static int restar(int n1,int n2){
        int resta;
        resta= n1-n2;
        return resta;
    
    }
     public static int multiplicar(int n1,int n2){
        int mult;
        mult= n1*n2;
        return mult;
    
    }
         public static int dividir(int n1,int n2){
        int div;
        div= n1/n2;
        return div;
    
    }
     public static void personas() {
        Scanner leer = new Scanner(System.in);
        int edad, cantidad;
        String nombre, op;
        boolean val;
        val = false;
        while (!val) {
            System.out.println("ingrese nombre");
            nombre = leer.next();
            System.out.println("edad:");
            edad = leer.nextInt();
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad!");
                

                
                    
                }else System.out.println(nombre+ " es menor de edad!");
            System.out.println("desea seguir cargando nombres? indica S o N");
                op = leer.next();
                if (op.equals("s") ||op.equals("S")) {
                    val = false;}
                else val =true;
                        
                
           
        
            }
        }
     public static void converter(){
           Scanner leer = new Scanner(System.in);
           double num,lib,usd,yen;
           boolean op;
           op = false;
           while (!op){
               System.out.println(" ingrese monto: ");
               num= leer.nextFloat();
               lib=num*0.86;
               usd=num*1.28611;
               yen=num*129.852;
               System.out.println(num+"Euros convertidos a libras son "+lib +" Libras");
               System.out.println(num+"Euros convertidos a dolares son "+usd +" USD");
               System.out.println(num+"Euros convertidos a yenes son "+yen +" Yenes");
               System.out.println("desea continuar? S/N");
               String op2 = leer.next();
               if(op2.equalsIgnoreCase("N")||op2.equalsIgnoreCase("n")){
                   op=true;
                   
               }
               
               
           }
}
     public static boolean esprimo(int num) {
    if (num < 2) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}
             

}
         

