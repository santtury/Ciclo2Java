import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre1 = "", nombre2 = "";

        System.out.print("Por favor ingrese el primer nombre: ");
        nombre1 = scanner.nextLine();

        System.out.print("Por favor ingrese el segundo nombre: ");
        nombre2 = scanner.nextLine();

        if (nombre1.equalsIgnoreCase(nombre2)) {
            System.out.print("Los nombres son iguales");
        } else {
            System.out.print("Los nombres son diferentes");
        }
        scanner.close();
    }
}
