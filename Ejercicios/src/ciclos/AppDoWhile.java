package ciclos;

import java.util.Scanner;

public class AppDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0, promedio = 0, valor = 0;
        int contador = 0;

        System.out.println("Ingrese un número: ");
        valor = sc.nextDouble();

        do {
            suma += valor;
            contador++;
            System.out.println("Ingrese un número: ");
            valor = sc.nextDouble();
        } while (valor != -1);

        promedio = suma / contador;
        System.out.printf("El promedio es: %.2f", promedio);
        sc.close();
    }
}
