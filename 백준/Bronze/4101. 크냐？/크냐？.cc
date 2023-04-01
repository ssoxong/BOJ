#include <iostream>
using namespace std;

int main(){
    int n,m;
    while(1){
    cin>>n>>m;
    if(n==m&&n==0){
        return 0;
    }
    if(n>m)
        cout<<"Yes\n";
    else
        cout<<"No\n";
    }
    return 0;
}