#include<iostream>
using namespace std;
#define MAX 5
 
class one{
    public:
    int top;
    int arr[MAX];
    one(){
        top=-1;
    }
    void push(int value){
        if(top >=(MAX-1)){
            cout<<"stack overflown";
        }
        else{
            top++;
            arr[top]=value;
            cout<<value<<"is pusher in stack"<<endl;
        }
    }
    void pop(){
        if(top<0){
            cout<<"NOTHING TO POP";
        }
        else{
            int pope=arr[top];
            top--;
            cout<<pope<<"the arr is popoed"
        }
    }
};