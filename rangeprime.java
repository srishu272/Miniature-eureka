 import java.io.*;
class rangeprime
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader (isr);

        int i,flag,j,n;
        for(j=100;j<=400;j++)
        {
            n=j;
            flag=0;
            for(i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("PRIME NUMBER="+j);
            }
        }
    }
}

