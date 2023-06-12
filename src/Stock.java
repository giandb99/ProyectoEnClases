/**
 * La clase Stock representa el stock de un juego en una plataforma específica.
 */
public class Stock {

    private String nombre;
    Plataforma plataforma;

    /**
     * Crea una nueva instancia de la clase Stock.
     *
     * @param nombre El nombre del juego.
     * @param plataforma La plataforma en la que está disponible el juego.
     */
    public Stock(String nombre, Plataforma plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
    }

    /**
     * Reabastece el stock del juego en la plataforma.
     */
    public void reabastecerStock(){}

}
