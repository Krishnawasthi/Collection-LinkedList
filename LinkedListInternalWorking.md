# LinkedList Internal Working

Java `LinkedList` internally uses a **doubly linked list**.

Each node contains three important parts:

```text
+----------+-------+----------+
| Previous | Data  | Next     |
+----------+-------+----------+
```

## Example

For:

```java
LinkedList<Integer> list = new LinkedList<>();

list.add(10);
list.add(20);
list.add(30);
```

The structure is approximately:

```text
NULL <- [10] <-> [20] <-> [30] -> NULL
```

Each node stores a reference to both its previous and next node.

## Insertion

When adding an element between two nodes:

```text
Before:

[10] <-> [30]

After adding 20:

[10] <-> [20] <-> [30]
```

The node references are updated to connect the new node.

## Deletion

Before:

```text
[10] <-> [20] <-> [30]
```

After removing `20`:

```text
[10] <-> [30]
```

The references of `10` and `30` are updated.

## Accessing an Element

When using:

```java
list.get(3);
```

LinkedList cannot directly jump to index `3` like an array.

It must traverse the nodes.

Therefore:

```text
get(index) → O(n)
```

Java's implementation can traverse from either the beginning or the end depending on which is closer to the requested index.

## Time Complexity

| Operation       | Complexity |
| --------------- | ---------: |
| Add First       |       O(1) |
| Add Last        |       O(1) |
| Remove First    |       O(1) |
| Remove Last     |       O(1) |
| Get by Index    |       O(n) |
| Search          |       O(n) |
| Update by Index |       O(n) |

## Memory

LinkedList requires additional memory because every node stores:

```text
Previous Reference
Data
Next Reference
```

Therefore, LinkedList generally consumes more memory than ArrayList.

## Key Point

`LinkedList` is efficient for **insertion and deletion at known node positions**, but it is not efficient for **random access**.

For frequent random access, `ArrayList` is usually a better choice.
