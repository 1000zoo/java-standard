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

public class DequeTest {
    // null 을 받는 지 못받는 지 테스트
    public void test1() {
        Deque<Integer> ad = new ArrayDeque<>();
        Deque<Integer> ll = new LinkedList<>();

//        ad.add(null);     NullPointerException
        ll.add(null);

    }

    // add(offer), addFirst, addLast, push
    // remove(poll), removeFirst, removeLast, pop
    // peek, peekFirst, peekLast
    // 각각 어떤 차이가 있는지
    public void test2() {
        Deque<Integer> dq = new LinkedList<>();

        dq.add(1);
        dq.add(2);
        dq.add(3);
        System.out.println("dq = " + dq); // dq = [1, 2, 3]

        // add
        dq.addFirst(4);
        System.out.println("dq = " + dq); // dq = [4, 1, 2, 3]

        dq.addLast(5);
        System.out.println("dq = " + dq); // dq = [4, 1, 2, 3, 5]

        dq.push(6);
        System.out.println("dq = " + dq); // dq = [6, 4, 1, 2, 3, 5]

        dq.offer(7);
        System.out.println("dq = " + dq); // dq = [6, 4, 1, 2, 3, 5, 7]

        // peek == element() == getFirst() (에러차리 유무 차이)
        System.out.println("dq.element() = " + dq.element()); // dq.element() = 6
        System.out.println("dq.peek() = " + dq.peek()); // dq.peek() = 6
        System.out.println("dq.peekFirst() = " + dq.peekFirst()); // dq.peekFirst() = 6
        System.out.println("dq.peekLast() = " + dq.peekLast()); // dq.peekLast() = 7


        System.out.println("dq.poll() = " + dq.poll()); // dq.poll() = 6
        System.out.println("dq = " + dq);   // dq = [4, 1, 2, 3, 5, 7]
        System.out.println("dq.pollFirst() = " + dq.pollFirst());   // dq.pollFirst() = 4
        System.out.println("dq = " + dq);   // dq = [1, 2, 3, 5, 7]
        System.out.println("dq.pollLast() = " + dq.pollLast()); // dq.poll() = 7
        System.out.println("dq = " + dq);   // dq = [1, 2, 3, 5]

        System.out.println("dq.pop() = " + dq.pop());   // dq.pop() = 1
        System.out.println("dq = " + dq);   // dq = [2, 3, 5]

    }
}
