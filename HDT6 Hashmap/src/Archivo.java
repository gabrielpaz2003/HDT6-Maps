import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Archivo {

    public static <K, V> void leerArchivo(String rutaArchivo, IMyMap<K, V> map) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("|");
                if (datos.length == 2) {
                    K key = (K) datos[0];
                    V value = (V) datos[1];
                    map.put(key, value);
                }
            }
        } catch (IOException e) {
            System.err.format("Error de E/S: %s%n", e);
        }
    }
}

