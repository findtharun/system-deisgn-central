package LowLevelDesign.DesignDataStructures.HashMap;

import java.util.ArrayList;

public class HashMapImplementation {
    private static final int INITIAL_CAPACITY = 1 << 4; // 16

    static class Map<K, V> {
        private int tableSize;
        ArrayList<Entry<K, V>> bucketArray;

        // Default Capacity
        Map() {
            bucketArray = new ArrayList<>(INITIAL_CAPACITY);
            tableSize = 0;
            for (int i = 0; i < INITIAL_CAPACITY; i++) {
                bucketArray.add(null);
            }
        }

        // If User Specifies , Capacity then HashMap Size would be closest power of 2
        Map(int capacity) {

            int customCapacity = (int) Math.pow(2, Math.ceil(Math.log(capacity))); // Table Size
            bucketArray = new ArrayList<>(customCapacity);
            tableSize = 0;

            for (int i = 0; i < customCapacity; i++) {
                bucketArray.add(null);
            }
        }

        public int getTableSize() {
            return tableSize; // Table Size is Current size, Capacity is Allocated Size
        }

        private int getBucketIndex(K key) {
            return key == null ? 0 : key.hashCode() % bucketArray.size();
        }

        public V get(K key) {
            int bucketIndex = getBucketIndex(key);
            Entry<K, V> head = bucketArray.get(bucketIndex);
            while (head != null) {
                if (head.key.equals(key)) {
                    return head.value;
                }
                head = head.next;
            }
            return null;
        }

        public void put(K key, V value) {
            int bucketIndex = getBucketIndex(key);
            Entry<K, V> head = bucketArray.get(bucketIndex);
            if (head == null) {
                Entry<K, V> newNode = new Entry<K, V>(key, value);
                bucketArray.set(bucketIndex, newNode);
                tableSize++;
            } else {
                Entry<K, V> prevNode = head;
                while (head != null) {
                    if (head.key.equals(key)) {
                        head.value = value;
                        return;
                    }
                    prevNode = head;
                    head = head.next;
                }
                Entry<K, V> newNode = new Entry<K, V>(key, value);
                prevNode.next = newNode;
                tableSize++;
                if ((1.0 * this.getTableSize()) / bucketArray.size() > 0.75) {
                    System.out.println("Load Factor is more than threshold, increase the size of buckets");
                }
            }
        }

        public void remove(K key) {
            int bucketIndex = getBucketIndex(key);
            Entry<K, V> head = bucketArray.get(bucketIndex);
            Entry<K, V> prev = null;

            while (head != null) {
                if (head.key.equals(key)) {
                    break;
                }
                prev = head;
                head = head.next;
            }
            if (head == null)
                return; // There is No Such Key
            if (prev == null)
                bucketArray.set(bucketIndex, head.next); // If Head is the Key to Be removed
            else
                prev.next = head.next;
            tableSize--;
        }
        // End of Code
    }
}
