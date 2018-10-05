package methodEmbedding.Counting_Sheep.S.LYD577;

import java.io.*;
import java.util.*;

class sleep{
	public static void main(String[] args) throws Exception{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(in.readLine());
		for(int i=0;i<T;i++){
			int N=Integer.parseInt(in.readLine());
			System.out.print("Case #"+(i+1)+": ");
			Set<Integer> S=new HashSet<Integer>();
			HashMap<Integer,String> hmap=new HashMap<Integer,String>();
			hmap.put(N,null);
			char[] a=String.valueOf(N).toCharArray();
			for(int j=0;j<a.length;j++){
				S.add((int)a[j]-'0');
				}
			boolean Notover=true;
			if(S.size()==10){
				System.out.println(N);
				Notover=false;
				}
			int temp=0;
			for(int j=2;Notover;j++){
				temp=j*N;
				if(hmap.containsKey(temp)){
					System.out.println("INSOMNIA");Notover=false;}
				else{
					hmap.put(temp,null);
					a=String.valueOf(temp).toCharArray();
					for(int k=0;k<a.length;k++){
						S.add((int)a[k]-'0');
					}
				if(S.size()==10){System.out.println(temp);
					Notover=false;
					}
				}
			}
		}
	}
}
					
				
				
