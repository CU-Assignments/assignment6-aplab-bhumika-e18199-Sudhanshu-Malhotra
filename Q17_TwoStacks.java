public class Q17_TwoStacks {
    private int[] arr;
    private int top1, top2;
    private int capacity;

    public Q17_TwoStacks(int size) {
        arr = new int[size];
        capacity = size;
        top1 = -1;
        top2 = size;
    }

    public void push1(int item) {
        if (top1 < top2 - 1) {
            arr[++top1] = item;
        } else {
            System.out.println("Stack1 Overflow");
        }
    }

    public void push2(int item) {
        if (top1 < top2 - 1) {
            arr[--top2] = item;
        } else {
            System.out.println("Stack2 Overflow");
        }
    }

    public int pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        } else {
            System.out.println("Stack1 Underflow");
            return -1;
        }
    }

    public int pop2() {
        if (top2 < capacity) {
            return arr[top2++];
        } else {
            System.out.println("Stack2 Underflow");
            return -1;
        }
    }

    public void displayStacks() {
        System.out.print("Stack1 elements: ");
        for (int i = 0; i <= top1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Stack2 elements: ");
        for (int i = capacity - 1; i >= top2; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q17_TwoStacks stacks = new Q17_TwoStacks(10);

        stacks.push1(1);
        stacks.push1(2);
        stacks.push1(3);
        stacks.push2(10);
        stacks.push2(9);
        stacks.push2(8);

        stacks.displayStacks();

        System.out.println("Popped from Stack1: " + stacks.pop1());
        System.out.println("Popped from Stack2: " + stacks.pop2());

        stacks.displayStacks();
    }
}

