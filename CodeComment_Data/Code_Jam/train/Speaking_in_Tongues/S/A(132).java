package methodEmbedding.Speaking_in_Tongues.S.LYD1493;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = 0;
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('a','y');
		map.put('b','h');
		map.put('c','e');
		map.put('d','s');
		map.put('e','o');
		map.put('f','c');
		map.put('g','v');
		map.put('h','x');
		map.put('i','d');
		map.put('j','u');
		map.put('k','i');
		map.put('l','g');
		map.put('m','l');
		map.put('n','b');
		map.put('o','k');
		map.put('p','r');
		map.put('q','z');
		map.put('r','t');
		map.put('s','n');
		map.put('t','w');
		map.put('u','j');
		map.put('v','p');
		map.put('w','f');
		map.put('x','m');
		map.put('y','a');
		map.put('z','q');
		
		try{
		
			Scanner sc = new Scanner(new File("D:\\203820\\workspace\\Code Jam\\CodeJam\\src\\A\\A-small-practice.in"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\203820\\workspace\\Code Jam\\CodeJam\\src\\A\\A-small-practice.out"));
			
			t = sc.nextInt();
			
			sc.nextLine();
			
			String [] inputLine = new String[t];
			
			for(int i=0; i< t; i++){
				
				inputLine[i] = sc.nextLine();
				
				char [] charArray = inputLine[i].toCharArray();
				
				for(int j=0; j< charArray.length; j++){	
					
					if(charArray[j] == ' '){
						
						charArray[j] = ' ';
					}else{
					
						charArray[j] = map.get(charArray[j]);
					
					}
				}
				
				inputLine[i] = new String(charArray);
				
				//System.out.println("Case #"+(i+1)+": "+inputLine[i]);
				writer.write("Case #"+(i+1)+": "+inputLine[i]);
				writer.newLine();
				writer.flush();
					
			}
			
			sc.close();
			writer.close();
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
