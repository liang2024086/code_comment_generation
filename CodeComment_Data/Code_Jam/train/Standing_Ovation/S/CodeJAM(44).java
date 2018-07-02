package methodEmbedding.Standing_Ovation.S.LYD1216;

import java.util.*;
import java.io.*;
class CodeJAM
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine()),n,sum,dig;
		String s[],ss;
		for(int i=0;i<t;i++){
		    sum=0;
                    int max=0;
		    s=br.readLine().split(" ");
		    n=Integer.parseInt(s[0]);
		    ss=s[1];
		    for(int j=0;j<=n;j++){
                        if((j-sum)>max){
                            max=j-sum;
                        }
		        dig=ss.charAt(j)-'0';
		        sum=sum+dig;
                        
		    }
                    
		    System.out.println("Case #"+(i+1)+": "+max);
		    
		}
	}
}
