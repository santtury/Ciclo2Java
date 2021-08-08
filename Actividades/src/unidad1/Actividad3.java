package unidad1;

import java.util.Scanner;

/**
 * 1. Practica y familiarízate con la sintaxis de Java realizando un proyecto de
 * una calculadora básica con las siguientes características:
 * 
 * Realiza un menú donde el usuario pueda seleccionar entre 5 opciones así: 1.
 * suma, 2. resta, 3. multiplicación, 4. división, 5. residuo y 6. salir.
 * Recuerda realizar validación de los datos de entrada del usuario y que
 * siempre las operaciones sean correctas.
 * 
 * Al programa de calculadora básica realizado en la Actividad 3, editalo y
 * realiza las operaciones de la cálculadora, implementando una función para
 * cada operación, agregue además, las funciones que permitan cálcular la
 * fórmula del estudiante y los números primos
 */
public class Actividad3 {
    // Atributos
    public int valor1;
    public int valor2;
    public int resultado;
    public static Scanner input = new Scanner(System.in);

    // Main
    public static void main(String[] args) {
        imprimirMenu();
    }

    // Métodos
    public static int imprimirMenu() {
        System.out.println("1. suma \n2. resta \n3. multiplicación \n4. división \n5. residuo \n6. salir");
        System.out.print("Escoge una opción: ");
        int opcion = Integer.parseInt(input.nextLine());

        if (opcion < 1 || opcion > 6) {
            System.out.println("Ingresaste una opción fuera del rango");
        }

        return opcion;
    }

    public int sumar(int valor1, int valor2) {
        resultado = valor1 + valor2;
        return resultado;
    }

    public int restar(int valor1, int valor2) {
        resultado = valor1 - valor2;
        return resultado;
    }

    public int multiplicar(int valor1, int valor2) {
        resultado = valor1 * valor2;
        return resultado;
    }

    public double dividir(int valor1, int valor2) {
        resultado = valor1 / valor2;
        return resultado;
    }

    public int residuo(int valor1, int valor2) {
        resultado = valor1 % valor2;
        return resultado;
    }

}
