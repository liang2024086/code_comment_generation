package methodEmbedding.Revenge_of_the_Pancakes.S.LYD670;

import java.io.*;
import java.util.*;

class ques2{
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(input.readLine());
		for(int i=0;i<T;i++){
			String N=input.readLine();
			System.out.print("Case #"+(i+1)+": ");
			char[] pancake=N.toCharArray();
			int count=0;
			boolean end=true;
			boolean t=true;
			/*for(int j=0;pancake[j]=='+'&& j<pancake.length;j++){count+=1;}
			if(count==pancake.length){System.out.println(0);end=false;}
			count=0;*/
			
			for(int j=0;j<pancake.length && end && t;j++){
				if(pancake[j]=='+'){
					int temp=j+1;
					while(temp<pancake.length && pancake[temp]=='+'){
						pancake[temp]='-';
						temp++;
					}
				if(temp==pancake.length){
					count+=1;
					if(j==0){
						t=false;
					}
					else{
					end=false;
					}
					break;
					}
				else{
				if(j==0){count+=1;}
				else{
				j=temp-1;
				count+=2;}
				}
			}
		}
				if(end && t){
				System.out.println((count+1));}
				else{
					if(!(t)){System.out.println(0);}
					
				else{
					System.out.println(count);
					}
	}

}
}
}
