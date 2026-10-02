#include<iostream>
using namespace std;
class one{
    public:
    int a[5]={1,2,8,5,6};
    int i,j;
    void sort(){
    for (i = 0; i < 5; i++) {
            for (j = i + 1; j < 5; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
    }

void show(){
    for(i=0;i<5;i++){
    cout<<"the sorted array is"<<a[i];
    }
}
};
int main(){
    one o1;
    o1.sort();
    o1.show();
    return 0;
}