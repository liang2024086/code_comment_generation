package methodEmbedding.Magic_Trick.S.LYD1711;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		PrintWriter out=new PrintWriter(new File("out.txt"));
		int T=sc.nextInt();
		
		for(int t=0;t<T;t++){
			int row1=sc.nextInt();
			Map map=new HashMap();
			//iterate over the next four rows and get the row1 in a hashmap.
			for (int i=0;i<16;i++){
				if(i/4 ==row1-1)
					map.put(sc.nextInt(), "");
				else
					sc.nextInt();
			}
			
			//Now iterate the next four rows and get the row2 in a array
			
			int row2=sc.nextInt();
			int[] array=new int[4];
			
			for (int i=0;i<16;i++){
				if(i/4 ==row2-1)
					array[i%4]=sc.nextInt();
				else
					sc.nextInt();
			}
			
			//iterate over the array and find matches
			int match_cnt=0;
			int number=0;
			for (int i = 0; i < 4; i++) {
				if(map.containsKey(array[i])){
						match_cnt++;
						number=array[i];
				}
			}
			
			if(match_cnt==1)
				out.println("Case #"+(t+1)+": "+number);
			else if(match_cnt>1)
				out.println("Case #"+(t+1)+": "+"Bad magician!");
			else
				out.println("Case #"+(t+1)+": "+"Volunteer cheated!");
			
			out.flush();
			
		}

	}

}
