package methodEmbedding.Counting_Sheep.S.LYD1439;


import java.io.*;
import java.util.*;

class CountingSheep{
	public static void main(String args[])throws Exception{
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		int count=Integer.parseInt(buff.readLine());
		
		int t=0;
		while(t++<count){
			int num=Integer.parseInt(buff.readLine());
			if(num==0){
				System.out.println("Case #"+t+": "+"INSOMNIA");
				continue;
			}
			boolean[] arr1=new boolean[10];
			
			
			
			
			int c=2;
			boolean check=true;
			int temp=num;
			//char[] arr={'0','1','2','3','4','5','6','7','8','9'};
		while(true){
			
			if(temp>1000000009 || temp<0){
				break;
			}
			int temp1=temp;
			while(temp>0){
				int rem=temp%10;
				arr1[rem]=true;
				temp=temp/10;
				
				
				
			}	
				boolean flag=true;
			for(int i=0;i<10;i++){
				if(!arr1[i]){
					flag=false;
				}
			}
				
				if(flag){
					System.out.println("Case #"+t+": "+temp1);
					check=false;
					break;	
				}
				temp=num*c;
				//System.out.println("num"+num);
				c++;
				
		}
				
			
			if(check){
				System.out.println("Case #"+t+": "+"INSOMNIA");
			}
		}
	}
}
		
