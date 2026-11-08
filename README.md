# Llanquihue Tour

## Autor del proyecto

- **Nombre:** Catalina Soto Repol
- **Asignatura:** Desarrollo Orientado a Objetos I
- **Institución:** Duoc UC

## Descripción general

Llanquihue Tour es un prototipo de sistema desarrollado en Java para representar a las personas relacionadas con una agencia de turismo ubicada en la comuna de Llanquihue, Región de Los Lagos.

El objetivo del proyecto es organizar y estructurar la información de las personas vinculadas a la agencia, diferenciando sus respectivos roles mediante un modelo orientado a objetos.

Para su implementación se utilizan conceptos de programación orientada a objetos, tales como encapsulamiento, herencia, composición y reutilización de clases.

## Estructura general del proyecto

El proyecto se encuentra organizado en los siguientes paquetes:

### Paquete app

- **Main.java:** contiene el método principal del programa. Permite crear instancias de las distintas clases y comprobar su funcionamiento mediante la consola.

### Paquete model

- **Persona.java:** clase base que contiene los datos personales comunes de las personas.
- **Direccion.java:** representa la dirección asociada a cada persona.
- **Empleado.java:** representa a un empleado de la agencia y hereda los atributos de Persona.
- **Cliente.java:** representa a un cliente y agrega información de contacto y emergencia.
- **GuiaTuristico.java:** representa a un guía turístico y contiene información sobre idiomas y especialidad.
- **Operador.java:** representa a un operador y contiene información sobre su empresa y los servicios ofrecidos.

## Conceptos de programación orientada a objetos aplicados

- **Encapsulamiento:** los atributos de las clases se declaran privados y se utilizan métodos getters y setters para acceder y modificar sus valores.
- **Herencia:** las clases Empleado, Cliente, GuiaTuristico y Operador heredan de la clase Persona.
- **Composición:** la clase Persona contiene un objeto de tipo Direccion como atributo.
- **Reutilización:** se utiliza `super()` para reutilizar el constructor de Persona y `super.toString()` para incorporar los datos heredados en las clases derivadas.

## Instrucciones para clonar y ejecutar

1. Clonar el repositorio desde GitHub.
2. Abrir el proyecto en IntelliJ IDEA.
3. Verificar que la estructura de paquetes se encuentre correctamente organizada.
4. Compilar el proyecto desde IntelliJ IDEA mediante la opción **Build > Build Project**.
5. Abrir la clase `Main.java`, ubicada en el paquete `app`.
6. Ejecutar el método `main()` para visualizar los resultados en la consola.

## Repositorio

https://github.com/Catalina-sr/LlanquihueTour

---

**Duoc UC – Desarrollo Orientado a Objetos I**
