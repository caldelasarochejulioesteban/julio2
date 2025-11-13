/*
 * Output.java
 *
 * Maneja la escritura de resultados en archivos de texto.
 *
 * @version 1.0 07-Nov-2025
 * @author Julio
 */

import java.io.FileWriter;
import java.io.IOException;

/**
 * La clase Output permite escribir texto en un archivo.
 */
public class Output {

    /**
     * Escribe el texto especificado en un archivo.
     *
     * @param nombreArchivo nombre del archivo de salida
     * @param contenido texto que se desea escribir
     */
    public void escribirDatos(String nombreArchivo, String contenido) {
        try (FileWriter escritor = new FileWriter(nombreArchivo)) {
            escritor.write(contenido);
            System.out.println("Datos guardados en: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al escribir archivo: " + e.getMessage());
        }
    }
}
