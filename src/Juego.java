import java.util.Date;

/**
 * La clase Juego representa un juego en el catálogo.
 */
public class Juego {

    private String descripcion;
    private Date fechaLanzamiento;
    Genero genero;
    private float precioBase;
    private float precioOferta;
    private int stock;

    /**
     * Crea una nueva instancia de la clase Juego.
     *
     * @param descripcion La descripción del juego.
     * @param fechaLanzamiento La fecha de lanzamiento del juego.
     * @param genero El género del juego.
     * @param precioBase El precio base del juego.
     * @param precioOferta El precio de oferta del juego.
     * @param stock La cantidad disponible en stock del juego.
     */
    public Juego(String descripcion, Date fechaLanzamiento, Genero genero,
                 float precioBase, float precioOferta, int stock) {
        this.descripcion = descripcion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.precioBase = precioBase;
        this.precioOferta = precioOferta;
        this.stock = stock;
    }

    /**
     * Añade el juego al carrito de compras.
     */
    public void añadirCarrito(){}

    /**
     * Añade el juego a la lista de deseos.
     */
    public void añadirListaDeseo(){}

    /**
     * Obtiene la cantidad disponible en stock del juego.
     */
    public void cantidadStock(){}

}