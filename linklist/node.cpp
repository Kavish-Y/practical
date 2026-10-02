#include<iostream>
using namespace std;
class node{
    public:
    int data;
    node*next;
};
node* head=NULL;
void insertnode(){
    if(head=NULL){
        node*newptr=new node;
        cout<<"enter the data of new node";
        cin>>newptr->data;
        newptr->next=NULL;
        head=newptr;
        cout<<"linklist bana di lodu";
    }
    else{
        cout<<"link list phala sa hi thi lodu";
    }
}
