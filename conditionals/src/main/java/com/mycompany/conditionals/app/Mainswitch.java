
package com.mycompany.conditionals.app;

import java.util.Scanner;

public class Mainswitch {
    public static void main(String[] args) {
        String pais, nombre;
        int edad;
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese pais");
        pais = entrada.next();

        System.out.println("Ingrese nombre");
        nombre = entrada.next();

        System.out.println("Ingrese edad");
        edad = entrada.nextInt();
        
        System.out.println(String.format("Pais = %s Nombre = %s Edad = %s", pais, nombre, edad));
        System.out.println(nombre.length());
        
        
        switch (pais.toLowerCase()) {
            case  "colombia" -> {
                if(edad > 18) {
                    System.out.println(String.format("%s Colombiano mayor de edad", nombre));
                } else {
                    System.out.println(String.format("%s Colombiano menor de edad", nombre));
                }
            }
            case "austria" -> {
                if(edad > 18) {
                    System.out.println(String.format("%s Austriaco mayor de edad", nombre));
                } else {
                    System.out.println(String.format("%s Austriaco menor de edad", nombre));
                }
            }
            case "indonesia" -> {
                if(edad > 18) {
                    System.out.println(String.format("%s Indonisio mayor de edad", nombre));
                } else {
                    System.out.println(String.format("%s Indonisio menor de edad", nombre));
                }
            }
            default -> {
                if(edad > 18) {
                    System.out.println(String.format("%s Persona mayor de edad", nombre));
                } else {
                    System.out.println(String.format("%s Persona menor de edad", nombre));
                }
            }
        }
    }
}
