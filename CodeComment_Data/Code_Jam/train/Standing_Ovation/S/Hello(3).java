package methodEmbedding.Standing_Ovation.S.LYD316;

/**
 * Class Hello:
 *
 * Hello-world program to demonstrate BlueJ.
 */import java.io.*;
class Hello
{
        public static void main(String[] args)throws IOException
       {// BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       String sCurrentLine; 
        BufferedReader in=new BufferedReader(new FileReader("I:\\BlueJ\\examples\\hello\\A-small-attempt4.in"));     
       PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
       System.setOut(out);
       int test=Integer.parseInt(in.readLine());
       int i;String a[]=new String [test];
       int num=0;String remainn="";int people=0,count=0,finall=0,b=0;int finalarr[]=new int[test];
       for(i=0;i<test;i++)
       {
           a[i]=in.readLine();
           int l=a[i].length();
           for(int j=0;j<l;j++)
           {
           char c=a[i].charAt(j);
           if(c!=' ')
           {
               num=(num*10)+Integer.parseInt(c+"");
            }
            else
            {
                remainn=a[i].substring(j+1,l);
                break;
            }
        }
        int len=remainn.length();
        if(len!=num+1)
        System.exit(0);
        if(remainn.charAt(len-1)=='0')
        System.exit(0);
        int remain[]=new int[len];
        for(int x=0;x<len;x++)
        remain[x]=Integer.parseInt(remainn.charAt(x)+"");
        people=remain[0];
        for(int k=1;k<len;k++)
        {
            if(remain[k]!=0)
            {
            if(people>=k)
            {
                people=people+remain[k];
            }
            else
            {
                count=k-people;
                people=people+count+remain[k];
                finall+=count;
            }
        }
     }
    
        //System.out.println(remain);
        finalarr[b]=finall;
        b++;
        count=0;
        people=0;
        finall=0;
        num=0;
           
    }
    for(int z=0;z<b;z++)
    {
     System.out.println("Case #"+(z+1)+": "+finalarr[z]);
    }
   // b=0;
}
}
