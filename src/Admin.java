/**
 * La clase Admin representa a un administrador del sistema.
 * Hereda los campos y métodos de la clase Persona.
 */
public class Admin extends Persona {

    private String DNI;

    /**
     * Crea una nueva instancia de la clase Admin.
     *
     * @param nombreCompleto El nombre completo del administrador.
     * @param correo El correo electrónico del administrador.
     * @param telefono El número de teléfono del administrador.
     * @param direccion La dirección del administrador.
     * @param DNI El número de identificación del administrador.
     */
    public Admin(String nombreCompleto, String correo, int telefono, String direccion, String DNI) {
        super(nombreCompleto, correo, telefono, direccion);
        this.DNI = DNI;
    }

    /**
     * Actualiza las ofertas disponibles en el sistema.
     */
    public void actualizarOfertas(){}

}