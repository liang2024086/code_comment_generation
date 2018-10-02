package methodEmbedding.Speaking_in_Tongues.S.LYD20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class SpeakingInToungues {
	
	public static void main(String[] args) {
		char[] map = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		File file  = new File("C:\\Users\\aadi\\Desktop\\SpeakingToungues\\A-small-attempt0.in");
			try {
				Scanner scanner = new Scanner(file);
				int numOfCases = Integer.parseInt(scanner.nextLine());
				try{
				FileWriter fstream = new FileWriter("C:\\Users\\aadi\\Desktop\\SpeakingToungues\\out.txt");
				BufferedWriter out = new BufferedWriter(fstream);
				
				for(int i = 0; i< numOfCases ; i++){
					StringBuilder s = new StringBuilder();
					String line = scanner.nextLine();
					char[] ch = line.toCharArray();
					for(char c : ch){
						if(c==' '){
							s.append(' ');
							continue;
						}
						int ascii = (int) (c-'a');
						char ch1 = map[ascii];
						s.append(ch1);
						//out.write(ch1);
					}
					System.out.println(s);
					out.write("Case #"+(i+1)+": ");
					out.write(s.toString());
					out.write(System.getProperty("line.separator"));
				}
				 out.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
		}
		
	}

}
