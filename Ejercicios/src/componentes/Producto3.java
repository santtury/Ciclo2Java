package componentes;

public class Producto3 {
    // Atributos
    private int codigo;
    private int precioCompra;
    private int cantidadBodega;
    private int cantidadMinimaRequerida;

    // Constructor
    public Producto3(int codigo, int precioCompra, int cantidadBodega, int cantidadMinimaRequerida) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinimaRequerida = cantidadMinimaRequerida;
    }

    // Métodos
    public boolean solicitar() {
        if (cantidadBodega < cantidadMinimaRequerida) {
            return true;
        } else {
            return false;
        }
        // return cantidadBodega < cantidadMinimaRequerida;
    }

    // Gets y Sets
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public int getCantidadMinimaRequerida() {
        return cantidadMinimaRequerida;
    }

    public void setCantidadMinimaRequerida(int cantidadMinimaRequerida) {
        this.cantidadMinimaRequerida = cantidadMinimaRequerida;
    }

}
