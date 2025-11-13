/*
 * Input.java
 *
 * Maneja la lectura de datos desde archivos de texto.
 *
 * @version 1.0 07-Nov-2025
 * @author Julio
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * La clase Input permite leer el contenido de un archivo y devolverlo como texto.
 */
public class Input {

    private String datos;

    /**
     * Lee un archivo de texto y devuelve su contenido como una cadena.
     *
     * @param nombreArchivo nombre del archivo a leer
     * @return contenido del archivo o null si ocurre un error
     */
    public String leerDatos(String nombreArchivo) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                sb.append(linea).append("\n");
            }

            datos = sb.toString();
            System.out.println("Archivo leído correctamente.");

        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
            return null;
        }

        return datos;
    }
}
