package methodEmbedding.Speaking_in_Tongues.S.LYD1078;

import java.io.*;
import java.util.Scanner;
import java.lang.StringBuilder;


public class A{


	public static void main(String[] args){
		//get the char value of 'a', use that to index into the letters array when replacing characters
		try{
			char[] letters = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
			//char[] letters = {'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','g','p','d','r','j','g','t','h','a','q'};
			BufferedReader reader = new BufferedReader(new FileReader(new File("A-small-attempt0.in")));
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("A.out")));
			String line1 = reader.readLine();
			//System.out.println(line1);
			int lines = Integer.parseInt(line1);
			for(int i = 0; i < lines; i++){
				String line = reader.readLine();
				StringBuilder br = new StringBuilder("Case #" + (i+1) + ": ");
				//System.out.println("Hi?");
				for(int j = 0; j < line.length(); j++){
					if(line.substring(j, j+1).equals(" ")) br.append(" ");
					else{
						char c = line.charAt(j);
						int index = (int) (c - 'a');
						//System.out.println(index + " " + c + " " + letters[index]);
						br.append(letters[index]);
					}
				}
				//System.out.println("O Hai!");
				writer.write(br.toString() + "\n");
					
			}
			writer.close();
		}catch(Exception e){e.printStackTrace();}	


	}


}
