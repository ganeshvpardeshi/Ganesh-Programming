import java.util.Scanner;
class Switch_case 
{
    public static void main(String []args)
        {
        
            Scanner sc  = new Scanner(System.in);
            
            System.out.println("enter the value of a");
            int a = sc.nextInt(); 
            sc.close();
            int ch=a;

            switch(ch)
                {
                        case 1:
                            {
                                System.out.println("This is Case 1");
                                break;
                            }
                        case 2:
                            {
                                System.out.println("This is Case 2");
                                break;
                            }
                        case 3:
                            {
                                System.out.println("This is Case 3");
                                break;
                            }
                        default :
                            {
                                System.out.println("This Default");
                            }
                }
        }
}