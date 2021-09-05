#include<iostream>
using namespace std;
int a, b, c;
class Values
{
    public:
    void get_values()
    {
        cout<<"Enter the value of a"<<endl;
        cin>>a;
        cout<<"Enter the value of b"<<endl;
        cin>>b;
    }

};
class Operation : public Values
{
    public:
    void operation()
    {
        c=a+b;
        cout<<"The Addition is "<<c<<endl;
    }
};
int main()
{
    Operation op;
    op.get_values();
    op.operation();
}