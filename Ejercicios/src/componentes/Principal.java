package componentes;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto p1 = new Producto(123, 1000, 10, 5);

        System.out.println("Cuál es el código del producto: " + p1.getCodigo());
        System.out.println("Precio de compra: " + p1.getPrecioCompra());
        System.out.println("Cantidad en bodega: " + p1.getCantidadBodega());
        System.out.println("Cantidad mínima requerida: " + p1.getCantidadMinimaRequerida());
    }
}
