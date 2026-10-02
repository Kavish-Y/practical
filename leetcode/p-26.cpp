#include<iostream>
using namespace std;
class one{
    public:
    int a[3]={1,1,2};
    int i;
    int j=1;
    int k=0;
    void check(){
    for(i=1;i<3;i++){
        if(a[i]!=a[i-1]){
            a[j]=a[i];
            j++;
        }       
}
}
};
int main(){
    one o1;
    o1.check();
    return 0;
}