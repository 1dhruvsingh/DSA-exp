 #include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
};

class Stack {
private:
    Node* top;

public:
    Stack() {
        top = nullptr;
    }

    void Push(int val) {
        Node* newNode = new Node();
        newNode->data = val;
        newNode->next = top;
        top = newNode;
    }

    void Pop() {
        if (top == nullptr) {
            cout << "Stack is empty!" << endl;
            return;
        }
        Node* temp = top;
        top = top->next;
        delete temp;
    }

    void Display() {
        if (top == nullptr) {
            cout << "Stack is empty!" << endl;
            return;
        }
        Node* temp = top;
        while (temp != nullptr) {
            cout << temp->data << " ";
            temp = temp->next;
        }
        cout << endl;
    }
};

int main() {
    Stack stack;
    stack.Push(10);
    stack.Push(20);
    stack.Push(30);
    
    cout << "Stack elements: ";
    stack.Display();
    
    stack.Pop();
    cout << "Stack after pop: ";
    stack.Display();

    return 0;
}
