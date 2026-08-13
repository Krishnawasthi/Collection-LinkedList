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
# LinkedList Operations

## 1. Create LinkedList

```java
LinkedList<Integer> list = new LinkedList<>();
```

## 2. Add Elements

```java
list.add(10);
list.add(20);
list.add(30);
```

## 3. Add at Specific Index

```java
list.add(1, 15);
```

## 4. Add First Element

```java
list.addFirst(5);
```

## 5. Add Last Element

```java
list.addLast(40);
```

## 6. Get Element

```java
int value = list.get(2);
```

## 7. Get First Element

```java
list.getFirst();
```

## 8. Get Last Element

```java
list.getLast();
```

## 9. Update Element

```java
list.set(1, 25);
```

## 10. Remove by Index

```java
list.remove(2);
```

## 11. Remove First Element

```java
list.removeFirst();
```

## 12. Remove Last Element

```java
list.removeLast();
```

## 13. Remove Specific Element

```java
list.remove(Integer.valueOf(20));
```

## 14. Check Element

```java
list.contains(30);
```

## 15. Find Index

```java
list.indexOf(30);
```

## 16. Find Last Index

```java
list.lastIndexOf(30);
```

## 17. Get Size

```java
list.size();
```

## 18. Check Empty

```java
list.isEmpty();
```

## 19. Clear LinkedList

```java
list.clear();
```

## 20. Iterate Through LinkedList

```java
for (Integer value : list) {
    System.out.println(value);
}
```

## Complete Example

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);
        list.addLast(40);

        list.add(2, 15);

        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.set(1, 25);

        list.removeFirst();
        list.removeLast();

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(30));
    }
}
```

### Key Operations

```text
Create → Add → Get → Update → Remove → Search → Iterate → Clear
```

