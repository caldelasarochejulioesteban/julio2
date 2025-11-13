/*
 * MethodCounter.java
 *
 * Cuenta los métodos definidos en un archivo Java.
 *
 * @version 1.0 07-Nov-2025
 * @author Julio
 */

/**
 * La clase MethodCounter detecta y cuenta métodos dentro del código fuente.
 */
public class MethodCounter {

    private int totalMetodos;

    /**
     * Cuenta los métodos en el arreglo de líneas proporcionado.
     *
     * @param lineas arreglo con las líneas del código fuente
     */
    public void contar(String[] lineas) {
        totalMetodos = 0;

        for (String linea : lineas) {
            String trim = linea.trim();

            if (trim.startsWith("public") && trim.contains("(") && trim.contains(")") && trim.endsWith("{")) {
                totalMetodos++;
            }
        }
    }

    /**
     * Devuelve el número total de métodos encontrados.
     *
     * @return cantidad de métodos
     */
    public int obtenerTotalMetodos() {
        return totalMetodos;
    }
}
