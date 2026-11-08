package cl.duoc.llanquihuetour.model;

public class Operador extends Persona {
    private int id;
    private String empresa;
    private String servicioOfrecido;

    public Operador(String nombre, int edad, String unidadEdad, String rut, Direccion direccion, int id, String empresa, String servicioOfrecido) {
        super(nombre, edad, unidadEdad, rut, direccion);

        this.id = id;
        this.empresa = empresa;
        this.servicioOfrecido = servicioOfrecido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getServicioOfrecido() {
        return servicioOfrecido;
    }

    public void setServicioOfrecido(String servicioOfrecido) {
        this.servicioOfrecido = servicioOfrecido;
    }

    @Override
    public String toString() {
        // Se utiliza super.toString() para incorporar los datos heredados de Persona.
        return super.toString() +
                "\n\nID Operador: "+ id +
                "\nEmpresa: " + empresa +
                "\nServicio Ofrecido: " + servicioOfrecido;
    }
}
