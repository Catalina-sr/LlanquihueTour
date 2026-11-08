package cl.duoc.llanquihuetour.model;

public class Empleado extends Persona {
    private int id;
    private String cargo;

    public Empleado(String nombre, int edad, String unidadEdad, String rut, Direccion direccion, int id, String cargo) {

        super(nombre, edad, unidadEdad, rut, direccion);

        this.id = id;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        // Se utiliza super.toString() para incorporar los datos heredados de Persona.
        return super.toString() +
                "\n\nID empleado: " + id +
                "\nCargo: " + cargo;

    }
}





