/*
 * LineCounter.java
 *
 * Cuenta las líneas no vacías en un archivo fuente.
 *
 * @version 1.0 07-Nov-2025
 * @author Julio
 */

/**
 * La clase LineCounter cuenta las líneas válidas de código.
 */
public class LineCounter {

    private int totalLineas;

    /**
     * Cuenta el número de líneas no vacías.
     *
     * @param lineas arreglo con las líneas del archivo
     */
    public void contar(String[] lineas) {
        totalLineas = 0;

        for (String linea : lineas) {
            if (!linea.trim().isEmpty()) {
                totalLineas++;
            }
        }
    }

    /**
     * Devuelve el total de líneas contadas.
     *
     * @return número total de líneas
     */
    public int obtenerTotalLineas() {
        return totalLineas;
    }
}
