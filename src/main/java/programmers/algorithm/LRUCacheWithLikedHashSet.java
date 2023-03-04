package programmers.algorithm;

// Java program to implement LRU cache
// using LinkedHashSet

import java.util.*;

/**
 * least recently used (LRU) page replacement algorithm
 * LRU cache 페이지 교체 알고리즘 : LinkedHashSet 을 이용하는 방법
 */
public class LRUCacheWithLikedHashSet {

    Set<Integer> cache;
    int capacity;

    // 생성자
    public LRUCacheWithLikedHashSet(int capacity) {
        this.cache = new LinkedHashSet<Integer>(capacity);
        this.capacity = capacity;
    }

    // This function returns false if key is not
    // present in cache. Else it moves the key to
    // front by first removing it and then adding
    // it, and returns true.
    public boolean get(int key) {
        if (!cache.contains(key))
            return false;
        cache.remove(key);
        cache.add(key);
        return true;
    }

    /* Refers key x with in the LRU cache */
    public void refer(int key) {
        if (get(key) == false)
            put(key);
    }

    // displays contents of cache in Reverse Order
    public void display() {
        LinkedList<Integer> list = new LinkedList<>(cache);

        // The descendingIterator() method of
        // java.util.LinkedList class is used to return an
        // iterator over the elements in this LinkedList in
        // reverse sequential order
        Iterator<Integer> itr = list.descendingIterator();

        while (itr.hasNext())
            System.out.print(itr.next() + " ");
    }

    public void put(int key) {

        if (cache.size() == capacity) {
            int firstKey = cache.iterator().next();
            cache.remove(firstKey);
        }

        cache.add(key);
    }

    // 코드 실행
    public static void main(String[] args) {
        LRUCache ca = new LRUCache(4);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(1);
        ca.refer(4);
        ca.refer(5);
        ca.display();
    }
}
// https://www.geeksforgeeks.org/lru-cache-implementation/