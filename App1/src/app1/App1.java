/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app1;

import java.util.*;

/**
 *
 * @author josetorres
 */
public class App1 {

    /**
     * @param args the command line arguments
     */
    /*Pedir los coeficientes de una ecuacion de 2do graod, y muestre sus 
    soluciones reales. Sino existen, debe indicarlos*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c;
        double x1, x2, d;

        System.out.println("Intoduce primer numero");
        a = teclado.nextDouble();
        System.out.println("Introduce segundo numero");
        b = teclado.nextDouble();
        System.out.println("Introduce tercer numero");
        c = teclado.nextDouble();

        //Calculamos el determinante
        d = ((b * b) - 4 * a * c);
        if (d < 0) {
            System.out.println("No exiten soluciones reales");
        } else {
            //Queda confiurmar que sea distinto de 0
            //Si a=0 no encontramos una division por cero

            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Solucion de x1: " + x1);
            System.out.println("Solucion de x2: " + x2);
        }
        System.out.println("asdasdasd");

    }
}
