
import java.util.HashMap;
import java.util.Set;


public interface IHashMap<K, V> {
  
  public void put(K key, V value);
  
  public V get(K key);
  
  public boolean containsKey(K key);
  
  public boolean containsValue(V value);
  
  public V remove(K key);
  
  public int size();
  
  public void clear();
  
  public boolean isEmpty();
  
  public Set<K> keySet();

  public HashMap<K, V> getHashMap();
  
}


