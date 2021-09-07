#include<iostream>
#include<stdlib.h>
#include<conio.h>
using namespace std;
int main()
{
    int a;
    int ch;
    cout<<"enter the value of a"<<endl;
    cin>>a;
    ch=a;

        switch(ch)
            {
                case 1:
                        cout<<"this is case 1"<<endl;
                        break;
                case 2:
                        cout<<"this is case 2"<<endl;
                        break;
                case 3:
                        cout<<"this is case 3"<<endl;
                        break;
                default:
                        cout<<"this default "<<endl;
                        break;
            }
    getch();
}