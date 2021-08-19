package unidad2;

public class Programa {
    public static void main(String[] args) {
        Elefante e; // Declaración
        e = new Elefante(); // Inicialización
        e.setNombre("Dumbo"); // Asignación
        e.setEdad(20);
        e.alimentarse("manzana");
        System.out.println("El elefante se llama " + e.getNombre());
        System.out.println("El elefante tiene" + e.getEdad() + "años");
    }
}
