#include<iostream>
using namespace std;
int main()
{
    //using AND operator 
    int a=10,b=20,c=10;
    if((a==b)&&(b==c)&&(a==c))
    {
        cout<<"The a Equal to c "<<endl;
    }
    else 
    {
        cout<<"The a is not eqaul to b "<<endl;
    }
    
    //using OR operator
    if((a==b)||(b==c)||(a==c))
    {
        cout<<"The a Equal to c "<<endl;
    }
    else
    {
        cout<<"The a is equal to c "<<endl;
    }
}