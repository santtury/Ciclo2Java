package interfaces1;

public class Samsung extends Telefono implements GPS, Camara {

    public Samsung(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void prenderFlash() {
        System.out.println("Implemetación del método prenderFlash() dentro de la clase Samsung");
    }

    @Override
    public void apagarFlash() {
        System.out.println("Implemetación del método apagarFlash() dentro de la clase Samsung");
    }

    @Override
    public void seleccionarvista() {
        System.out.println("Implemetación del método seleccionarvista() dentro de la clase Samsung");
    }

    @Override
    public void obtenerCoordenadas() {
        System.out.println("Implemetación del método obtenerCoordenadas() dentro de la clase Samsung");
    }

    @Override
    public void buscarDireccion() {
        System.out.println("Implemetación del método buscarDireccion() dentro de la clase Samsung");
    }

}
