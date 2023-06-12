/**
 * La clase Carrito representa el carrito de compras de un usuario.
 */
public class Carrito {

    private String NombreJuegos[];
    private int precios[];
    private float precioTotal;
    private int cantidad;

    /**
     * Crea una nueva instancia de la clase Carrito.
     *
     * @param nombreJuegos Un array con los nombres de los juegos en el carrito.
     * @param precios Un array con los precios de los juegos en el carrito.
     * @param precioTotal El precio total de todos los juegos en el carrito.
     * @param cantidad La cantidad de juegos en el carrito.
     */
    public Carrito(String[] nombreJuegos, int[] precios, float precioTotal, int cantidad) {
        NombreJuegos = nombreJuegos;
        this.precios = precios;
        this.precioTotal = precioTotal;
        this.cantidad = cantidad;
    }

    /**
     * Agrega un producto al carrito.
     */
    public void agregarProducto(){}

    /**
     * Elimina un producto del carrito.
     */
    public void eliminarProducto(){}

    /**
     * Calcula el precio total de los juegos en el carrito.
     */
    public void calcularPrecioTotal(){}

    /**
     * Realiza la compra de los juegos en el carrito.
     */
    public void realizaCompra(){}

}
