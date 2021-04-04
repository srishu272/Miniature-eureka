import java.io.*;
class rangeperfect
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader (isr);
        int i,j,n,sum;
        for(j=1;j<1000;j++)
        {
            n=j;
            sum=0;
            for(i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    sum=sum+i;
                }
            }
            if(n==sum)
            {
                System.out.println("Perfect number="+i);
            }
        }
    }
}
