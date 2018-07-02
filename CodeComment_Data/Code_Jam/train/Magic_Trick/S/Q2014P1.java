package methodEmbedding.Magic_Trick.S.LYD836;

import java.io.*;
import java.util.*;


public class Q2014P1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String INPUT = "A-small-attempt0.in";
		String OUTPUT = "A-small-attempt0.out";
		File file = new File(INPUT);
		try{
		PrintWriter writer = new PrintWriter(OUTPUT, "UTF-8");
			try{
				Scanner sc = new Scanner(file);
				int test = sc.nextInt();
				int row;
				Integer[][] config;
				ArrayList<Integer> answer1;
				ArrayList<Integer> answer2;
				for (int testCase=1; testCase <= test; testCase++){
					answer1 =  new ArrayList<Integer>();
					answer2 =  new ArrayList<Integer>();
					config = new Integer[5][5];
					row = sc.nextInt();
					for (int i=1; i<=4; i++){
						for (int j=1; j<=4; j++){
							config[i][j] = Integer.valueOf(sc.nextInt());
						}
					}
					for (int j=1; j<=4; j++){
						answer1.add(config[row][j]);
					}
					row = sc.nextInt();
					for (int i=1; i<=4; i++){
						for (int j=1; j<=4; j++){
							config[i][j] = Integer.valueOf(sc.nextInt());
						}
					}
					for (int j=1; j<=4; j++){
						Integer tmp = config[row][j];
						if (answer1.contains(tmp)){
							answer2.add(tmp);
						}
					}
					if (answer2.size()==0){
						writer.println("Case #" + testCase + ": " + "Volunteer cheated!");		
					} else if (answer2.size()==1){
						writer.println("Case #" + testCase + ": " + answer2.get(0));
					} else {
						writer.println("Case #" + testCase + ": " + "Bad magician!");
					}
				
				}	
			}catch (Exception e){
				System.out.println("File not found");
			}
		writer.close();
		}
		catch (Exception e){
			System.out.println("File not found");
		}
	}
}
