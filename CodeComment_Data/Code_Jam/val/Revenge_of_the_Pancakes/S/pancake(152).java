package methodEmbedding.Revenge_of_the_Pancakes.S.LYD479;

import java.io.*;

public class pancake{
	public static void main(String[]args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("pancake.in"));
		PrintWriter out = new PrintWriter(new FileWriter("pancake.out"));
		int t = Integer.parseInt(in.readLine());
		for(int i = 1;i<=t;i++){
			String s = in.readLine();
			int[] arr = new int[s.length() + 1];
			for(int j = 0;j<s.length();j++){
				if(s.charAt(j) == '+'){
					arr[j] = 1;
				} else {
					arr[j] = 0;
				}
			}
			arr[arr.length - 1] = 1;
			int count = 0;
			for(int j = 1;j<arr.length;j++){
				if(arr[j] != arr[j-1]){
					count++;
				}
			}
			out.println("Case #" + i + ": " + count);
		}
		out.close();
	}
}
