#include<iostream>
using namespace std;
int v;
class values
{
    public :
    void get_values()
    {
        cout<<"Enter the value "<<endl;
        cin>>v;
        cout<<v<<endl;
    }
};
int main()
{
    values v;
    v.get_values();
}