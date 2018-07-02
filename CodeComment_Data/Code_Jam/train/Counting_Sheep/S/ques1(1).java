package methodEmbedding.Counting_Sheep.S.LYD686;

import java.io.*;
import java.util.*;

class ques1{
	public static void main(String[] args) throws Exception{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(in.readLine());
		for(int i=0;i<T;i++){
			int N=Integer.parseInt(in.readLine());
			System.out.print("Case #"+(i+1)+": ");
			HashMap<Integer,String> hm=new HashMap<Integer,String>();
			Set<Integer> S=new HashSet<Integer>();
			hm.put(N,null);
			char[] input=String.valueOf(N).toCharArray();
			for(int j=0;j<input.length;j++){
				S.add((int)input[j]-'0');
				}
			boolean loop=true;
			if(S.size()==10){
				System.out.println(N);
				loop=false;
				}
			int temp=0;
			for(int j=2;loop;j++){
				temp=j*N;
				if(hm.containsKey(temp)){
					System.out.println("INSOMNIA");loop=false;}
				else{
					hm.put(temp,null);
					input=String.valueOf(temp).toCharArray();
					for(int k=0;k<input.length;k++){
						S.add((int)input[k]-'0');
					}
				if(S.size()==10){System.out.println(temp);
					loop=false;
					}
				}
			}
		}
	}
}
					
				
				
