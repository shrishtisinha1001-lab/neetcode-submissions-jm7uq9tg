class MyStack {

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {

        // Put new element first
        queue1.add(x);

        // Move all old elements behind it
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }

        // Move everything back to queue2
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }
    }

    public int pop() {
        return queue2.poll();
    }

    public int top() {
        return queue2.peek();
    }

    public boolean empty() {
        return queue2.isEmpty();
    }
}