import java.util.Date;

/**
 * La clase Ticket representa un ticket de compra.
 */
public class Ticket {

    private String itemsCompra[];
    private float precioPagado;
    private Date fechaHora;
    private double descuento;

    /**
     * Crea una nueva instancia de la clase Ticket.
     *
     * @param itemsCompra Un array con los elementos comprados.
     * @param precioPagado El precio total pagado.
     * @param fechaHora La fecha y hora de la compra.
     */
    public Ticket(String[] itemsCompra, float precioPagado, Date fechaHora, double descuento) {
        this.itemsCompra = itemsCompra;
        this.precioPagado = precioPagado;
        this.fechaHora = fechaHora;
        this.descuento = descuento;
    }

    /**
     * Crea un impreso del ticket de compra.
     */
    public void crearImpreso(){}

}