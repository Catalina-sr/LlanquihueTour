package cl.duoc.llanquihuetour.model;

public class Persona {
    private String nombre;
    private int edad;
    private String unidadEdad;
    private String rut;
    private Direccion direccion;

    public Persona(String nombre, int edad, String unidadEdad, String rut, Direccion direccion) {
        this.nombre = nombre;
        setEdad(edad);
        setUnidadEdad(unidadEdad);
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
       // Se valida que la edad ingresada sea mayor que cero para evitar valores inválidos.
        if (edad <= 0) {
            throw new IllegalArgumentException("Edad inválida");
        }

        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getUnidadEdad() {
        return unidadEdad;
    }

    public void setUnidadEdad(String unidadEdad) {

        // Se valida que la unidad de edad ingresada sea "años".
        if (!"años".equalsIgnoreCase(unidadEdad)){
            throw new IllegalArgumentException(("Unidad de edad inválida"));
        }

        this.unidadEdad = "años";
    }

    @Override
    public String toString() {
        return
                "\nNombre: " + nombre +
                "\nEdad: " + edad + " " + unidadEdad +
                "\nRUT: " + rut +
                "\n\nDireccion " + direccion;
    }
}
