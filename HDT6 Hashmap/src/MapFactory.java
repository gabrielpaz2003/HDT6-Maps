
public class MapFactory<K, V> {

    /**
     * Este método recibe un entero que indica el tipo de mapa a utilizar
     * 1: HashMap
     * 2: TreeMap
     * 3: LinkedHashMap
     * @param opcion
     * @return El tipo de mapa que se desea.
     */
    public IMyMap<K, V> getMap(int opcion) {
        switch (opcion) {
            case 1:
                return new UsingHashMap<K, V>();
            case 2:
                return new UsingTreeMap<K, V>();
            case 3:
                return new UsingLinkedHashMap<K, V>();
            default:
                return null;
        }
    }
}
