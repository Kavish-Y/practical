#include<iostream>
#include<vector>
using namespace std;
int main(){
    vector<int> vec;//to initilize vector size at zero
    vec.push_back(1);
    vec.push_back(2);
    vec.push_back(4);
    vec.pop_back();//deleat the last 4
    cout<<vec.size()<<endl;
    cout<<vec.capacity()<<endl;
    cout<<"front"<<vec.front()<<"back"<<vec.back();
    cout<<"vec at 2"<<vec[1]<<"or"<<vec.at(1)<<endl;
    for(int val: vec){
        cout<<val<<" ";
    }
    vector<int> vec1={1,2,3,4,5};
    vec.pop_back();
    vec.erase(vec.begin());
    for(int val: vec1){
        cout<<val<<" ";
    }
    return 0;
}