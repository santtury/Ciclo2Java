import java.util.Scanner;

public class Sesion1A5 {
    public static void main(String[] args) {
        // Ejercicio 1
        // Scanner sc = new Scanner(System.in);
        // int cantidadMinima = 0, cantidadActual = 0;

        // System.out.print("Ingrese la cantidad mínima en la bodega: ");
        // cantidadMinima = sc.nextInt();

        // System.out.print("Ingrese la cantidad actual en la bodega: ");
        // cantidadActual = sc.nextInt();

        // if (cantidadActual < cantidadMinima) {
        // System.out.println("Es necesario realizar el pedido al proveedor");
        // }

        // if (cantidadActual >= cantidadMinima) {
        // System.out.println("No es necesario realizar el pedido al proveedor");
        // }

        // sc.close();

        // Ejercicio 2
        // Scanner sc = new Scanner(System.in);
        // int cantidadMinima = 0, cantidadActual = 0;

        // System.out.print("Ingrese la cantidad mínima en la bodega: ");
        // cantidadMinima = sc.nextInt();

        // System.out.print("Ingrese la cantidad actual en la bodega: ");
        // cantidadActual = sc.nextInt();

        // if (cantidadActual < cantidadMinima) {
        // System.out.println("Es necesario realizar el pedido al proveedor");
        // } else {
        // System.out.println("No es necesario realizar el pedido al proveedor");
        // }

        // sc.close();

        // Ejercicio 3
        Scanner sc = new Scanner(System.in);
        int cantidadMinima = 0, cantidadActual = 0;

        System.out.print("Ingrese la cantidad mínima en la bodega: ");
        cantidadMinima = sc.nextInt();

        System.out.print("Ingrese la cantidad actual en la bodega: ");
        cantidadActual = sc.nextInt();

        if (cantidadActual < cantidadMinima) {
            System.out.println("Es necesario realizar el pedido al proveedor");
        } else if (cantidadActual - cantidadMinima <= 10) {
            System.out.println("No es necesario realizar el pedido al proveedor");
            System.out.printf("Unidades que hacen falta vender: %d %n", cantidadActual - cantidadMinima);
            System.out.println("ALERTA! generada");
        } else {
            System.out.println("No es necesario realizar el pedido al proveedor");
            System.out.printf("Unidades que hacen falta vender: %d %n", cantidadActual - cantidadMinima);
        }

        sc.close();
    }
}
