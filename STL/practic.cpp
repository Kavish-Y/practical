#include<iostream>
using namespace std;
#define MAX 5
class pra{
    public:
    int top;
    int arr[MAX];
    pra(){
        top=-1;
    }
    void push(int value){
        if(top>=(MAX-1)){
            cout<<"stack is overflown";
        }
        else{
            top++;
            arr[top]=value;
            cout<<value<<" is pushed"<<endl;
        }
    }
    void pop(){
        if(top<0){
            cout<<"nothing to pop";
        }
        else{
            int pope=arr[top];
            top--;
            cout<<pope<<" is popped"<<endl;
        }
    }
    void peek(){
        if(top<0){
            cout<<"the stack is underflown";
        }
        else{
            cout<<"top element"<<arr[top]<<endl;
        }
    }
};

int main(){
    pra p1,p2;
    p1.push(10);
    p2.push(20);
    p1.pop();
    p2.peek();
}