import java.util.HashMap;



public class UsingHashMap<K, V> implements IMyMap<K, V> {

    private HashMap<K, V> hashMap;

    public UsingHashMap() {
        hashMap = new HashMap<K, V>();
    }

    @Override
    public void put(K key, V value) {
        hashMap.put(key, value);
    }

    @Override
    public V get(K key) {
        return hashMap.get(key);
    }

    @Override
    public boolean containsKey(K key) {
        return hashMap.containsKey(key);
    }

    @Override
    public boolean containsValue(V value) {
        return hashMap.containsValue(value);
    }

    @Override
    public V remove(K key) {
        return hashMap.remove(key);
    }

    @Override
    public int size() {
        return hashMap.size();
    }

    @Override
    public void clear() {
        hashMap.clear();
    }

    @Override
    public boolean isEmpty() {
        return hashMap.isEmpty();
    }

    @Override
    public HashMap<K, V> getMap() {
        return hashMap;
    }
}
