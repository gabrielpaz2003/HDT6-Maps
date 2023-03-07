import java.util.LinkedHashMap;

public class UsingLinkedHashMap<K, V> implements IMyMap<K, V> {

    private LinkedHashMap<K, V> linkedHashMap;

    public UsingLinkedHashMap() {
        linkedHashMap = new LinkedHashMap<K, V>();
    }

    @Override
    public void put(K key, V value) {
        linkedHashMap.put(key, value);
    }

    @Override
    public V get(K key) {
        return linkedHashMap.get(key);
    }

    @Override
    public boolean containsKey(K key) {
        return linkedHashMap.containsKey(key);
    }

    @Override
    public boolean containsValue(V value) {
        return linkedHashMap.containsValue(value);
    }

    @Override
    public V remove(K key) {
        return linkedHashMap.remove(key);
    }

    @Override
    public int size() {
        return linkedHashMap.size();
    }

    @Override
    public void clear() {
        linkedHashMap.clear();
    }

    @Override
    public boolean isEmpty() {
        return linkedHashMap.isEmpty();
    }

    @Override
    public LinkedHashMap<K, V> getMap() {
        return linkedHashMap;
    }
}


