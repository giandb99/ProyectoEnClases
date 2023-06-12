/**
 * La clase Proveedor representa a un proveedor de videojuegos.
 * Hereda los campos y métodos de la clase Persona.
 */
public class Proveedor extends Persona {

    private int CIF;

    /**
     * Crea una nueva instancia de la clase Proveedor.
     *
     * @param nombreCompleto El nombre completo del proveedor.
     * @param correo El correo electrónico del proveedor.
     * @param telefono El número de teléfono del proveedor.
     * @param direccion La dirección del proveedor.
     * @param CIF El número de identificación fiscal del proveedor.
     */
    public Proveedor(String nombreCompleto, String correo, int telefono, String direccion, int CIF) {
        super(nombreCompleto, correo, telefono, direccion);
        this.CIF = CIF;
    }

    /**
     * Provee videojuegos al sistema.
     */
    public void proveerVideojuegos(){}

}
