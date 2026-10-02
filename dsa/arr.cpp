#include<iostream>
using namespace std;
class arr{
    public:
    int a[3] = {12,2,3};
    int i;
    void check(){
        int smallest=a[0];
        for(i=0;i<3;i++){
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        cout<<"smallest="<<smallest;
    }
};

int main(){
    arr a1;
    a1.check();
}
