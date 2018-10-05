package methodEmbedding.Counting_Sheep.S.LYD592;

import java.io.*;
import java.util.*;
class CountingSheep{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> set = new HashSet<Integer>();
		int t = Integer.parseInt(br.readLine());
		int temp_r, temp_q, temp_n, i=2, count=1,j;
		String value[];
		value = new String[t];
		for(j=0;j<t;j++){
			value[j] = br.readLine();
		}
		for(j=0; j<t; j++){
			set.clear();
			if(Integer.parseInt(value[j]) == 0){
				System.out.println("Case #"+count+": INSOMNIA");
				count++;
			}
			else{
				temp_n = Integer.parseInt(value[j]);
				while(set.size()!=10){
					temp_q = temp_n;
					while(temp_q!=0){
						temp_r = temp_q%10;
						set.add(temp_r);
						temp_q = temp_q/10;
					}
					temp_n = i*(Integer.parseInt(value[j]));
					i++;
				}
			i = i-2;
			System.out.println("Case #"+count+": "+i*Integer.parseInt(value[j]));
			i=2;
			count++;
			}
		}
	}
}
