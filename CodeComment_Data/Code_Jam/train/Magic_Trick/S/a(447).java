package methodEmbedding.Magic_Trick.S.LYD549;

import java.io.*;
import java.math.*;
class Main{
	public static void main(String[] args)throws Exception{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String t_str=br.readLine();
		int t=Integer.valueOf(t_str);
		for(int i=1;i<=t;i++){
			int x=0;
			int y=0;
			int[] cards=new int[16];
			for(int j=0;j<16;j++)cards[j]=0;
			for(int j=0;j<2;j++){
				String r_str=br.readLine();
				int r=Integer.valueOf(r_str);
				for(int k=1;k<=4;k++){
					String line=br.readLine();
					if(k==r){
						String[] row_strs=line.split(" ");
						for(int l=0;l<4;l++){
							int a=Integer.valueOf(row_strs[l]);
							a--;
							if(j==0){cards[a]++;}else{
								if(cards[a]==1){
									x++;
									y=a+1;
								}
							}
						}
					}
				}
			}
			System.out.printf("Case #%d: ",i);
			switch(x){
				case 0: System.out.println("Volunteer cheated!"); break;
				case 1: System.out.println(y); break;
				default : System.out.println("Bad magician!"); break;
			}
		}
	}
}
