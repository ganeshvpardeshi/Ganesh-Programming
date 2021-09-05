class Swaping 
{
    public static int a=100;
    public static int b=200;
    
    static int swap(int x,int y)
    {
        int temp;
        temp=x;
        x=y;
        y=temp;

        a=x;
        b=y;

        return temp;
    }
    public static void main(String []args)
        {
            System.out.println("Before Swaping value of a is "+a);
            System.out.println("Before Swaping value of b is "+b);
            
            swap(a,b);

            System.out.println("\nAfter Swaping value of a is "+a);
            System.out.println("After Swaping value of b is "+b);
         
        }
}