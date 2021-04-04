import java.io.*;
class rangeunique
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        int rem,i,j,cnt,temp,flag;
        for(j=100;j<=150;j++)
        {
            cnt=0;
            flag=0;
            for(i=0;i<=9;i++)
            {
                temp=j;
                cnt=0;
                while(temp>0)
                {
                    rem=temp%10;
                    if(rem==i)
                    {
                        cnt++;
                    }
                    temp=temp/10;
                }
                if(cnt>=2)
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                System.out.println("UNIQUE NUMBER="+j);
            }
        }
    }
}