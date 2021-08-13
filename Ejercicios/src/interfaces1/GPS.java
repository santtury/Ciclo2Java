package interfaces1;

// En una interface los atributos y métodos son públicos
public interface GPS {

    // En una interface los atributos son automáticamente 'static final', no es
    // necesario colocarlo. Además el nombre de las variables deben ser en MAYÚSCULA
    public static final double VELOCIDADLUZ = 299792458;

    // En una interface los métodos son automáticamente 'abstract', no es cecesario
    // colocarlo
    public abstract void obtenerCoordenadas();

    public abstract void buscarDireccion();

}
