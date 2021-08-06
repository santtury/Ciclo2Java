package constructores2;

/* SubClase Camioneta - Uso de super y sobre-escritura de métodos
Se define la SubClase Camioneta con los atributos
int sillasAdicionales; Nuevo atributos 
boolean: AA
y los parámetros de la SuperClase que son heredados
String: matricula
int: numSillas
Se definen un constructor:
Camioneta (String matricula, boolean AA) se usa super con paso de parámetro                  matrícula para llamar al constructor de la SuperClase que utiliza este parámetro. 
El númerode sillas por defecto es 3. 
El parámetro AA se inicia en el constructor Camioneta.
Se definen los métodos set y get para la variable de instancia AA de Camioneta
Se definen los métodos set y get para la variable de instancia sillasAdicionales
y con el método get se sobre-escribe el método getnumSillas de la SuperClase Vehiculo.
*/
public class Camioneta extends Vehiculo {
    private int sillasAdicionales; // Atributo que no se utiliza en el constructor
    private boolean AA;

    public Camioneta(String matricula, boolean AA) {
        super(matricula);
        this.AA = AA;
    }

    public int getSillasAdicionales() {
        return sillasAdicionales;
    }

    public void setSillasAdicionales(int sillasAdicionales) {
        this.sillasAdicionales = sillasAdicionales;
    }

    public boolean isAA() {
        return AA;
    }

    public void setAA(boolean AA) {
        this.AA = AA;
    }

    // Se sobreescribe el método getNumSillas de la Super Clase Vehículo
    @Override
    public int getNumSillas() {
        // TODO Auto-generated method stub
        return super.getNumSillas() + sillasAdicionales;
    }
}
