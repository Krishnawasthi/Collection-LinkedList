# Collection-LinkedList
# LinkedList Basics

`LinkedList` is a class in Java that implements the `List` and `Deque` interfaces.

It stores elements as **nodes**, where each node contains data and references to the previous and next nodes.
<img width="814" height="357" alt="image" src="https://github.com/user-attachments/assets/2d8161e3-b069-471c-9c68-98bfed04490f" />

<img width="985" height="277" alt="image" src="https://github.com/user-attachments/assets/778a78b9-1fca-4a76-b77d-efa3c94de24c" />



## Basic Example

<img width="1085" height="435" alt="image" src="https://github.com/user-attachments/assets/86d28a53-bd29-48f3-bd6a-e7f91fb86f03" />

<img width="962" height="383" alt="image" src="https://github.com/user-attachments/assets/64bab75f-eb0e-40c5-ab9e-9946a235e5cc" />


<img width="585" height="186" alt="image" src="https://github.com/user-attachments/assets/6bb0ac9a-33f4-4073-ad33-0e4b12a6cb44" />

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
