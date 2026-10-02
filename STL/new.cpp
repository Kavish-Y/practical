#include <iostream>
using namespace std;

#define MAX 5  // Maximum size of the stack

class Stack {
    int top;
    int arr[MAX]; // Array to store stack elements

public:
    // Constructor initializes top of stack to -1 (indicating empty)
    Stack() { 
        top = -1; 
    }

    // Push operation: Adds an element to the top
    void push(int value) {
        if (top >= (MAX - 1)) {
            cout << "Stack Overflow! Cannot push " << value << endl;
        } else {
            top++;
            arr[top] = value;
            cout << value << " pushed into stack." << endl;
        }
    }

    // Pop operation: Removes the top element
    void pop() {
        if (top < 0) {
            cout << "Stack Underflow! Nothing to pop." << endl;
        } else {
            int poppedElement = arr[top];
            top--;
            cout << poppedElement << " popped from stack." << endl;
        }
    }

    // Peek/Top operation: Returns the current top element
    void peek() {
        if (top < 0) {
            cout << "Stack is empty." << endl;
        } else {
            cout << "Top element is: " << arr[top] << endl;
        }
    }
};

int main() {
    Stack myStack;

    // Testing Push Operations
    myStack.push(10);
    myStack.push(20);
    myStack.push(30);
    
    // Check Top Element
    myStack.peek();

    // Testing Pop Operations
    myStack.pop();
    myStack.pop();
    
    // Check Top Element again
    myStack.peek();

    return 0;
}