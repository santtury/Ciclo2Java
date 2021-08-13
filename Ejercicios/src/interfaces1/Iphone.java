package interfaces1;

public class Iphone extends Telefono implements GPS, Camara {

    public Iphone(String marca, String modelo, String serial, String numTelefonico) {
        super(marca, modelo, serial, numTelefonico);
    }

    @Override
    public void prenderFlash() {
        System.out.println("Implemetación del método prenderFlash() dentro de la clase Iphone");
    }

    @Override
    public void apagarFlash() {
        System.out.println("Implemetación del método apagarFlash() dentro de la clase Iphone");
    }

    @Override
    public void seleccionarvista() {
        System.out.println("Implemetación del método seleccionarvista() dentro de la clase Iphone");
    }

    @Override
    public void obtenerCoordenadas() {
        System.out.println("Implemetación del método obtenerCoordenadas() dentro de la clase Iphone");
    }

    @Override
    public void buscarDireccion() {
        System.out.println("Implemetación del método buscarDireccion() dentro de la clase Iphone");
    }

    public void imprimirVelLuz() {
        System.out.println("Velocidad luz: " + VELOCIDADLUZ);
    }

}
