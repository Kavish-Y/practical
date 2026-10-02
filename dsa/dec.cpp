#include<iostream>
using namespace std;
class arr{
    int a[5]={5,3,4,6,7};
    int b[5];
    void dec(){
        for(int i=1;i<5;i++){
            if(a[i]>a[i+1]){
                b[i]=a[i];
            }
        }
    }
};