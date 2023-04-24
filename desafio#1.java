/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

/**
 *
 * @author Tano
 */
import java.util.Scanner;
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    

        Scanner sc = new Scanner(System.in);
        int num1, num2, resultado;

        System.out.println("Ingrese el primer número:");
        num1 = sc.nextInt();

        System.out.println("Ingrese el segundo número:");
        num2 = sc.nextInt();

        resultado = num1 + num2;

        System.out.println("La suma de los dos números es: " + resultado);
    }
}
	