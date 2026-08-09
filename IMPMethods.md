# LinkedList Methods

Java `LinkedList` provides several methods for adding, accessing, updating, and removing elements.

## Creating LinkedList

```java
LinkedList<Integer> list = new LinkedList<>();
```

## Adding Elements

```java
list.add(10);
list.add(20);

list.addFirst(5);
list.addLast(30);
```

Result:

```text
[5, 10, 20, 30]
```

## Accessing Elements

```java
list.get(1);
list.getFirst();
list.getLast();
```

## Updating Elements

```java
list.set(1, 50);
```

## Removing Elements

```java
list.remove();
list.remove(1);

list.removeFirst();
list.removeLast();
```

## Searching

```java
list.contains(20);
list.indexOf(20);
list.lastIndexOf(20);
```

## Other Useful Methods

```java
list.size();
list.isEmpty();
list.clear();
```

## Common Methods

| Method          | Purpose               |
| --------------- | --------------------- |
| `add()`         | Adds an element       |
| `addFirst()`    | Adds at beginning     |
| `addLast()`     | Adds at end           |
| `get()`         | Gets element by index |
| `set()`         | Updates an element    |
| `remove()`      | Removes an element    |
| `removeFirst()` | Removes first element |
| `removeLast()`  | Removes last element  |
| `contains()`    | Checks for element    |
| `size()`        | Returns size          |
| `clear()`       | Removes all elements  |

## Example

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.addFirst(5);
        list.addLast(30);

        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }
}
```
