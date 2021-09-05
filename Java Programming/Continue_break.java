 class Continue_break 
 {
    public static void main(String [] args)
    {
        int a=0,b=0;
        //continue and break using do_while
        do
        {
            if(a==15)
                {
                    a++;
                    continue;
                }
            if(a==18)
                {
                    a++;
                    break;
                }
                System.out.println("The value of a using do while loop "+a);
                a++;
        }while(a<20);
        System.out.println("\n");
        //continue and break using while loop
        while(b<25)
            {
                if(b==15)
                    {
                        b++;
                        continue;
                    }
                if(b==20)
                    {
                        b++;
                        break;
                    }
                System.out.println("the value of a using while loop "+b);
                b++;
            }
            System.out.println("\n");
            for(int i=0;i<10;i++)
            {
                if(i==0)
                    {
                        i++;
                        continue;
                    }
                if(i==8)
                    {
                        i++;
                        break;
                    }
                System.out.println("the value is display via for loop "+i);
            }
    }
 }