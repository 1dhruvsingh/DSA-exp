#include <iostream>
using namespace std;

struct Node {
    int num;
    Node* next;
};

// Define the head variable
Node* head = nullptr;

void insertatbeginning(Node*& head, int newdata) {
    Node* newnode = new Node();
    newnode->num = newdata;
    newnode->next = head; 
    head = newnode;
}

void insert_Node(int n) {
    struct Node* new_node = new Node;
    new_node->num = n;
    new_node->next = head;
    head = new_node;
}

// Function to print the linked list
void printList() {
    Node* temp = head;
    while (temp != nullptr) {
        cout << temp->num << " ";
        temp = temp->next;
    }
    cout << endl;
}

int main() {
    // Test the linked list implementation
    insertatbeginning(head, 1);
    insertatbeginning(head, 2);
    insert_Node(3);
    printList();

    return 0;
}