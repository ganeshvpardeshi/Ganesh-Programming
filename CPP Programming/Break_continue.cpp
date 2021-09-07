#include<iostream>
#include<stdlib.h>
#include<conio.h>
using namespace std;
int main()
{
    int i=0,j=0,n=20;
//break and continue using while loop
    while(i<=n)
        {
            if(i==10)
            {
                i++;
                continue;
            }
            if(i==15)
            {
                i++;
                break;
            }
            cout<<"The Number printing using while loop "<<i<<endl;
            i++;
        }

cout<<"\n\n\n"<<endl;
// break and continue using do_while loop
        do
        {
            if(j==12)
            {
                j++;
                continue;
            }
            if(j==17)
            {
                j++;
                break;
            }
            cout<<"The number printing using do_while "<<j<<endl;
            j++;
        } while(j<=n);

//break and continue using for loop
        for(int i=0;i<10;i++)
            {
                if(i==0)
                    {
                        continue;
                        i++;
                    }
                if(i==8)
                    {
                        break;
                        i++;
                    }
                cout<<"the value using for loop is "<<i<<endl;
            }
      
    getch();      
        
}