#include<iostream>
using namespace std;
void swap(int &x, int &y)
{
    int temp=0;

    temp = x; 
    x = y; 
    y = temp;

}
int main()
{
    int a=0, b=0;

    cout<<"Enter the value of A "<<endl;
    cin>>a;
    cout<<"Enter the value of B "<<endl;
    cin>>b;

    cout<<"before swaping of a "<<a<<endl;
    cout<<"before swaping of b "<<b<<endl;
    
    swap(a,b);

    cout<<"\nAfter swaping a is "<<a<<endl;
    cout<<"after swaping b is "<<b<<endl;
    
    return 0;
}