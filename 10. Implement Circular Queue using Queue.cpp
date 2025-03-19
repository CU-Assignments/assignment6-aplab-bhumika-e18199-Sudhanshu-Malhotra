#include <iostream>
#include <queue>

using namespace std;

class CircularQueue {
    queue<int> q;
    int maxSize;

public:
    CircularQueue(int size) {
        maxSize = size;
    }

    void enqueue(int x) {
        if (q.size() == maxSize) {
            cout << "Queue is full\n";
            return;
        }
        q.push(x);
    }

    void dequeue() {
        if (q.empty()) {
            cout << "Queue is empty\n";
            return;
        }
        q.pop();
    }

    int front() {
        if (q.empty()) {
            cout << "Queue is empty\n";
            return -1;
        }
        return q.front();
    }

    int rear() {
        if (q.empty()) {
            cout << "Queue is empty\n";
            return -1;
        }
        return q.back();
    }

    bool isEmpty() {
        return q.empty();
    }

    bool isFull() {
        return q.size() == maxSize;
    }
};

int main() {
    CircularQueue cq(3);

    cq.enqueue(10);
    cq.enqueue(20);
    cq.enqueue(30);
    
    cout << "Front: " << cq.front() << "\n";
    cout << "Rear: " << cq.rear() << "\n";

    cq.dequeue();
    cout << "After Dequeue - Front: " << cq.front() << "\n";

    cq.enqueue(40);
    cout << "Rear after inserting 40: " << cq.rear() << "\n";

    return 0;
}
