#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* left;
    Node* right;

    Node(int value) {
        data = value;
        left = NULL;
        right = NULL;
    }
};

Node* createTree() {

    int data;
    cin >> data;

    if (data == -1) {
        return NULL;
    }

    Node* newNode = new Node(data);

    cout << "Enter left child of " << data << ": ";
    newNode->left = createTree();

    cout << "Enter right child of " << data << ": ";
    newNode->right = createTree();

    return newNode;
}

int main() {

    cout << "Enter root data: ";
    Node* root = createTree();

    return 0;
}