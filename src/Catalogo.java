/**
 * La clase Catálogo representa un juego en el catálogo.
 */
public class Catalogo {

    private String nombreJuego;
    private float precioActual;
    private int stock;

    /**
     * Crea una nueva instancia de la clase Catalogo.
     *
     * @param nombreJuego El nombre del juego.
     * @param precioActual El precio actual del juego.
     * @param stock La cantidad de stock disponible del juego.
     */
    public Catalogo(String nombreJuego, float precioActual, int stock) {
        this.nombreJuego = nombreJuego;
        this.precioActual = precioActual;
        this.stock = stock;
    }

    /**
     * Filtra la búsqueda en el catálogo de juegos.
     */
    public void filtrarBusqueda(){}

}
