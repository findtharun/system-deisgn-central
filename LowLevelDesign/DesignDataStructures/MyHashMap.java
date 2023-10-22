package LowLevelDesign.DesignDataStructures;

import java.util.Objects;

public class MyHashMap<K, V> {
    private static final int INITIAL_SIZE = 1 << 4; // 16
    private static final int MAXIMUM_CAPACITY = 1 << 30;
    Entry[] hashTable;

    MyHashMap() {
        hashTable = new Entry[INITIAL_SIZE];
    }

    MyHashMap(int capacity) {
        int tableSize = (int) Math.pow(2, Math.ceil(Math.log(capacity)) + 1);
        hashTable = new Entry[tableSize];
    }

    class Entry<K, V> {
        K key;
        V value;
        Entry next;

        Entry(K k, V v) {
            key = k;
            value = v;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    // Below is the implementation of JDK
    // public int hashCode(){
    // return Objects.hashCode(key) ^ Objects.hashCode(value);
    // Objects.hashCode() it returns a unique integer based on the memory address of
    // the object. This means that each object will have a unique hash code by
    // default.
    // }
    public int getHashValue(K key) {
        return key.hashCode() % hashTable.length;
        // Below is the Implementation in JDK
        /*
         * int h;
         * return (key == null) ? 0 : (h = key.hashCode()) ^ (h>>>16);
         */
    }

    public void put(K key, V value) {
        int hashVal = getHashValue(key);
        Entry node = hashTable[hashVal];

        if (node == null) {
            Entry newNode = new Entry<K, V>(key, value);
            hashTable[hashVal] = newNode;
        } else {
            Entry previousNode = node;
            while (node != null) {
                if (node.key == key) { // If Key Exists Already, Updating value
                    node.value = value;
                    return;
                }
                previousNode = node;
                node = node.next;
            }
            Entry newNode = new Entry<K, V>(key, value);
            previousNode.next = newNode;
        }
    }

    public V get(K key) {
        int hashVal = getHashValue(key);
        Entry node = hashTable[hashVal];
        while (node != null) {
            if (node.key.equals(key))
                return (V) node.value;
            node = node.next;
        }
        return null;

    }

    public static void main(String args[]) {
        MyHashMap<String, Integer> map = new MyHashMap<>(100);
        map.put("hi", 1);
        map.put("hii", 2);
        try {
            int value = map.get("hi");
            System.out.println(value);
        } catch (Exception e) {
            System.out.println("Key Not Present");
        }
    }
}
