import java.util.Scanner;
public class Function 
{
        // public static int a=0;
        // public static int b=0;
   
private static int b;
private static int a;
static void get_input()
{
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the value of a : ");
        final int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        final int b = sc.nextInt();
        sc.close();
}
static int add(int x, int y)
{
        int c; 
        c=x+y;
       // System.out.println("The Addition is : "+c);
        return c;
}
public static void main(String [] args)
        { 
                get_input();
                System.out.println("The Addition is : "+add(a,b));
        }  
}