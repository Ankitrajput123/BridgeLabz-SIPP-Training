import java.util.Stack;

class MyQueue {
    Stack<Integer> stackEnqueue = new Stack<>();
    Stack<Integer> stackDequeue = new Stack<>();

    // Enqueue operation (push element to end)
    public void enqueue(int x) {
        stackEnqueue.push(x);
    }

    // Dequeue operation (remove element from front)
    public int dequeue() {
        if (stackDequeue.isEmpty()) {
            // Transfer all elements from stackEnqueue to stackDequeue
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
        if (stackDequeue.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return stackDequeue.pop();
    }

    // Peek front element without removing it
    public int peek() {
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
        if (stackDequeue.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return stackDequeue.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
    }
}
public class Main {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.peek());    // 20
        q.enqueue(40);
        System.out.println(q.dequeue()); // 20
        System.out.println(q.dequeue()); // 30
        System.out.println(q.dequeue()); // 40
        System.out.println(q.dequeue()); // Queue is empty!
    }
}

