package PairListMap;

public class PairListMap <K, V>{
    PairListMap nachfolger;
    K key;
    V value;
    static int size = 1;

    PairListMap(K key, V value){
        if(key != null){
            this.key = key;
        }
        this.value = value;
    }

    public void put(K key, V value){
        if(nachfolger == null){
            nachfolger = new PairListMap(key, value);
            size++;
        } else {
            nachfolger.put(key, value);
        }
    }

    public V get(K key){
        if(this.key.equals(key)){
            return this.value;
        }
        else {
            if(this.nachfolger != null) {
                this.nachfolger.get(key);
            }
            else {
                throw new KeyNotFoundException("Key not found in list: " + key.toString());
            }
        }
        return null;
    }

    public int size(){
        return size;
    }
}
