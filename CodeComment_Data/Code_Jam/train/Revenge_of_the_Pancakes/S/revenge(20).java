package methodEmbedding.Revenge_of_the_Pancakes.S.LYD955;

import java.io.*;
class revenge{
	public static void main(String arg[]) throws IOException{
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(obj.readLine());
		int c=1;
		while(t>0){
			String s=obj.readLine();
			int count=0;
			char a='-';
			if(s.charAt(s.length()-1)=='-'){
				count=1;
				a='+';
			}
			for(int i=s.length()-2;i>=0;i--){
				if(s.charAt(i)==a){
					count++;
					if(a=='+'){
						a='-';
					}else{
						a='+';
					}
				}
			}
			System.out.println("Case #"+c+": "+count);
			c++;
			t--;
		}
	}
}
