package methodEmbedding.Counting_Sheep.S.LYD149;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
    int T, N;
Scanner sc= new Scanner(System.in);
    T=sc.nextInt();
   for(int i=0;i<T;i++)
    {
        N=sc.nextInt();
        int K=N;
        String str=N+"";
        if(N==0)
        {
           System.out.println("Case #"+(i+1)+": INSOMNIA");
           continue;
        }
        while(true)
        {
            if(str.contains("0") && str.contains("1") && str.contains("2") && str.contains("3") &&str.contains("4")
            && str.contains("5") &&str.contains("6")       &&str.contains("7") && str.contains("8") &&str.contains("9"))
             {
                        System.out.println("Case #"+(i+1)+": "+N);
                        break;
              }
             else
             {
                     N+=K;
                     str+=N;
              } 
        }
	}
}
}
