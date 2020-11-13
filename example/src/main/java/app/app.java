package app;
import java.util.Scanner;

public class app {
    public static void main(String[] args) throws Exception {
        
        int n1 = 0, n2 = 0, n3 = 0;
       
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese un numero: ");
            n1=entrada.nextInt();
            
            System.out.print("Ingrese un numero: ");
            n2=entrada.nextInt();
            
            System.out.print("Ingrese un numero: ");
            n3=entrada.nextInt();
        } catch(Exception e) {
            System.out.println(String.format("Hubo un error %s", e));
        }
        
        if((n1 >= n2)&&(n2 >= n3)){
            System.out.println(String.format("El orden descente es %s %s %s", n1, n2, n3));
             }
            else if((n1 >= n3)&&(n3 >= n2)){
             System.out.println(String.format("El orden descente es %s %s %s", n1, n3, n2));       
             }
            else if((n2 >= n1)&&(n1 >= n3)){
            System.out.println(String.format("El orden descente es %s %s %s", n2, n1, n3));
            }
            else if((n2 >= n3)&&(n3 >= n1)){
            System.out.println(String.format("El orden descente es %s %s %s", n2, n3, n1));
            }
            else if((n3 >= n2)&&(n2 >= n1)){
            System.out.println(String.format("El orden descente es %s %s %s", n3, n2, n1)); 
            }
        else{
        System.out.println(String.format("El orden descente es %s %s %s", n3, n1, n2));
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
    }
}
