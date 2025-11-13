/*
 * Data.java
 *
 * Administra y muestra la información procesada por el sistema.
 *
 * @version 1.0 07-Nov-2025
 * @author Julio
 */

/**
 * La clase Data almacena y gestiona la información leída.
 */
public class Data {

    /**
     * Muestra información básica sobre los datos recibidos.
     *
     * @param datos texto que será procesado
     */
    public void guardarDatos(String datos) {
        System.out.println("Datos recibidos (" + datos.length() + " caracteres).");
    }
}
