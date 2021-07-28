package componentes;

import java.util.Scanner;

public class Productos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayor = -1, codigoMayor = 0, menor = 1000000, codigoMenor = 0;

        System.out.println("Digite el número de productos: ");
        int productos = Integer.parseInt(sc.nextLine());

        int listaCodigo[] = new int[productos];
        int listaCantidadBodega[] = new int[productos];
        int listaCantidadMinima[] = new int[productos];

        for (int i = 0; i < productos; i++) {
            System.out.println("Digite el códigoo del producto: " + (i + 1));
            listaCodigo[i] = sc.nextInt();
            System.out.println("Digitela cantidad de bodega: " + (i + 1));
            listaCantidadBodega[i] = sc.nextInt();
            System.out.println("Digite la cantidad miníma requerida: " + (i + 1));
            listaCantidadMinima[i] = sc.nextInt();
        }

        System.out.println("Códigos de productos que son necesarios solicitar: ");

        for (int i = 0; i < productos; i++) {
            if (listaCantidadBodega[i] < listaCantidadMinima[i]) {
                System.out.println(listaCodigo[i]);
            }
            if (listaCantidadBodega[i] < menor) {
                menor = listaCantidadBodega[i];
                codigoMenor = listaCodigo[i];
            }
            if (listaCantidadBodega[i] > mayor) {
                mayor = listaCantidadBodega[i];
                codigoMayor = listaCodigo[i];
            }
        }
        System.out.println("Código con mayor número de unidades en bodega: " + codigoMayor);
        System.out.println("Código con menor número de unidades en bodega: " + codigoMenor);
        sc.close();
    }
}
