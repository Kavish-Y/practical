#include<iostream>
using namespace std;

#define MAX 5

class ne{
    public:
    int top;
    int arr[MAX];
    ne(){
        top=-1;
    }

    void push(int value){
        if (top >= (MAX-1))
        {
            cout<<"Stack is overflown"<<endl;
        }
        else{
            top++;
            arr[top]=value;
            cout<<value<<" Is pushed in the stack"<<endl;
        }
        
    }
    void pop(){
        if(top<0){
            cout<<"nothing"<<endl;
        }
        else{
            int pope=arr[top];
            top--;
            cout<<pope<<"is popped"<<endl;
        }
    }
    void peek(){
        if(top<0){
            cout<<"stack is emptym"<<endl;
        }
        else{
            cout<<"top element "<<arr[top]<<endl;
        }
    }

};
int main(){
    ne n1;
    n1.push(10);
    n1.push(100);
    n1.push(1000);
    n1.peek();
    n1.pop();
    n1.pop();
    n1.pop();
    return 0;
    //the execution will be based on the object creation 
}
