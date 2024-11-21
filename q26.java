public class q26{
    private int[] queue = new int[5];
    private int front = -1, rear = -1;

    // Enqueue operation
    public void enqueue(int value) {
        if (rear < queue.length - 1) {
            if (front == -1) front = 0;
            queue[++rear] = value;
        } else {
            System.out.println("Queue is full");
        }
    }


    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Dequeued: " + queue[front++]);
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
    }
}
