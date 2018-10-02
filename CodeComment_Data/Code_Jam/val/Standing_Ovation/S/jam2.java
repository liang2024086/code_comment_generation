package methodEmbedding.Standing_Ovation.S.LYD501;

import java.util.*;
import java.io.*;
//writer.print("Case #"+(i+1)+": ");
//writer.close();
class jam2{
	public static void main(String [] abb){
		try{
			Scanner in = new Scanner(new File("safia.in"));
			PrintWriter writer = new PrintWriter("out2.in", "UTF-8");
			
			int testcase = in.nextInt();
			for(int p=0;p<testcase;p++){
				int n = in.nextInt();
				String inp = in.next();
				int output=0;
				int count=(int)inp.charAt(0)-48;
				
				for(int i=1;i<=n;i++){
					if(count<i){
						if((int)inp.charAt(i)-48>0){
							output=output+(i-count);
							count=count+(i-count);
						}
					}
					count=count+(int)inp.charAt(i)-48;
				}
					writer.println("Case #"+(p+1)+": "+output);
			//Integer.parseInt();
			}
			
			
			
			
			writer.close();
		}catch(IOException e){
			
			}
	}
}
