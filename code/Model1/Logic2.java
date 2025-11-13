/*
 * Logic2.java
 *
 * Contiene la lógica del programa para contar líneas y métodos
 * dentro de un archivo de código fuente.
 *
 * @version 1.0 07-Nov-2025
 * @author Julio
 */

/**
 * La clase Logic2 realiza el análisis del archivo fuente.
 */
public class Logic2 {

    private String nombrePrograma;
    private String pad;
    private int contadorMetodos;
    private int totalLineas;
    private String salidaFinal;

    /**
     * Método principal de análisis. Lee un archivo, cuenta sus líneas
     * y métodos, y guarda los resultados en un archivo de salida.
     *
     * @param nombreArchivo archivo a analizar
     */
    public void logic2a(String nombreArchivo) {
        Input entrada = new Input();
        String datos = entrada.leerDatos(nombreArchivo);

        if (datos == null) {
            System.out.println("❌ No se pudo leer el archivo: " + nombreArchivo);
            return;
        }

        Data data = new Data();
        data.guardarDatos(datos);

        String[] arregloDatos = datos.split("\n");

        LineCounter contadorLineas = new LineCounter();
        contadorLineas.contar(arregloDatos);

        MethodCounter contador = new MethodCounter();
        contador.contar(arregloDatos);

        totalLineas = contadorLineas.obtenerTotalLineas();
        contadorMetodos = contador.obtenerTotalMetodos();

        String textoSalida = "Archivo analizado: " + nombreArchivo + "\n"
                + "Líneas totales: " + totalLineas + "\n"
                + "Métodos totales: " + contadorMetodos;

        Output salida = new Output();
        salida.escribirDatos("resultado.txt", textoSalida);

        System.out.println(textoSalida);
    }
}
