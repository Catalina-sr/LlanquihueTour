package cl.duoc.llanquihuetour.model;

public class Cliente extends Persona {
        private String telefono;
        private String correo;
        private String nacionalidad;
        private String contactoEmergencia;
        private String relacionContacto;

        public Cliente(String nombre, int edad, String unidadEdad, String rut, Direccion direccion, String telefono, String correo, String nacionalidad, String contactoEmergencia, String relacionContacto) {

        super(nombre, edad, unidadEdad, rut, direccion);

            this.telefono = telefono;
            this.correo = correo;
            this.nacionalidad = nacionalidad;
            this.contactoEmergencia = contactoEmergencia;
            this.relacionContacto = relacionContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getContactoEmergencia() {
        return contactoEmergencia;
    }

    public void setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }

    public String getRelacionContacto() {
        return relacionContacto;
    }

    public void setRelacionContacto(String relacionContacto) {
        this.relacionContacto = relacionContacto;
    }

    @Override
    public String toString() {
        // Se utiliza super.toString() para incorporar los datos heredados de Persona.
            return super.toString() +
                "\n\nTeléfono: " + telefono +
                "\nCorreo: " + correo +
                "\nNacionalidad: " + nacionalidad +
                "\nContacto de emergencia: " + contactoEmergencia +
                "\nTipo de Relación: " + relacionContacto;

    }
}
