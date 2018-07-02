package methodEmbedding.Standing_Ovation.S.LYD1241;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StandingOvation{
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		int N = Integer.valueOf(in.readLine());
		File file = new File("result.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		BufferedWriter out = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
		for(int i=0; i<N; i++){
			String line = in.readLine();
			int max = Integer.valueOf(line.split(" ")[0]);
			int[] arr = new int[max+1];
			String str = line.split(" ")[1];
			for(int j=0; j<=max; j++){
				String s = str.substring(j, j+1);
				int num = Integer.parseInt(s);
				arr[j] = num;
			}
			int sum=0;
			int res=0;
			for(int k=0; k<=max; k++){
				System.out.println("k="+k);
				System.out.println("sum="+sum);
				if(k>sum){
					
					res++;
					sum++;
				}
				sum+=arr[k];
				
				
			}
			String content = "Case #"+(i+1)+": "+res+"\n";
			out.write(content);
		}
		in.close();
		out.close();
		/*
		File file = new File("result.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		BufferedWriter out = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
		
		for(int i=0; i<N; i++){
			out.write(in.readLine());
		}
		in.close();
		out.close();
		*/
		
	}
}
