import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MapFactory factory = new MapFactory();

        System.out.println("Ingrese la ruta del archivo:");
        String rutaArchivo = scanner.nextLine();

        System.out.println("¿Qué tipo de mapa desea utilizar?");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        IMyMap<String, String> map = factory.getMap(opcion);

        Archivo.leerArchivo(rutaArchivo, map);

        System.out.println("El mapa contiene " + map.size() + " elementos.");
    }
}



