#include<iostream>
using namespace std;
class node{
    int data;
    node* left;
    node* right;
    
    node(int value){
        data=value;
        left=NULL;
        right=NULL;
    }
    node* createTree(){
        cout<<"enter the data for root node";
        cin>>data;
        if(data==-1){
            return NULL;
        }
        node* newnode = new node(data);
    }
};