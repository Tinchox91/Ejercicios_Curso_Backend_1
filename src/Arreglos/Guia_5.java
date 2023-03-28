package Arreglos;

import java.util.Scanner;

public class Guia_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op;
        boolean val;
        val = false;
        String op2;
        while (!val) {
            System.out.println("elija opcion:");
            System.out.println("1.cargar numeros");
            System.out.println("2.Vector con 100 num");
            System.out.println("3.Buscador");
            System.out.println("4.digitos");
            System.out.println("5.traspuesta");
            System.out.println("6.simetrica");
            System.out.println("7.cuadrado magico");
            System.out.println("8.salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    cargar_numeros();
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equalsIgnoreCase("N") || op2.equalsIgnoreCase("n")) {
                        val = true;
                    } else {
                        val = false;
                    }

                    break;
                case 2:
                    llenar_vector();
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equalsIgnoreCase("N") || op2.equalsIgnoreCase("n")) {
                        val = true;

                    } else {
                        val = false;
                    }
                    break;
                case 3:

                    String vale;
                    boolean val1 = false;
                    while (!val1) {
                        buscar();
                        System.out.println("desea continuar? S/N");
                        vale = leer.next();
                        if (vale.equalsIgnoreCase("n") || vale.equalsIgnoreCase("N")) {
                            val1 = true;
                        }
                    }
                    break;
                    
                case 4:
                    digitos();
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equalsIgnoreCase("N") || op2.equalsIgnoreCase("n")) {
                        val = true;
                    } else {
                        val = false;
                    }

                    
                case 5:
                    traspuesta();
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equalsIgnoreCase("N") || op2.equalsIgnoreCase("n")) {
                        val = true;
                    } else {
                        val = false;
                    }

                    break;
                case 6:simetrica();
                System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equalsIgnoreCase("N") || op2.equalsIgnoreCase("n")) {
                        val = true;
                    } else {
                        val = false;
                    }

                break;
                case 7:
                    cuadradomagico();
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equalsIgnoreCase("N") || op2.equalsIgnoreCase("n")) {
                        val = true;
                    } else {
                        val = false;
                    }
                    break;

                case 8:
                    // System.out.println("desea continuar? S/N");
                    /// op2 = leer.next();
                    //  if (op2.equalsIgnoreCase("N") || op2.equalsIgnoreCase("n")) {
                    val = true;

                //  } else {
                //     val = false;
                //  }

            }

        }

    }

    public static void cargar_numeros() {
        int ar;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa tamaño de arreglo");
        ar = leer.nextInt();
        int n;
        int[] arreglo = new int[ar];
        for (int i = 0; i < ar; i++) {
            System.out.println("ingrese el numero " + (i + 1));
            arreglo[i] = leer.nextInt();
        }
        for (int e = 0; e < ar; e++) {
            System.out.println("el numero " + (e + 1) + " es: " + arreglo[e]);
        }
    }

    public static void llenar_vector() {
        int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i] = (i + 1);
            System.out.println("numero: " + vector[i]);
        }
    }

    public static void buscar() {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[10];
        boolean val = false;
        int v, cont, i;
        cont = 0;
        for (i = 0; i < 10; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        System.out.println("indica el numero del 1 al 10 a buscar :");
        v = leer.nextInt();
        for (i = 0; i < 10; i++) {
            System.out.print(vector[i] + " ");
        }

        for (i = 0; i < 10; i++) {

            if (v == vector[i]) {
                System.out.println("el numero fue encontrado en la posicion: " + (i + 1));
                cont = cont + 1;

            }

        }
        if (cont > 1) {
            System.out.println("El numero se encuentra repetido " + cont + " veces");
        }
        if (cont == 0) {
            System.out.println("El numero " + v + " no se encuentra");
        }
        cont = 0;

    }

    public static void digitos() {
        ///Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        int d1, d2, d3, d4, d5;
        String n;
        d1 = 0;
        d2 = 0;
        d3 = 0;
        d4 = 0;
        d5 = 0;
        int[] vector = new int[30];
        for (int i = 0; i < 30; i++) {
            int x = (int) (Math.random() * 100000);
            //int x = (int) (Math.random() * (100000 - 0 + 1)) + 0;
            vector[i] = x;
        }

        for (int i = 0; i < 30; i++) {
            n = String.valueOf(vector[i]);
            if (n.length() == 1) {
                d1++;
            }
            if (n.length() == 2) {
                d2++;
            }
            if (n.length() == 3) {
                d3++;
            }
            if (n.length() == 4) {
                d4++;
            }
            if (n.length() == 5) {
                d5++;
            }

        }

        System.out.println("la cantidad de numeros con un digito son: " + d1);
        System.out.println("la cantidad de numeros con dos digitos son: " + d2);
        System.out.println("la cantidad de numeros con tres digitos son: " + d3);
        System.out.println("la cantidad de numeros con cuatro digitos son: " + d4);
        System.out.println("la cantidad de numeros con cinco digitos son: " + d5);

        for (int i = 0; i < 30; i++) {
            System.out.print(vector[i] + " ");

        }

    }
    //Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
    //La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

    public static void traspuesta() {

        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int e = 0; e < 4; e++) {
                matriz[i][e] = (int) (Math.random() * 9);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int e = 0; e < 4; e++) {
                System.out.print(matriz[i][e] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("----------------------------------");
        for (int i = 0; i < 4; i++) {
            for (int e = 0; e < 4; e++) {
                System.out.print(matriz[e][i] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void simetrica() {
        boolean val;
        val = true;
        Scanner l = new Scanner(System.in);
        int[][] matriz1 = new int[4][4];
        int[][] trasp = new int[4][4];
        for (int i = 0; i < 4; i++) {   ///le damos valor random a matriz1
            for (int e = 0; e < 4; e++) {
                matriz1[i][e] = (int) (Math.random() * 9);
            }
        }
        //for (int i = 0; i < 4; i++) { ///le damos los valores manualmente por consola a matriz1
        // for (int e = 0; e < 4; e++) {
        // System.out.println("valor de "+ (i+1)+ "-"+ (e+1) );
        //  matriz1 [i][e] = l.nextInt();
        // }
        //  }

        for (int i = 0; i < 4; i++) { ///le damos los valores transpuestos de matriz1 a la matriz "trasp"
            for (int e = 0; e < 4; e++) {
                trasp[i][e] = matriz1[e][i];
            }
        }
        for (int i = 0; i < 4; i++) {///mostramos la matriz matriz1
            for (int e = 0; e < 4; e++) {
                System.out.print(matriz1[i][e] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("-----------------------");
        for (int i = 0; i < 4; i++) {///mostramos trasp
            for (int e = 0; e < 4; e++) {
                System.out.print(trasp[i][e] + " ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 4; i++) {
            for (int e = 0; e < 4; e++) {
                if (matriz1[i][e] != trasp[i][e]) {
                    val = false;
                    break;
                } else {
                    break;
                }

            }
        }
        if (val) {
            System.out.println("ES SIMETRICA");
        } else {
            System.out.println("NO ES SIMETRICA");
        }

    }

    public static void cuadradomagico() {
        int[][] m = new int[4][4];
        int i, e;           
                Scanner l = new Scanner(System.in);
           //CARGAR Y VALIDAR LOS NUMEROS DE LA MATRIZ
        for (i = 0; i < 4; i++) {
            for (e = 0; e < 4; e++) {
                System.out.println("Ingrese el valor " + e + " de " + i);
                int valor = l.nextInt();
                if (valor > 9) {
                    System.out.println("El valor ingresado es mayor a 9. Intente de nuevo.");
                    e--; // decrementa e para volver a pedir el mismo índice en la siguiente iteración
                    continue;
                }
                m[i][e] = valor;
            }
        }
        //MOSTRAR MATRIZ
        for (i = 0; i < 4; i++) {
            for (e = 0; e < 4; e++) {
                System.out.print("[" + m[i][e] + "] ");
            }
            System.out.println(" ");
        }
        //SUMAR FILAS
       
        int sumaMagica = m[0][0] + m[0][1] + m[0][2];
         // Verificar que la suma de cada fila es igual a la suma mágica
        boolean esMagico = true;
        for (i = 0; i < 4; i++) {
            int sumaFila = 0;//se reinicia el contador
            for (e = 0; e < 4; e++) {
                sumaFila += m[i][e];//se va sumando a sumaFila la matriz
            }
            if (sumaFila != sumaMagica) {//si comprueba que es distinto detiene el bucle y es magico es falso
                esMagico = false;
                break;
            }
        }
         //Verificar que la suma de cada columna es igual a la suma mágica
        if (esMagico) {//solo se ejecuta si esmagico sigue siendo true
            for (i = 0; i <4; i++) {
                int sumaColumna = 0;
                for ( e = 0; e < 4; e++) {
                    sumaColumna += m[i][e];
                }
                if (sumaColumna != sumaMagica) {
                    esMagico = false;
                    break;
                }
            }
        }
           // Verificar que la suma de la diagonal secundaria es igual a la suma mágica
        if (esMagico) {
            int sumaDiagonalSecundaria = m[0][2] + m[1][1] + m[2][0];
            if (sumaDiagonalSecundaria != sumaMagica) {
                esMagico = false;
            }
        }
        
        // Mostrar el resultado
        if (esMagico) {
            System.out.println("El cuadrado es magico.");
        } else {
            System.out.println("El cuadrado no es magico.");
        }
    }
}


   
    
