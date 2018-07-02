package methodEmbedding.Counting_Sheep.S.LYD1576;


import java.util.Scanner;

public class countingSheep {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       long T = sc.nextInt();
	       for(int i=0;i<T;i++)
	       {
	         int temp =0;long x=1,count=0,last=0;String result="";
	         int[] digit = new int[10];
	         long N = sc.nextLong();
	         //System.out.println("N is "+N);
	         if(N==0)
	         {
	            result = "INSOMNIA";   
	         }
	         else
	         {
	            while(count<10)
	            {
	                last = x*N;
	                result = Long.toString(last);
	                while(last>0)
	                {
	                    temp = (int) (last%10);
	                   // System.out.println("temp is "+temp);
	                    last  = last/10;
	                    if(digit[temp]==0)
	                    {
	                        digit[temp] = temp+1;
	                        count++;
	                    }
	                }
	                x++;
	            }
	         }
	           System.out.println("Case #"+(i+1)+": "+result); 
	       }
	   }

}
