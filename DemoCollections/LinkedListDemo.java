package DemoCollections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Aman");
        ls.add("Jeevan");
        ls.add("Tushar");
        ls.add("Jay");
        ls.addFirst("Piyush");
        ls.addLast("Aaakash");
        ls.add(0, "Pratham");

        System.out.println(ls);

        System.out.println(ls.get(4));
        System.out.println(ls.getFirst());
        System.out.println(ls.getLast());
        System.out.println(ls.size());
        System.out.println(ls.indexOf("Aman"));

        System.out.println(ls.remove(4));
        System.out.println(ls);
        System.out.println(ls.size());

        System.out.println(ls.peek());

        LinkedList<String> queue = new LinkedList<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        LinkedList<String> Stack = new LinkedList<>();
        Stack.push("1");
        Stack.push("2");
        Stack.push("3");

        System.out.println(Stack);
        System.out.println(Stack.pop());
        System.out.println(Stack.pop());
        System.out.println(Stack.pop());

        // | Method | Description | Time Complexity |
        // | ------ | ----------- | --------------- |
        // | `add(E e)` | Add element at end | O(1) |
        // | `add(int index, E e)` | Insert at specific position | O(n) |
        // | `addFirst(E e)` | Add element at beginning | O(1) |
        // | `addLast(E e)` | Add element at end | O(1) |
        // | `get(int index)` | Access element by index | O(n) |
        // | `getFirst()` | Access first element | O(1) |
        // | `getLast()` | Access last element | O(1) |
        // | `set(int index, E e)` | Update element | O(n) |
        // | `remove()` | Remove first element | O(1) |
        // | `remove(int index)` | Remove by index | O(n) |
        // | `remove(Object o)` | Remove by value | O(n) |
        // | `removeFirst()` | Remove first element | O(1) |
        // | `removeLast()` | Remove last element | O(1) |
        // | `contains(Object o)` | Check element exists | O(n) |
        // | `indexOf(Object o)` | Find first occurrence | O(n) |
        // | `lastIndexOf(Object o)` | Find last occurrence | O(n) |
        // | `size()` | Number of elements | O(1) |
        // | `clear()` | Remove all elements | O(n) |
        // | `peek()` | View first element | O(1) |
        // | `poll()` | Retrieve and remove first element | O(1) |
        // | `offer(E e)` | Add element to queue | O(1) |
        // | `push(E e)` | Push onto stack | O(1) |
        // | `pop()` | Pop from stack | O(1) |

    }
}

// ArrayList vs LinkedList — When to Use Which
// | Operation | ArrayList | LinkedList |
// | --------- | --------- | ---------- |
// | `get(i)` (Access by index) | ✅ **O(1)** — Fast | ❌ **O(n)** — Slow |
// | Add at end | ✅ **O(1)** (amortized) | ✅ **O(1)** |
// | Add at beginning | ❌ **O(n)** — Shifts all elements | ✅ **O(1)** |
// | Add in middle | ❌ **O(n)** — Shifts elements | ❌ **O(n)** — Traversal
// required |
// | Remove from beginning | ❌ **O(n)** — Shifts elements | ✅ **O(1)** |
// | Remove from end | ✅ **O(1)** | ✅ **O(1)** |
// | Remove from middle | ❌ **O(n)** | ❌ **O(n)** |
// | Search (`contains()`) | ❌ **O(n)** | ❌ **O(n)** |
// | Memory Usage | ✅ Less memory | ❌ More memory (stores `prev` and `next`
// pointers) |
// | Best Use Case | Random access and frequent reads | Frequent
// insertions/deletions at the ends |

// | Use ArrayList When... | Use LinkedList When... |
// | --------------------- |----------------------- |
// | You frequently use `get(index)` | You frequently add/remove at the
// beginning |
// | Read operations are common | Queue/Deque operations are common |
// | Memory efficiency matters | Random access is not important |
// | General-purpose list implementation | Frequent modifications at list ends |
