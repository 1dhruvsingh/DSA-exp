#include <iostream>
#include <stack>
using namespace std;

int main() {
    stack<int> stack;
    int choice, value;

    do {
        cout << "1. Push in stack\n";
        cout << "2. Pop from stack\n";
        cout << "3. Display stack\n";
        cout << "4. Exit\n";
        cout<< "Enter choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "Enter value to push: ";
                cin >> value;
                stack.push(value);
                break;
            case 2:
                if (!stack.empty()) {
                    cout << "Popped value: " << stack.top() << "\n";
                    stack.pop();
                } else {
                    cout << "Stack is empty.\n";
                }
                break;
            case 3:
                cout << "Stack elements: ";
                while (!stack.empty()) {
                    cout << stack.top() << " ";
                    stack.pop();
                }
                cout << "\n";
                break;
            case 4:
                cout << "Exiting...\n";
                break;
            default:
                cout << "Invalid choice. Please try again.\n";
                break;
        }
    } while (choice != 4);

    return 0;
}
