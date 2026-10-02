#include<iostream>
using namespace std;
class one{
    public:
    int arr[4] = {2,7,11,15};
    int i,j;
    int target=9;
    void show(){
        bool found = false;
    for(i=0;i<4;i++){
        for(j=i+1;j<=4;j++){
            if(arr[i]+arr[j]==target){
                cout<<"["<<i<<","<<j<<"]";
                return; //to stop the loop
            }

        }
    }
    if(!found){
        cout<<"not avilable";
    }
    }
};
int main(){
    one o1;
    o1.show();
    return 0;
}