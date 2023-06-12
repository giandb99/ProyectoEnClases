/**
 * La clase Compra representa una transacción de compra realizada por un usuario.
 */
public class Compra {

    private String factura;
    private float precioTotal;
    private float precioDescontado;

    /**
     * Crea una nueva instancia de la clase Compra.
     *
     * @param factura El número de factura de la compra.
     * @param precioTotal El precio total de la compra.
     * @param precioDescontado El precio descontado de la compra.
     */
    public Compra(String factura, float precioTotal, float precioDescontado) {
        this.factura = factura;
        this.precioTotal = precioTotal;
        this.precioDescontado = precioDescontado;
    }

    /**
     * Acepta la compra y finaliza la transacción.
     */
    public void aceptarCompra(){}

    /**
     * Cancela la compra y anula la transacción.
     */
    public void cancelarCompra(){}

    /**
     * Realiza el método de pago para completar la transacción.
     */
    public void metodoPago(){}

}
