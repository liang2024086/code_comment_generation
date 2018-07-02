package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1184;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class RevengeofthePancakes{

	public static String filename;
	public static FileReader FR;
	public static BufferedReader BR;
	public static int num_of_testcase;

	public static void main(String[] args){
		filename = "B-small-attempt0.in";
		try {
			FR = new FileReader(filename); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BR = new BufferedReader(FR);
		try{
			num_of_testcase = Integer.parseInt(BR.readLine());
			for(int i=1; i<=num_of_testcase; i++){
				char[] pancakes = BR.readLine().toCharArray();
				int count =0;
				char blank_side = '-';
				if(pancakes[pancakes.length-1]==blank_side){
					count=1;
				}
				for(int j=1; j<pancakes.length;j++){
					if(pancakes[j-1]!=pancakes[j]){
						count++;
					}
				}
				System.out.println("Case #"+i+": "+count);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
