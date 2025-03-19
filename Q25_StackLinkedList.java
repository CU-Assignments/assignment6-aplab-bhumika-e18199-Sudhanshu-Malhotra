class Node1 {
    int data;
    Node next;

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Q25_StackLinkedList {
    private Node top;

    public Q25_StackLinkedList() {
        this.top = null;
    }

    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int item = top.data;
        top = top.next;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack elements: ");
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q25_StackLinkedList stack = new Q25_StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element is " + stack.peek());

        System.out.println("Popped element is " + stack.pop());
        stack.display();
    }
}

