package constructores;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, int sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    // Esto es sobreescritura
    @Override
    public String detalles() {
        return super.detalles() + ", Departamento: " + this.departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
