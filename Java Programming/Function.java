import java.util.Scanner ;
public class Function 
{
        
         // public static int a=0;
        // public static int b=0;
   
        public static int a=0;
        public static int b=0;
        void get_input()
        {
                Scanner sc = new Scanner (System.in);
        
                System.out.println("Enter the value of a : ");
                int a = sc.nextInt();
                System.out.println("Enter the value of b : ");
                int b = sc.nextInt();
                sc.close();
        }
        int add(int x, int y, int z)
        {
                z=x+y;
               System.out.println("The Addition is : "+z);
               return z;
        }
};
class Display01 extends Function
{

        public static void main(String[] args)
        {
                int c=0;
                Display01 f= new Display01();
                f.get_input();
                f.add(a, b,c);
                //System.out.println("thee "+c);
        }
}