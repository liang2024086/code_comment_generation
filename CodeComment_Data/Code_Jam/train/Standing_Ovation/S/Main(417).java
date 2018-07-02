package methodEmbedding.Standing_Ovation.S.LYD1926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;
 
 
public class Main {
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter file = new PrintWriter("output.txt");
		
		int t = Integer.parseInt(in.readLine());
		for(int i = 0; i < t; ++i){
			int count = 0;
			
			String line [] = in.readLine().split(" ");
			int smax = Integer.parseInt(line[0]);
			int people [] = new int[smax+1];
			
			for(int j = 0; j<smax+1; ++j){
				people[j] += Integer.parseInt(line[1].substring(j,j+1));
			}
			
			for(int j = 1; j <smax+1; ++j){
				while(people[j-1]<j){
					++people[j-1];
					++count;
				}
				people[j]+=people[j-1];
			}
			
			file.println("Case #"+(i+1)+": "+count);
		}
		file.close();
		in.close();
	}
	
}; 
