/**
 * La clase Deseado representa una lista de juegos deseados por un usuario.
 *
 * @author Gianfranco Lombardo Lopez, Fabio Gonzalez Trujillo
 * @version 0.1
 * @since 12/06/2023
 */
public class Deseado {

    private String nombreJuego[];
    private int precios[];
    private float precioTotal;

    /**
     * Crea una nueva instancia de la clase Deseado.
     *
     * @param nombreJuegos Un array con los nombres de los juegos deseados.
     * @param precios Un array con los precios de los juegos deseados.
     * @param precioTotal El precio total de todos los juegos deseados.
     */
    public Deseado(String[] nombreJuegos, int[] precios, float precioTotal) {
        nombreJuegos = nombreJuegos;
        this.precios = precios;
        this.precioTotal = precioTotal;
    }

    /**
     * Agrega un producto a la lista de juegos deseados.
     */
    public void agregarProducto(){}

    /**
     * Elimina un producto de la lista de juegos deseados.
     */
    public void eliminarProducto(){}

    /**
     * Añade los juegos deseados al carrito de compras.
     */
    public void añadirCarrito(){}

}
