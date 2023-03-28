package Arreglos;

import java.util.Scanner;


public class Actividad_extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int op;
        boolean val;
        val = false;
        String op2;
        while (!val) {
            System.out.println("elija opcion:");
            System.out.println("1.Suma de vector");
            System.out.println("2.Vectores iguales");
            System.out.println("3.Rellenar Vector");
            System.out.println("4.Registro del curso");
            System.out.println("5.Rellenar matriz y mostrar columna");
            System.out.println("6.Sopa de letras");
            System.out.println("7.Fibonacci en Vector");
            System.out.println("8.salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    suma();

                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equalsIgnoreCase("N") || op2.equalsIgnoreCase("n")) {
                        val = true;
                    } else {
                        val = false;
                    }

                    break;
                case 2:
                    dife();
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equalsIgnoreCase("N") || op2.equalsIgnoreCase("n")) {
                        val = true;

                    } else {
                        val = false;
                    }
                    break;
                case 3:
                    Scanner l = new Scanner (System.in);
                    System.out.println("ingrese tamanio del vector");
                    int tam = l.nextInt();
                    int[] vec = new int[tam];
                    llenar_vector(vec);
                    
                    mostrar_vec(vec);
System.out.println("\n");
                    String vale;
                    boolean val1 = false;
                    while (!val1) {

                        System.out.println("desea continuar? S/N");
                        vale = leer.next();
                        if (vale.equalsIgnoreCase("n") || vale.equalsIgnoreCase("N")) {
                            val1 = true;
                        }else val1=false;
                        break;
                    }
                    break;

                
                  case 4:
    registro();
    System.out.println("desea continuar? S/N");
    op2 = leer.next();
    if (op2.equalsIgnoreCase("N") || op2.equalsIgnoreCase("n")) {
        val = true;
    } else {
        val = false;
    }
    break;

                case 5:
                    llenar_matriz();
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equalsIgnoreCase("N") || op2.equalsIgnoreCase("n")) {
                        val = true;
                    } else {
                        val = false;
                    }

                    break;
                case 6:palabras();
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equalsIgnoreCase("N") || op2.equalsIgnoreCase("n")) {
                        val = true;
                    } else {
                        val = false;
                    }

                    break;
                case 7:fibonacci();

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
    // Realizar un algoritmo que calcule la suma de todos los elementos de un 
    //vector de tamaño N, con los valores ingresados por el usuario.

    public static void suma() {
        Scanner l = new Scanner(System.in);
        int v;
        System.out.println("Tamanio de vector:\n");
        v = l.nextInt();
        int vec[] = new int[v];
        int suma = 0;
        for (int i = 0; i < v; i++) {
            System.out.println("ingrese numero " + (i + 1));
            vec[i] = l.nextInt();
            suma += vec[i];
        }
        for (int i = 0; i < v; i++) {
            System.out.print(" [" + vec[i] + "] ");
        }
        System.out.println("\n");
        System.out.println("la suma es: " + suma);

    }
    //Escriba un programa que averigüe si dos vectores de N enteros son iguales 
    //(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
public static void dife(){
     Scanner l = new Scanner(System.in);
     int v;
        System.out.println("Tamanio de los vectores:\n");
        v = l.nextInt();
        int vec[] = new int[v];      
                int vec2[] = new int[v];
        boolean val=true;
       
            for (int i=0;i<v;i++){
                System.out.println("ingrese valor de vector 1: ");
                vec[i]=l.nextInt();
                System.out.println("ingrese valor de vector 2: ");
                vec2[i]=l.nextInt();
            }
             for (int i=0;i<v;i++){
                 if (vec[i]!=vec2[i]){
                     System.out.println("Son distintos! ");
                     val=false;
                     break;
                 }else 
                     System.out.println("Son iguales");
                 break;
                 
             }
            
    
        

}
    //Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
        //Después haremos otra función o procedimiento que imprima el vector.
public static void llenar_vector(int vec[]){
    for (int i=0;i< vec.length;i++){
        vec[i]= (int) (Math.random()*10);
    }
}
public static void mostrar_vec(int vec[]){
    for (int i =0;i< vec.length;i++){
        System.out.print("["+vec[i]+"]");
    }
}

public static void registro(){
    /*
    Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus
    10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
    Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales.
    Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
    Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
    teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
*/
    
    Scanner leer = new Scanner(System.in);
    int n1,n2,n3,n4,prom,ap,des;
    ap=0;
    des=0;
    for  (int i=0; i<2;i++){
    prom=0;
    
    System.out.println("ingrese primer nota:\n");
    n1=leer.nextInt();
     System.out.println("ingrese segunda nota:\n");
    n2=leer.nextInt();
     System.out.println("ingrese tercer nota:\n");
    n3=leer.nextInt();
     System.out.println("ingrese cuarta nota:\n");
    n4=leer.nextInt();
    prom=(n1+n2+n3+n4)/4;
    if (prom>= 7){
        ap= (ap+1);
    }else des=des+1;
    
        
    
}
    System.out.println("La cantidad de desaprovados son: " + des);
    System.out.println("La cantidad de aprobados son: "+ap);
}
//Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
public static void llenar_matriz(){
    Scanner leer = new Scanner (System.in);
    System.out.println("ingrese valor de la matriz\n");
    int n= leer.nextInt();
    int m= leer.nextInt();
    int [][]  mat= new int[n][m]; 
    int suma;
    suma=0;
    for (int i =0;i<n;i++){
        for (int j =0;j<m;j++){
           mat[i][j] = (int) (Math.random() * 10);
        suma+=mat[i][j];
    }
    }
     for (int i =0;i<n;i++){
        for (int j =0;j<m;j++){
            System.out.print("["+mat[i][j]+"]"); 
        
    }
        System.out.println(" ");
    }
    System.out.println("La suma de la matriz es: "+suma); 
}
/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando,
construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. 
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.
 Java substring(), Length() y Math.random().
*/
public static void  palabras(){
    Scanner leer = new Scanner(System.in);
   String palabra;
   int longi,num;
   boolean val=true;
   boolean error=false;
   String[][] matri= new String [20][20];
   for(int i=0;i<20;i++){
       for(int j=0;j<20;j++){
           num= (int) (Math.random()*9);
           matri[i][j]=String.valueOf(num);
       }
   }
while (val) {
    error = false;
    for (int i = 0; i < 5; i++) {
        System.out.println("Ingrese la palabra de la fila " + (i + 1));
        palabra = leer.next();
        longi = palabra.length();
        if (longi < 3 || longi > 5) {
            error = true;
            break;
        }
      for (int j=0;j<longi;j++){
          matri[i][j]=palabra.substring(j,j+1);
      } 
    }
    
  
    
    if (error) {
        System.out.println("Se encontró una palabra con longitud inválida.");
    } else {
        System.out.println("Todas las palabras tienen una longitud válida.");
        val = false;
    }
    for (int i =0;i<20;i++){
        for (int j =0;j<20;j++){
            System.out.print("["+matri[i][j]+"]"); 
        
    }
        System.out.println(" ");
    }
}
}
public static void fibonacci(){
    Scanner leer = new Scanner(System.in);
    int f,n,c1,c2;
    c1=1;
    c2=0;
    
    System.out.println("ingrese tamaño del vector: \n");
    n=leer.nextInt();
    for (int i =0;i< n;i++){
        if (i==0){
            System.out.print ("1 -");
        }
        f=c1+c2;
        System.out.print(f+"-");
        c2=c1;
        c1=f;
        
    }
    
    
}

}
