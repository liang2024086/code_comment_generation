package methodEmbedding.Counting_Sheep.S.LYD835;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Boolean is[] = new Boolean[10];
	    
	    Scanner ip = new Scanner(System.in);
		String str = ip.nextLine();
		int cases = Integer.parseInt(str);
		
		if(cases<1 || cases>100)
		    System.exit(0);
		
		String seq[] = new String[cases];
		int num[] = new int[cases];
		int count[] = new int[cases];
		
		for(int i=0;i<cases;i++){
		    seq[i] = ip.nextLine();
		    num[i] = Integer.parseInt(seq[i]);
		    if(num[i]<0 || num[i]>200)
		        System.exit(0);
		}
		int temp=0,x=0,n=1;
		for(int i=0;i<cases;i++){
		    for(int k=0;k<10;k++)
		        is[k] = false;
	        count[i] = 0;
	        temp = num[i];
	        System.out.print("Case #"+(i+1)+": ");
            if(num[i] != 0){
	            n=1;
	            while(Arrays.asList(is).contains(false)){
	                temp = num[i]*n;
	                while(temp!=0){
	                    x = temp%10;
	                    is[x] = true;
	                    temp = temp / 10;
	                }
	                n = n + 1;
	            }
	            System.out.println(num[i]*(n-1));
	        }
	        else{
	            System.out.println("INSOMNIA");
	        }
		}
    }
}
