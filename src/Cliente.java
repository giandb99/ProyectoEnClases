import java.util.Date;

/**
 * La clase Usuario representa a un usuario del sistema.
 * Hereda los campos y métodos de la clase Persona.
 */
public class Cliente extends Usuario{

    private final Date fechaNacimiento;

    /**
     * Crea una nueva instancia de la clase Usuario.
     *
     * @param nombreCompleto El nombre completo del usuario.
     * @param correo El correo electrónico del usuario.
     * @param telefono El número de teléfono del usuario.
     * @param direccion La dirección del usuario.
     * @param fechaNacimiento La fecha de nacimiento del usuario.
     */

    public Cliente(String nombreCompleto, String correo, int telefono, String direccion, Date fechaNacimiento ) {
        super(nombreCompleto, correo, telefono, direccion);
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Registra al usuario en el sistema.
     */
    public void registrarse(){}

    /**
     * Inicia sesión en el sistema.
     */
    public void iniciarSesion(){}

    /**
     * Modifica la información del usuario.
     */
    public void modificarInformacion(){}

    /**
     * Elimina la cuenta del usuario.
     */
    public void eliminarCuenta(){}

    /**
     * Visualiza el contenido disponible.
     */
    public void visualizarContenido(){}

    /**
     * Visualiza el carrito de compras.
     */
    public void visualizarCarrito(){}

    /**
     * Visualiza la lista de deseos del usuario.
     */
    public void visualizarListaDeseo(){}

}
