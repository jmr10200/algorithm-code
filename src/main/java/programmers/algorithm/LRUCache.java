package programmers.algorithm;
/* We can use Java inbuilt Deque as a double
ended queue to store the cache keys, with
the descending time of reference from front
to back and a set container to check presence
of a key. But remove a key from the Deque using
remove(), it takes O(N) time. This can be
optimized by storing a reference (iterator) to
each key in a hash map. */
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


/**
 * least recently used (LRU) page replacement algorithm
 * LRU 캐시 페이지 교체 알고리즘 : Deque, HashSet 을 이용하는 방법
 */
public class LRUCache {

    // store keys of cache 캐시의 키값 저장 (Deque 는 LIFO)
    private Deque<Integer> doublyQueue;

    // store references of key in cache
    private HashSet<Integer> hashSet;

    // 캐시 최대 용량
    private final int CACHE_SIZE;

    // Constructor
    public LRUCache(int capacity) {
        doublyQueue = new LinkedList<>();
        hashSet = new HashSet<>();
        CACHE_SIZE = capacity;
    }

    /* Refer the page within the LRU cache */
    public void refer(int page) {
        // 포함되어 있지 않으면 처음방문
        if (!hashSet.contains(page)) {
            if (doublyQueue.size() == CACHE_SIZE) {
                int last = doublyQueue.removeLast(); // 마지막 방문 페이지 제거
                hashSet.remove(last);
            }
        } else { /* The found page may not be always the last
				element, even if it's an intermediate
				element that needs to be removed and added
				to the start of the Queue */
            // 포함되어 있으면 제거(remove()) 하고 앞으로 꺼내야함 (push())
            doublyQueue.remove(page);
        }
        doublyQueue.push(page);
        hashSet.add(page); // HashSet 은 중복 값 x, 순서보장 x
    }

    // 캐시 출력
    public void display() {
        Iterator<Integer> itr = doublyQueue.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    // 코드 실행
    public static void main(String[] args) {

        // LRU 캐시 4로 생성
        LRUCache cache = new LRUCache(4);
        cache.refer(1); // 1
        cache.refer(2); // 2 1
        cache.refer(3); // 3 2 1
        cache.refer(1); // 1 3 2
        cache.refer(4); // 4 1 3 2
        cache.refer(5); // 5 4 1 3
        cache.display();
    }
}
// This code is contributed by Niraj Kumar
// https://www.geeksforgeeks.org/lru-cache-implementation/
