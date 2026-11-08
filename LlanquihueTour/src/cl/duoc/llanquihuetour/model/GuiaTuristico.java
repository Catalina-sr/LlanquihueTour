package cl.duoc.llanquihuetour.model;

public class GuiaTuristico extends Persona {
    private int id;
    private String idiomas;
    private String especialidad;

    public GuiaTuristico(String nombre, int edad, String unidadEdad, String rut, Direccion direccion, int id, String idiomas, String especialidad) {
        super(nombre, edad, unidadEdad, rut, direccion);

        this.id = id;
        this.idiomas = idiomas;
        this.especialidad = especialidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        // Se utiliza super.toString() para incorporar los datos heredados de Persona.
        return super.toString() +
                "\n\nID Guía: " + id +
                "\nIdiomas: " + idiomas +
                "\nEspecialidad: " + especialidad;
    }
}
