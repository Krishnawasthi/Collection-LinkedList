# Collection-LinkedList
# LinkedList Basics

`LinkedList` is a class in Java that implements the `List` and `Deque` interfaces.

It stores elements as **nodes**, where each node contains data and references to the previous and next nodes.
<img width="814" height="357" alt="image" src="https://github.com/user-attachments/assets/2d8161e3-b069-471c-9c68-98bfed04490f" />


## Basic Example

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("SQL");

        System.out.println(list);
    }
}
```

## Internal Structure

A Java `LinkedList` is implemented as a **doubly linked list**.

```text
NULL <- [Java] <-> [Python] <-> [SQL] -> NULL
```

Each node contains:

```text
Previous | Data | Next
```

## Important Characteristics

* Maintains insertion order.
* Allows duplicate elements.
* Allows `null` values.
* Provides fast insertion and deletion at the beginning and end.
* Random access using an index is slower.
* Each node requires extra memory for references.

## LinkedList vs ArrayList

| Feature            | LinkedList         | ArrayList     |
| ------------------ | ------------------ | ------------- |
| Internal Structure | Doubly Linked List | Dynamic Array |
| Random Access      | Slow               | Fast          |
| Insertion/Deletion | Efficient at ends  | Can be costly |
| Memory             | More               | Less          |
| `get(index)`       | O(n)               | O(1)          |

## When to Use LinkedList?

Use `LinkedList` when your application performs frequent insertion and deletion operations, especially at the beginning or end of the list.
