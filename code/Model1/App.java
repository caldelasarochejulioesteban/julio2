/*
 * App.java
 *
 * Clase principal del programa.
 * Ejecuta la lógica de análisis de código fuente.
 *
 * @version 1.0 07-Nov-2025
 * @author Julio
 */

/**
 * La clase App representa el punto de entrada del programa.
 */
public class App {

    /**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args nombre del archivo a analizar (opcional)
     */
    public static void main(String[] args) {
        String archivoEntrada;

        // Verifica si se pasó un archivo como argumento
        if (args.length > 0) {
            archivoEntrada = args[0];
        } else {
            archivoEntrada = "in1.txt";
            System.out.println("⚠ No se especificó un archivo, se usará 'in1.txt' por defecto.");
        }

        Logic2 logica = new Logic2();
        logica.logic2a(archivoEntrada);

        System.out.println("✅ Proceso completado.");
    }
}
