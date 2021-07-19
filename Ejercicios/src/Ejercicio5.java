import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un valor: ");
        int x = scanner.nextInt();

        if (x < 0) {
            System.out.printf("%d es negativo %n", x);
        } else if (x == 0) {
            System.out.printf("%d es cero %n", x);
        } else {
            System.out.printf("%d es positivo %n", x);
        }
        System.out.print("Esto ya esta fuera del condicional");
        scanner.close();
    }
}
