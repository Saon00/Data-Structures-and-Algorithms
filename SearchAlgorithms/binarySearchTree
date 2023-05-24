#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* left = NULL;
    Node* right = NULL;
};

Node* root = NULL;

Node* insert (Node* root, int value) {
    if (root == NULL) {
        root = new Node ();
        root-> data = value;
        return root;
    }

    if (root->data > value) {
        root-> left = insert (root-> left, value);
    }
    else {
        root-> right = insert (root-> right, value);
    }

    return root;
}


bool search (Node* root, int target) {
    if (root == NULL) {
        return false;
    }

    if (root-> data == target) {
        return true;
    }

    else if (root-> data > target) {
        return search (root-> left, target);
    }
    else return search (root-> right, target);

}

void inorder (Node* root) {
    if (root == NULL) {
        return;
    }
    inorder (root->left);
    cout << root-> data << " ";
    inorder (root-> right);
}

int main () {
    while (true) {
         cout << "1 for insert" << endl;
        cout << "2 for search" << endl;
        int p; cin >> p;

        if (p == 1) {
            cout << "Enter value : ";
            int val; cin >> val;
            root = insert (root, val);
        }
        if (p == 2) {
            cout << "Enter target : ";
            int tar; cin >> tar;
            if (search (root, tar) == true) {
                cout << "Found\n";
            }
            else cout << "Not Found\n";
        }    
        cout << "Current tree values : ";
        inorder (root);
        cout << endl;
    }


}
