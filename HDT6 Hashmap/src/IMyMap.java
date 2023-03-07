import java.util.Map;


public interface IMyMap<K, V> {
  
    public void put(K key, V value);
    
    public V get(K key);
    
    public boolean containsKey(K key);
    
    public boolean containsValue(V value);
    
    public V remove(K key);
    
    public int size();
    
    public void clear();
    
    public boolean isEmpty();
    
    public Map<K, V> getMap();
    
  }
  