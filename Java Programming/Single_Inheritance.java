class Single_Inheritance 
{

    void get_values(int a, int b)
    {

        int c=0;
        c=a+b;
        System.out.println("the addition is "+c);

    }
};
class display extends Single_Inheritance
{
    public static void main(String [] args)
    {
        display d = new display();
        d.get_values(10,20);
    }
}
