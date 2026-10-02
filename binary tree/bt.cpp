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

    cout << "Enter data (-1 for no node): ";
    cin >> data;

    if (data == -1) {
        return NULL;
    }

    Node* newNode = new Node(data);

    cout << "Enter left child of " << data << endl;
    newNode->left = createTree();

    cout << "Enter right child of " << data << endl;
    newNode->right = createTree();

    return newNode;
}

int main() {

    Node* root = createTree();

    cout << "Binary Tree created successfully!" << endl;

    return 0;
}