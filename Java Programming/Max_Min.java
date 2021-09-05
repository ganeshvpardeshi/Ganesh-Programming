class Max_Min 
{
        int max(int x,int y)
            {
                int result=0;
                if(x>y)
                    {
                        result=x;
                        System.out.println("x is Greater than y\nValue is"+result);
                    }
                else if(y>x)
                    {
                        result=y;
                        System.out.println("y is Greater than x\nValue is "+result);
                    }
                else
                    {
                        System.out.println("Both x and y are Equal\nValue is "+result);
                    }
                return result;
            }    

        public static void main(String [] args)
            {
                int a=0,b=10;
                Max_Min m = new Max_Min();
                m.max(a,b);
            }
}