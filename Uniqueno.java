import java.io.*;
class Uniqueno
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        
        System.out.println("ENTER THE NUMBER");
        String s1=br.readLine();
        int n=Integer.parseInt(s1);
        int rem,i,cnt=0,temp,flag=0;
        for(i=0;i<=9;i++)
        {
            temp=n;
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
            System.out.println("UNIQUE NUMBER");
        }
        else
        {
            System.out.println("NOT UNIQUE NUMBER");
        }
    }
}