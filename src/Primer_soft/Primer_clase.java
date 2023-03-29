
package Primer_soft;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Primer_clase {
    
  public static void main(String[] args) {
      ejercicio_1 ejer1 = new ejercicio_1();
      ejercicio_2 ejer2 = new ejercicio_2();
      Ejercicio_3 ejer3 = new Ejercicio_3();
      Ejercicio_4 ejer4 = new Ejercicio_4();
      Ejercicio_5 ejer5 = new Ejercicio_5();
      Clase_6 cla6 = new Clase_6();
      Scanner leer = new Scanner(System.in);
        int op;
        boolean val;
        val = false;
        String op2;
        while (!val) {
            System.out.println("elija opcion:");
            System.out.println("1.Ingresar numero");
            System.out.println("2.Ingresar nombre");
            System.out.println("3.Convertir cadena");
            System.out.println("4.Convertir f a grados");
            System.out.println("5.Calculadora");
            System.out.println("6.simetrica");
            System.out.println("7.Salir");
          
            op = leer.nextInt();
            switch (op) {
                case 1:
                     ejer1.ingresarNumero();
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equalsIgnoreCase("N") || op2.equalsIgnoreCase("n")) {
                        val = true;
                    } else {
                        val = false;
                    }

                    break;
                case 2:
                    ejer2.ingresarNombre() ;
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equalsIgnoreCase("N") || op2.equalsIgnoreCase("n")) {
                        val = true;

                    } else {
                        val = false;
                    }
                    break;
                case 3:
                    ejer3.convertircadena();
                    String vale;
                    boolean val1 = false;
                    while (!val1) {
                       
                        System.out.println("desea continuar? S/N");
                        vale = leer.next();
                        if (vale.equalsIgnoreCase("n") || vale.equalsIgnoreCase("N")) {
                            val1 = true;
                        }
                    }
                    break;
                    
                case 4:
                    ejer4.equit();
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equalsIgnoreCase("N") || op2.equalsIgnoreCase("n")) {
                        val = true;
                    } else {
                        val = false;
                    }
                    break;
                    
                case 5:
                    ejer5.calculadora();
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equalsIgnoreCase("N") || op2.equalsIgnoreCase("n")) {
                        val = true;
                    } else {
                        val = false;
                    }

                    break;
                case 6:cla6.hola();
                System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equalsIgnoreCase("N") || op2.equalsIgnoreCase("n")) {
                        val = true;
                    } else {
                        val = false;
                         break;
                    }

               
                default:
                System.out.println("numero invalido");
                
            
     
   
  }   
       
    
        }          
  }
}