/**
 * La clase Persona representa a una persona con su información básica.
 */
public class Persona {

    private String nombreCompleto;
    private String correo;
    private int telefono;
    private String direccion;

    /**
     * Crea una nueva instancia de la clase Persona.
     *
     * @param nombreCompleto El nombre completo de la persona.
     * @param correo El correo electrónico de la persona.
     * @param telefono El número de teléfono de la persona.
     * @param direccion La dirección de la persona.
     */
    public Persona(String nombreCompleto, String correo, int telefono, String direccion) {
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

}
