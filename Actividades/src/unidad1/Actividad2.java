package unidad1;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 2. Práctica las diferentes formas de pedir datos al usuario en la consola
 * realizando un programa que lea un número entero e imprima:
 * 
 * "Feliz día", si el número es mayor a cero. "Vamos muy bien" si es igual a
 * cero. "Para atrás ni para coger impulso", si el número es menor a cero.
 * 
 * @author Santtury
 */
public class Actividad2 {
    public static void main(String[] args) {
        /*
         * En este ejercicio se utiliza scanner para leer los datos por consola
         */
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un número entero: ");
        numero = Integer.parseInt(input.nextLine());

        if (numero > 0) {
            System.out.println("Feliz día");
        } else if (numero < 0) {
            System.out.println("Para atrás ni para coger impulso");
        } else {
            // Si el número es igual a cero
            System.out.println("Vamos muy bien");
        }

        input.close();

        /*
         * En este ejercicio se utiliza joption para leer los datos por gui
         */
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero:"));

        if (numero1 > 0) {
            JOptionPane.showMessageDialog(null, "Feliz día");
        } else if (numero1 < 0) {
            JOptionPane.showMessageDialog(null, "Para atrás ni para coger impulso");
        } else {
            // Si el número es igual a cero
            JOptionPane.showMessageDialog(null, "Vamos muy bien");
        }
    }
}
