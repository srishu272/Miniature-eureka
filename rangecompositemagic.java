import java.io.*;
class rangecompositemagic
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader (isr);
      

        int i,flag,j,n,temp;
        for(j=10;j<=100;j++)
        {
            n=j;
            temp=j;
            flag=0;
            for(i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    flag=1;
                    //break;
                }
            }
            if(flag==1)
            {
                int rem,sum=0;
                while(temp>9)
                {
                    sum=0;
                    while(temp>0)
                    {
                        rem=temp%10;
                        sum=sum+rem;
                        temp=temp/10;
                    }
                    temp=sum;
                }
                if(sum==1)
                {
                    System.out.println("COMPOSITE MAGIC NUMBER="+j);
                }
            }
        }
    }

}
