package com.mycompany.conditionals.app;
import java.util.Scanner;

/**
 *
 * @author fullm
 */
public class main {
    
    private static void reference(int num[]) {
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("posicion: ");
            num[i] = sc.nextInt();
        }
    }
    
    private static void reference2(int num[]) {
               
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
    
    /*
    private void reference3(int num[]) {
        // int num[] = new int[5];
        
    }
    */
    
    public void getAllEmployeeData(Object dataEmployee) {
        
    }
    
    public static void main(String[] args) {
        
        int n1 = 5;
        int n2 = 6;
        int n3;
        String messge;

        if (n1 > n2 ) {
            n3 = 10;
        } else {
            n3 = 5;
        }
        n3 = n1 > n2 ? 10 : 5;
        System.out.println(n3);
        
        //int num[] = new int[5];
        
        //reference(num);
        //reference2(num);

        /*
        System.out.println("Ingrese primer numero");
        n1 = entrada.nextInt();

        System.out.println("Ingrese segundo numero");
        n2 = entrada.nextInt();

        System.out.println("Ingrese tercer numero");
        n3 = entrada.nextInt(); 
        */

        /*
        do {
            
            System.out.println("Ingrese primer numero");
            while (!entrada.hasNextInt()) {
                System.out.println("No es un numero!");
                System.out.println("Ingrese primer numero");
                entrada.next(); // this is important!
            }
            n1 = entrada.nextInt();
            if (n1 <= 0) {
                System.out.println("Por favor ingrese numeros mayores a cero");
            }
        } while (n1 <= 0);

        do {
            System.out.println("Ingrese segundo numero");
            while (!entrada.hasNextInt()) {
                System.out.println("No es un numero!");
                System.out.println("Ingrese segundo numero");
                entrada.next(); // this is important!
            }
            n2 = entrada.nextInt();
            if (n2 < 0) {
                System.out.println("Por favor ingrese numeros mayores a cero");
            }
        } while (n2 <= 0);

        do {
            System.out.println("Ingrese tercer numero");
            while (!entrada.hasNextInt()) {
                System.out.println("No es un numero!");
                System.out.println("Ingrese tercer numero");
                entrada.next(); // this is important!
            }
            n3 = entrada.nextInt();
            if (n3 < 0) {
                System.out.println("Por favor ingrese numeros mayores a cero");
            }
        } while (n3 <= 0);

        if((n1 >= n2)&&(n2 >= n3)){
            System.out.println(String.format("El orden descente es %d %d %d", n1, n2, n3));
        }
        else if((n1 >= n3)&&(n3 >= n2)){
            System.out.println(String.format("El orden descente es %d %d %d", n1, n3, n2));       
        }
        else if((n2 >= n1)&&(n1 >= n3)){
            System.out.println(String.format("El orden descente es %d %d %d", n2, n1, n3));
        }
        else if((n2 >= n3)&&(n3 >= n1)){
            System.out.println(String.format("El orden descente es %d %d %d", n2, n3, n1));
        }
        else if((n3 >= n2)&&(n2 >= n1)){
            System.out.println(String.format("El orden descente es %d %d %d", n3, n2, n1)); 
        }
        else{
            System.out.println(String.format("El orden descente es %d %d %d", n3, n1, n2));
        }

        if((n1 <= n2)&&(n2 <= n3)){
            System.out.println(String.format("El orden descente es %s %s %s", n1, n2, n3));
             }
            else if((n1 <= n3)&&(n3 <= n2)){
             System.out.println(String.format("El orden descente es %s %s %s", n1, n3, n2));       
             }
            else if((n2 <= n1)&&(n1 <= n3)){
            System.out.println(String.format("El orden descente es %s %s %s", n2, n1, n3));
            }
            else if((n2 <= n3)&&(n3 <= n1)){
            System.out.println(String.format("El orden descente es %s %s %s", n2, n3, n1));
            }
            else if((n3 <= n2)&&(n2 <= n1)){
            System.out.println(String.format("El orden descente es %s %s %s", n3, n2, n1)); 
            }
        else{
        System.out.println(String.format("El orden descente es %s %s %s", n3, n1, n2));
        }
        */
    }
}
