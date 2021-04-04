import java.io.*;
class perfectno
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader (isr);
        
        System.out.println("ENTER THE NUMBER");
        String s1=br.readLine();
        int n=Integer.parseInt(s1);
        int i,sum=0,temp=n;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
            if(sum==temp)
            {
                System.out.println("Perfect number");
            }
            else
            {
                System.out.println("Not perfect number");
            }
    }
}
