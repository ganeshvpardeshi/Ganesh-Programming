#include<iostream>
#include<stdlib.h>
#include<conio.h>
using namespace std;
int max(int x, int y)
{
    int result=0;

        if(x>y)
            {
                cout<<"The a is Greater than b"<<endl;
                result=x;
            }
        else if(y>x)  
            {
                cout<<"The b is Greater than a"<<endl;
                result=y;
            }
        else    
            {
                cout<<"Both value of a and b are Equal"<<endl;
            }
        return result;
};
int add(int c, int d)
{
    int sum=0;
    sum=c+d;
    cout<<"The Addition is :"<<sum<<endl;
    return sum;
}
int main()
{
    int max (int x, int y);
    int a=0,b=0;
    cout<<"Enter the value of a : ";
    cin>>a;
    cout<<"Enter the value of b : ";
    cin>>b;
    
    cout<<max(a,b)<<endl;

    cout<<"\nEnter the value of a for Addition: "<<endl;
    cin>>a;
    cout<<"Enter the value of b : for Addition"<<endl;
    cin>>b;
    add(a,b);
    
    getch();
}