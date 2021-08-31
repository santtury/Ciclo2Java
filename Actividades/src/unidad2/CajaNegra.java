package unidad2;

import java.util.Arrays;

public class CajaNegra {
    public static void main(String[] args) {
        System.out.println(Math.pow(2, 5));

        int[] datos = { 3, 2, 1, -55, 77, 6, 23, 11, 1, 4, 0, -2 };
        System.out.println(Arrays.toString(datos));
        Arrays.sort(datos);
        System.out.println(Arrays.toString(datos));
        System.out.println(Arrays.binarySearch(datos, 77)); // Para que este metodo funcione el arreglo debe de estar
                                                            // ordenado

    }
}
