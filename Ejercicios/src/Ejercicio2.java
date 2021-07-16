import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu apellido: ");
        String apellido = scanner.nextLine();

        System.out.printf("Hola %s cuántos años tienes?: ", nombre);
        int edad = scanner.nextInt();

        System.out.println(String.format("%s %s tiene %d años", nombre, apellido, edad));

        System.out.printf(" %.2f %n", 12.3256);

        scanner.close();
    }
}
