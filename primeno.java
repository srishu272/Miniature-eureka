import java.io.*;
class primeno
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader (isr);

        System.out.println("ENTER THE NUMBER");
        String s1=br.readLine();
        int n=Integer.parseInt(s1);
        int i,flag=0;
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
            System.out.println("PRIME NUMBER");
        }
        else
        {
            System.out.println("NOT PRIME NUMBER");
        }
    }
}
