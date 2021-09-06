class Logical {

    public static void main(String []args)
        {
           int a=10,c=10;
        var b=20;
//&& (AND) opeator
            System.out.println("\nAND operator operation are Following :-");
            if((a<b)&&(a<c))
                {
                    System.out.println("The value of a is "+a);
                }
            else if((b>a)&&(b>c))
                {
                    System.out.println("The value of b is "+b);
                }
            else 
                {
                    System.out.println("The value of c is "+c);
                }
// || (OR) opeartor
                System.out.println("\nOR operator operation are Following :-");
                if((a>b)||(b>a))
                    {
                        System.out.println("The a is greater ");
                    }
                if((b>c)||(c>b))
                    {
                        System.out.println("The b is greater ");
                    }
                else
                    {
                        System.out.println("The c is greater ");
                    }

        }
}