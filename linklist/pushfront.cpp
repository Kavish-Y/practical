#include<iostream>
using namespace std;
class node{
    public:
    int data;
    node*next;

node* head=NULL;
void create(int c){
    if(head==NULL){
        node*nextptr=new node;
        cout<<"enter the data of new node"<<endl;
        cin>>nextptr->data;
        nextptr->next=NULL;
        head=nextptr;
        cout<<"single link list is created successfully";
    }
    else{
        cout<<"link list phala sa hi thi";
    }
    void show(){
        if(head==NULL){
            cout<<"nothing to show";
        }
        else{
            cout<<"the entered node is "<<ne;
        }
    }
}
};

int main(){
    node n1;
    n1.create(2);
}