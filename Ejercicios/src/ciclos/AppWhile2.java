package ciclos;

import java.util.Scanner;
// import javax.swing.JOptionPane;

// Imprime el promedio de la suma de los números ingresados, -1 para salir
public class AppWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0, valor = 0;
        int contador = 0;

        System.out.println("Ingrese un número: ");
        valor = sc.nextDouble();
        // valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un
        // número:"));

        while (valor != -1) {
            suma += valor;
            contador++;
            System.out.println("Ingrese un número: ");
            valor = sc.nextDouble();
        }
        System.out.printf("El promedio es: %.2f", suma / contador);
        // JOptionPane.showMessageDialog(null, "El promedio es: " + suma / contador);
        sc.close();
    }
}
