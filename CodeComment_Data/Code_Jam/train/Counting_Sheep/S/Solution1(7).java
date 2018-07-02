package methodEmbedding.Counting_Sheep.S.LYD286;

import java.util.*;
import java.io.*;
public class Solution1{
	public static void main(String args[])throws IOException{
		//Scanner in=new Scanner(System.in);	
		Scanner in=new Scanner(new File("input.in"));	
		PrintWriter out=new PrintWriter("output.out","UTF-8");
		int t=in.nextInt();
		for(int cse=0;cse<t;cse++){
			int n=in.nextInt();
			int upto=n*n,res=-1;
			int cnt=0;
			boolean arr[]=new boolean[10];
				
			for(int i=1;i<=1024;i++){
				int tmp;
				tmp=i*n;
				//System.out.println("Tmp:"+tmp);
				while(tmp!=0){
					int pos=tmp%10;
					if(arr[pos]==false){
						arr[pos]=true;
						cnt++;
					}
				//	System.out.print("D:"+pos);
					if(cnt==10)
						break;
					tmp=tmp/10;
				}
				if(cnt==10){
					res=i*n;
					break;
				}
				//System.out.println(cnt);
			}
			if(res>=0){
				//System.out.println("case #"+(cse+1)+": "+res);
				out.println("case #"+(cse+1)+": "+res);
			}else{
				//System.out.println("case #"+(cse+1)+": INSOMNIA");
				out.println("case #"+(cse+1)+": INSOMNIA");
			}
		}
		out.flush();
		out.close();
		System.out.println("DONE");
	}
}
