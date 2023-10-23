package LowLevelDesign.DesignDataStructures.HashMap;

public class Entry<K, V> {
    K key;
    V value;
    Entry<K, V> next = null;

    Entry(K key, V val) {
        this.key = key;
        this.value = val;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    // Below is the implementation of JDK
    // public int hashCode(){
    // return Objects.hashCode(key) ^ Objects.hashCode(value);
    // Objects.hashCode() it returns a unique integer based on the memory address of
    // the object. This means that each object will have a unique hash code by
    // default.
    // }

    @Override
    public int hashCode() { // We are Overriding Default Implementation
        int hash = ((key == null) ? 0 : key.hashCode());
        return hash;
    }

    // @Override
    // public boolean equals(Object obj) {
    // if (obj == this) return true;

    // if (obj instanceof Entry) {
    // Entry entry = (Entry) obj;

    // return key.equals(entry.getKey()) &&
    // value.equals(entry.getValue());
    // }
    // return false;
    // }
    @Override
    public String toString() {
        return "{" + key + ", " + value + "}";
    }
}
