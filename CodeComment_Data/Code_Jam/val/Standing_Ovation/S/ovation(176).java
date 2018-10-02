package methodEmbedding.Standing_Ovation.S.LYD557;

import java.io.*;
import java.util.*;
class ovation{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int c=1;c<=t;c++){
			String s=br.readLine();
			String str[]=s.split(" ");
			int l=Integer.parseInt(str[0]);
			String a=str[1];
			char c1=a.charAt(0);
			int ans=Character.getNumericValue(c1);
			int min=0;
			for(int i=1;i<l+1;i++){
				c1= a.charAt(i);
				int p = Character.getNumericValue(c1);
				
				if(ans>=i){
					ans+=p;
				}else{
//					System.out.println(ans+" "+i);
					min+=i-ans;
					ans+=p+i-ans;
				}
			}
			System.out.println("Case #"+c+": "+min);
		}
	}
}
