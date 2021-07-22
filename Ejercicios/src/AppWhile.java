import java.util.Scanner;

// Imprime los números pares sin contar el cero desde 2
public class AppWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, contador = 1;

        System.out.println("Ingresa un número");
        numero = sc.nextInt();

        while (contador <= numero) {
            if (contador % 2 == 0) {
                System.out.println("Este número es par" + contador);
            }
            contador++;
        }
        sc.close();
    }
}
