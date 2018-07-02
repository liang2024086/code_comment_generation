package methodEmbedding.Counting_Sheep.S.LYD696;

import java.io.*;
class counting_sheep{
	public static void main(String arg[]) throws IOException{
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(obj.readLine());
		int c=0;
		while(t>0){
			int n=Integer.parseInt(obj.readLine());
			int a[]=new int[10];
			c++;
			if(n==0){
				System.out.println("Case #"+c+": INSOMNIA");
			}else{
				int inc=1;
				int n2=n;
		first:  while(true){
					int check=0;
					String num=Integer.toString(n);
					for(int i=0;i<num.length();i++){
						a[num.charAt(i)-48]++;
					}
					for(int i=0;i<10;i++){
						if(a[i]==0){
							check=1;
							break;
						}
					}
					if(check==0){
						break first;
					}else{
						inc++;
						n=n2*inc;
					}
				}
				System.out.println("Case #"+c+": "+n);
			}
			t--;
		}
	}
}
