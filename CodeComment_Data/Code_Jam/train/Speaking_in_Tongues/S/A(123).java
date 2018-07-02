package methodEmbedding.Speaking_in_Tongues.S.LYD690;

import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class A {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("C:/Users/Farnoosh/Desktop/A-small.in"));
		FileWriter fw = new FileWriter("C:/Users/Farnoosh/Desktop/A-small.out");
		 
		char[][] goo = {{'a','y'},{'b','h'},{'c','e'},{'d','s'},
				{'e','o'},{'f','c'},{'g','v'},{'h','x'},{'i','d'},{'j','u'},{'k','i'},{'l','g'},
				{'m','l'},{'n','b'},{'o','k'},{'p','r'},{'q','z'},{'r','t'},{'s','n'},{'t','w'},{'u','j'},
				{'v','p'},{'w','f'},{'x','m'},{'y','a'},{'z','q'},{' ', ' '}};
		
		int N = new Integer(in.readLine());
		for (int cases = 1; cases <= N; cases++) {
			char[] a = in.readLine().toCharArray();
			
			
			String out = "";
			
			for (int i = 0; i <= a.length-1; i++){ 
				for(int j = 0; j < 27; j++)
					if (a[i] == goo[j][0]){
						a[i] = goo[j][1];
						break;
					}
					
			}
			
		for(int i = 0 ; i <= a.length-1 ; i ++){
			out += a[i];
		}	
				
			fw.write ("Case #" + cases + ": " + out + "\n");	
		}
		fw.flush();
		fw.close();
	}

}
