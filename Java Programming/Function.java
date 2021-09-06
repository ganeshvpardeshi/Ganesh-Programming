import java.util.Scanner;
public class Function 
{
        
         // public static int a=0;
        // public static int b=0;
   
        public static int b;
        public static int a;
        public static int c;
        void get_input()
        {
                Scanner sc = new Scanner (System.in);
        
                System.out.println("Enter the value of a : ");
                final int a = sc.nextInt();
                System.out.println("Enter the value of b : ");
                final int b = sc.nextInt();
                sc.close();
        }
        void add(int x, int y)
        {
                c=x+y;
                // System.out.println("The Addition is : "+c);
        }
};
class function extends Function
{
        public static void main(String[] args)
        {
                Function f= new Function();
                f.get_input();
                f.add(a, b);
        }
}