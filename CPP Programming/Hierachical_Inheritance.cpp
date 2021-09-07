#include<iostream>
#include<stdlib.h>
#include<conio.h>
using namespace std;
int s; // Global Variable
class shapes
{
    public :
    void No_side()
    {
        cout<<"Enter the sides of shapes "<<endl;
        cin>>s;
    }
};
class triangle : public shapes
{
    public :
    int area1;

    void sidesoftriangle()
    {
        if(s==3)
        {
           int ts1,ts2,ts3;
           cout<<"Enter the lenght of side First "<<endl;
           cin>>ts1;
           cout<<"Enter the lenght of side Second "<<endl;
           cin>>ts2;
           cout<<"Enter the lenght of side Third "<<endl;
           cin>>ts3;
           
           if(s==3)
            {
            cout<<"You have entered "<<s<<" sides and its lenght is "<<ts1<<","<<ts2<<","<<ts3<<endl;
            cout<<"This is a Triangle and its has 3 sides"<<endl;
            
            area1=(ts1+ts2+ts3)/2;
            cout<<"The Area of Triangle is "<<area1<<endl;
            } 
        }
    }
};
class square : public shapes
{

    public :
    int area2;

    void sidesofsquare()
    {
        if(s==4)
        {
           int ts1,ts2,ts3,ts4;
           cout<<"Enter the lenght of side First "<<endl;
           cin>>ts1;
           cout<<"Enter the lenght of side Second "<<endl;
           cin>>ts2;
           cout<<"Enter the lenght of side Third "<<endl;
           cin>>ts3;
           cout<<"Enter the lenght of side Fourth "<<endl;
           cin>>ts4;
           
           if(s==4)
            {
            cout<<"You have entered "<<s<<"sides and its lenght is "<<ts1<<","<<ts2<<","<<ts3<<","<<ts4<<endl;
            cout<<"This is a Square and its has 4 sides "<<endl;
            
            area2=ts1*ts2*ts3*ts4;
            cout<<"The Area of Square is "<<area2<<endl;
            } 
        } 
    }
};
int main()
{ 
    shapes sh;
    sh.No_side(); 
    triangle tri;
    square sq;
    if(s==3)
    {
        tri.sidesoftriangle();
    }
    else if(s==4)
    {
        sq.sidesofsquare();
    }
    else 
    {
        cout<<"Invalid Input please enter The Valid Number "<<endl;
    }
    getch();
}