import java.util.Scanner;
class A 
{
        public static int Add(int x, int y)
        {
                int z=x+y;
                return z;
        }
        
}
class S extends A
{
        public static int Sub(int c, int d)
        {
                int e=c-d;
                return e;
        }
};
class M extends S
{
        public static int Mul(int m, int n)
        {
                int l=m*n;
                return l;
        }
};
class D extends M
{
        public static float Div(float p, float q)
        {
                float r=p/q;
                return r;
        }
};
class Function extends D
{
        public static void main(String[] args)
        {
                int a=0;
                int b=0;
                int sum=0,sub=0,mul=0;
                float div=0;

                Scanner sc = new Scanner(System.in);
        
                System.out.println("Enter the value of a : ");
                a = sc.nextInt();
                System.out.println("Enter the value of b : ");
                b = sc.nextInt();
                sc.close();

                sum = Add(a,b);
                sub = Sub(a,b);
                mul = Mul(a,b);
                div = Div(a,b);
                
                System.out.println("The Addition is : "+sum);
                System.out.println("The Subtraction is : "+sub);
                System.out.println("The Multiplication is : "+mul);
                System.out.println("The Division is : "+div);
        }
}
