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

        // Producto3
        System.out.println("Número de productos a manejar");
        int tamano = Integer.parseInt(sc.nextLine());
        Producto3 productos[] = new Producto3[tamano];

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Digite el código del preoducto: ");
            int codigo = Integer.parseInt(sc.nextLine());
            System.out.println("Digite el código del preoducto: ");
            int precio = Integer.parseInt(sc.nextLine());
            System.out.println("Digite el código del preoducto: ");
            int bodega = Integer.parseInt(sc.nextLine());
            System.out.println("Digite el código del preoducto: ");
            int minima = Integer.parseInt(sc.nextLine());
            productos[i] = new Producto3(codigo, precio, bodega, minima);
        }

        int menor = 1000000;
        Producto3 codigoMenor = productos[0];
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].solicitar()) {
                System.out.println("Alerta generada para el código" + productos[i].getCodigo());
            } else {
                System.out.println("No tenemos que solicitar nada al proveedor" + productos[i].getCodigo());
            }

            if (productos[i].getCantidadBodega() < menor) {
                menor = productos[i].getCantidadBodega();
                codigoMenor = productos[i];
            }
        }
        System.out.println(
                "El código del producto con el menor número de unidades en bodega es: " + codigoMenor.getCodigo());

        sc.close();
    }
}
