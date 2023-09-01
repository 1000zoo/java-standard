//refer: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html

package DequeTest;

import java.util.*;

/*
ArrayDeque
- Resizable Array, 초기에 용량 (capacity)을 설정할 수 있다.
- remove, contains 같은 기능들을 제외하고는 대부분 O(1)의 시간복잡도를 갖는다.
- Null 원소를 받지 못한다.
- Stack, LinkedList 보다 빠르다.
 */

public class ArrayDequeTest {
    // null 을 받는 지 못받는 지 테스트
    public void test1() {
        Deque<Integer> ad = new ArrayDeque<>();
        Deque<Integer> ll = new LinkedList<>();

//        ad.add(null);     NullPointerException
        ll.add(null);

    }
}
