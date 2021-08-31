package unidad2;

public class Ternario {
    public static void main(String[] args) {
        int x;
        x = (5 > 3) ? 2 : 1;
        System.out.println(x);
        // -----
        int y = 3;
        if (y == 2) {

        } else if (y == 3) {
            y = 2;
            System.out.println("y es 3");
        } else if (y == 2) {
            System.out.println("Se cambia x");
        } else {
            System.out.println("Ultimo else");
        }
        // -----
        // if (1 == true) {
        // System.out.println("Son iguales");
        // } else if (0 == false) {
        // System.out.println("También son iguales");
        // }
        // -----
        int opc = 5;
        switch (opc) {
            case 1:
                System.out.println("Hola");
                break;
            case 2:
                System.out.println("Hola");
                break;
            case 3:
                System.out.println("Hola");
                break;
            case 4:
                System.out.println("Hola");
                break;
            default:
                System.out.println("Prueba");
                break;
        }
    }
}
