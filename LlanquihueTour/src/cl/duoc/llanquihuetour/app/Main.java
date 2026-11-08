package cl.duoc.llanquihuetour.app;

import cl.duoc.llanquihuetour.model.*;

/** Se crean los objetos de las clases Empleado, Cliente, GuiaTuristico y Operador.
 * Estas clases heredan de Persona, por lo que comparten sus datos personales y agregan sus propios atributos.
 * Para ello, los datos se envían directamente a sus constructores mediante super(). Además, se utiliza una relación de composición entre Persona y Direccion,
   donde cada persona tiene asociada una dirección.*/

public class Main {
    public static void main(String[] args) {


        try {

            //EMPLEADO
            Direccion direccion = new Direccion("Los Alerces", 150, "Puerto Varas", "Región de Los Lagos");
            Empleado empleado = new Empleado("Catalina Soto Repol", 27,"años","20.164.137-3", direccion, 6, "Programadora");

            System.out.println("\n✦════════ EMPLEADO ════════✦");
            System.out.println(empleado);


            //CLIENTE
            Direccion direccion2 = new Direccion("Avenida Grecia", 8215, "Peñalolén", "Región Metropolitana");
            Cliente cliente = new Cliente("Cristian Soto Repol", 35, "años", "17.458.789-3", direccion2,"+569 54789547", "cristian.sr@gmail.com", "Chileno",
                    "+569 87456985", "Esposa");


            System.out.println("\n╔════════════════════╗");
            System.out.println("       CLIENTE");
            System.out.println("╚════════════════════╝");

            System.out.println(cliente);
            cliente.setTelefono("+569 517895557");
            System.out.println("\n----------TELÉFONO ACTUALIZADO ----------\n");
            System.out.println(cliente);


            //GUÍA TURISTICO
            Direccion direccion3 = new Direccion("San Francisco", 325, "Llanquihue", "Región de Los Lagos");
            GuiaTuristico guiaTuristico = new GuiaTuristico("Matías Ferreira Osorio", 36, "años", "17.456.876-6", direccion3, 48, "Español, Inglés y Francés",
                    "Turismo de naturaleza") ;


            System.out.println("\n════════ GUÍA TURÍSTICO ════════");
            System.out.println(guiaTuristico);

            //OPERADOR
            Direccion direccion4 = new Direccion("Colón", 450, "Llanquihue", "Región de Los Lagos");
            Operador operador = new Operador("Javiera Vega Peña", 27, "años", "20.145.789-8", direccion4, 96, "Transportes Lagos del Sur", "Traslado de turistas");


            System.out.println("\n━━━━━━━━ OPERADOR ━━━━━━━━");
            System.out.println(operador);

        } catch (IllegalArgumentException e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }
}