# LinkedList as Queue and Deque

`LinkedList` can be used as a **List, Queue, and Deque** because it implements these interfaces.

## LinkedList as Queue

A Queue follows the **FIFO (First In, First Out)** principle.

```java
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue);

        System.out.println(queue.peek());

        queue.poll();

        System.out.println(queue);
    }
}
```

### Queue Methods

| Method    | Purpose               |
| --------- | --------------------- |
| `offer()` | Adds element          |
| `peek()`  | Returns first element |
| `poll()`  | Removes first element |

## LinkedList as Deque

Deque means **Double Ended Queue**.

Elements can be added or removed from both ends.

```java
LinkedList<Integer> deque = new LinkedList<>();

deque.addFirst(10);
deque.addLast(20);

deque.removeFirst();
deque.removeLast();
```

### Deque Methods

| Method          | Purpose           |
| --------------- | ----------------- |
| `addFirst()`    | Adds at beginning |
| `addLast()`     | Adds at end       |
| `removeFirst()` | Removes first     |
| `removeLast()`  | Removes last      |
| `peekFirst()`   | Views first       |
| `peekLast()`    | Views last        |

## Structure

```text
        Add/Remove
            ↓
     [10] <-> [20] <-> [30]
        ↑               ↑
   First End         Last End
```

## Important Point

`LinkedList` is useful when you need both **List operations** and **Queue/Deque operations**.

For a dedicated queue or deque implementation, `ArrayDeque` is often preferred when you don't need `List` functionality.
