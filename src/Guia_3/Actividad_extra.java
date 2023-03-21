package Guia_3;

import java.util.Scanner;

public class Actividad_extra {

    public void dias() {
        Scanner leer = new Scanner(System.in);
        float dia, hora, min;
        System.out.println("ingrese minutos: ");
        min = leer.nextFloat();
        hora = min / 60;
        dia = hora / 24;

        System.out.println("la cantidad de horas por " + min + " es: " + hora);
        System.out.println("la cantidad de dias por " + min + " es: " + dia);

    }

    public void intercambio() {
        Scanner leer = new Scanner(System.in);
        int A, B, C, D, aux;
        System.out.println("ingrese 4 valores");
        A = leer.nextInt();
        B = leer.nextInt();
        C = leer.nextInt();
        D = leer.nextInt();
        System.out.println("el valor de A:" + A);
        System.out.println("el valor de B:" + B);
        System.out.println("el valor de C:" + C);
        System.out.println("el valor de D:" + D);
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("intercambiados es: ");
        System.out.println("el valor de A:" + A);
        System.out.println("el valor de B:" + B);
        System.out.println("el valor de C:" + C);
        System.out.println("el valor de D:" + D);

    }

    public void vocales() {
        Scanner leer = new Scanner(System.in);
        char palabra;
        boolean val, salir;
        salir = false;
        val = false;

        do {
            System.out.println("ingrese letra");
            palabra = leer.next().charAt(0);
            if ("aeiou".indexOf(palabra) != -1) {          //.indexOf() busca el caracter ingresado dentro de una cadena si no lo encuentra devuelve -1
                val = true;

                System.out.println("ES VOCAL!!");
            } else {
                System.out.println("NO ES VOCAL!!");
                val = false;
            }
            System.out.println("desea continuar? marque 1 sino marque otro numero");
            String op = leer.next();
            if (String.valueOf(op).equals("1")) {
                salir = true;
            } else {
                salir = false;

            }

        } while (!salir);

    }

    public void romanos() {
        Scanner leer = new Scanner(System.in);
        int num;
        String[] roman = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        do {
            System.out.println("ingrese numero del 1 al 10: ");
            num = leer.nextInt();
        } while (num < 1 || num > 10);
        System.out.println("el numero" + num + " en numeros romanos es: " + roman[num]);
    }

    public void mutual() {
        Scanner leer = new Scanner(System.in);
        char socio;
        float costo, a, b;
        socio = 'x';
        while (socio != 'a' && socio != 'b' && socio != 'c') {
            System.out.println("ingrese que tipo de socio es: ");
            socio = leer.next().charAt(0);
        }
        System.out.println("INGRESE EL COSTO DEL TRATAMIENTO: ");
        costo = leer.nextFloat();
        a = (costo * 50) / 100;
        b = (costo * 35) / 100;
        switch (socio) {
            case 'a':
                System.out.println("el costo del tratamiento queda en " + a);
                break;
            case 'b':
                System.out.println("el costod del tratamiento queda en: " + b);
                break;
            case 'c':
                System.out.println("el costo del tratamiento es: " + costo);
                break;
            default:
                System.out.println("OPCION INVALIDA!");

        }

    }
    public void maximo(){
    Scanner leer = new Scanner (System.in);
    int op,max,min,cont,num2,num;
    float cont2=0.0f,prom;
    boolean val = false;
    max=0;
    min=Integer.MAX_VALUE;
   
    cont=0;
    cont2=0;
        System.out.println("indica la version que desea:");
        System.out.println("1.version while");
        System.out.println("2.version do while");
        op=leer.nextInt();
    switch (op){
            case 1:
                System.out.println("ingrese la cantidad de numeros:");
                 num = leer.nextInt();
                while (val != true) {
                    
                    System.out.println("ingrese numero: ");
                    num2 = leer.nextInt();
                  
                    cont2 = cont2 + num2;
                    if (num2 > max) {
                        max = num2;
                    }
                    if ( num2 < min ) {
                        min= num2;
                    }
                    if (cont==num){
                       val=true;
                    }
                    cont = cont + 1;

                }
                prom=cont2/num;
                System.out.println("el numero maximo es: "+max);
                System.out.println("el numero minimo es "+min);
                System.out.println("el promedio es: "+prom);
                break;
            case 2:
                 System.out.println("ingrese la cantidad de numeros:");
                 num = leer.nextInt();
                do {
                    System.out.println("ingresa el numero");
                    num2 = leer.nextInt();
                   cont = cont + 1;
                    cont2 = cont2 + num2;
                    if (num2 > max) {
                        max = num2;
                    }
                    if ( num2 < min ) {
                        min= num2;
                    }
                    if (cont==num){
                       val=true;
                    }
                     
                    prom=cont2/num;
                
                    
                    
                }while (!val);
                System.out.println("el numero maximo es: "+max);
                System.out.println("el numero minimo es "+min);
                System.out.println("el promedio es: "+prom);
                
                break;
            default:
                System.out.println("opcion invalida!");
        }

    
        
        
}

    public void estatura() {
        float promedio, e, e2, prom2, e22;
        int p;
        p = 0;
        e = 0;
        e2 = 0;
        e22 = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese numero de personas:");
        int personas = leer.nextInt();
        for (int i = 0; i < personas; i++) {
            System.out.println("ingrese estatura");
            float estatura1 = leer.nextFloat();
            if (estatura1 < 1.60) {
                e = e + estatura1;
                p = p + 1;
            }

            e2 = e2 + 1;
            e22 = e22 + estatura1;
        }
        promedio = e / p;
        prom2 = e22 / e2;
        System.out.println("el promedio es: " + promedio);
        System.out.println("el promedio general es: " + prom2);

    }

    public void multiplo() {
        Scanner leer = new Scanner(System.in);
        int par, impar, num, total, val1, val2;
       
        total=0;
        par = 0;
        impar = 0;
        
        do {
            System.out.println("esriba un numero que no sea multiplo de 5: ");
            num = leer.nextInt();
            total = total + 1;
            val1 = num % 2;
            val2 = num % 5;
            if (val1 == 0) {
                par = par + 1;

            } else {
                impar = impar + 1;

            }
            if (val2 == 0) {
                System.out.println(num+" Es multiplo de 5");
                break;

            }
        }while (num > 0);
            System.out.println("el total de pares son: " + par);
            System.out.println("el total de impares son: " + impar);
            System.out.println("el total de numeros son: " + total);
        
        }
        
public void division(){
    int n1,n2,total,cont;
    Scanner leer= new Scanner(System.in);
    System.out.println("ingrese dos numeros");
    n1= leer.nextInt();
    n2= leer.nextInt();
    total=n1;
    cont=0;
    while (total> n2){
        total= total-n2;
        cont=cont+1;
    }
    System.out.println("el residuo es: "+total);
    System.out.println("el cociente es: "+cont);
    
    
}
public void adivina(){
    int n1,n2,adivi,total;
    boolean val;
    val=false;
    Scanner leer = new Scanner(System.in);
    n1 = (int)(Math.random() * 11);
    n2 = (int)(Math.random() * 11);
    total= n1*n2;
    do{
    System.out.println("ingrese el numero !"+total);
    adivi= leer.nextInt();
    if (adivi==total){
        System.out.println("CORRECTO");
        
        val=true;
    }
    }while (!val);
    
}
public truncado(){
    
    
}
    public static void main(String[] args) {
        Actividad_extra ej1 = new Actividad_extra();
        Actividad_extra ej2 = new Actividad_extra();
        Actividad_extra ej3 = new Actividad_extra();
        Actividad_extra ej4 = new Actividad_extra();
        Actividad_extra ej5 = new Actividad_extra();
        Actividad_extra ej6 = new Actividad_extra();
        Actividad_extra ej7 = new Actividad_extra();
        Actividad_extra ej8 = new Actividad_extra();
        Actividad_extra ej9 = new Actividad_extra();
        Actividad_extra ej10 = new Actividad_extra();
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar opcion:");
        System.out.println("1.calcular dias/horas");
        System.out.println("2.intercambio");
        System.out.println("3.vocales");
        System.out.println("4.numeros romanos3"
                + "");
        System.out.println("5.Mutual");
        System.out.println("6.Estatura:");
        System.out.println("7.Numero maximo");
        System.out.println("8.multiplo de 5");
        System.out.println("9.Division con restas");
        System.out.println("10.adivina!");
        int op = leer.nextInt();

        switch (op) {
            case 1:
                ej1.dias();
                break;
            case 2:
                ej2.intercambio();
                break;
            case 3:
                ej3.vocales();
                break;
            case 4:
                ej4.romanos();
                break;
            case 5:
                ej5.mutual();
                break;
            case 6:
                ej6.estatura();
                break;
            case 7:
                ej7.maximo();
                break;
            case 8:
                ej8.multiplo();
            case 9:
                ej9.division();
            case 10:
                ej10.adivina();
            default:
                System.out.println("OPCION INVALIDA!");
        }

    }

}
