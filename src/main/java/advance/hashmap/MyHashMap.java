package advance.hashmap;



public class MyHashMap <K, V>{

    private static final int DEFAULT_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;

    private Node<K, V>[] table;
    private int size;

    static class Node<K,V> {
        int hash;
        K key; V value;
        Node<K, V> next;
    }

    private int hash(K key) {
        // Spread high bits down (like Java's HashMap)
        int h = key.hashCode();
        return h ^ (h >>> 16);
    }

    public void put(K key, V value) {
        int idx = hash(key) & (table.length - 1);
        // 1. Walk chain — update if key exists
        // 2. Otherwise prepend/append new Node
        // 3. if (++size > threshold) resize()
    }

    private void resize() {
        Node<K,V>[] newTable = new Node[table.length * 2];
        // rehash all entries using (hash & newCapacity-1)
        // Java 8 trick: bit check splits chain into lo/hi lists
    }
}
