package methodEmbedding.Speaking_in_Tongues.S.LYD573;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class GooglereseDecoder {
	static char[] dt= {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
	
	public static void main(String[] args){
		File in = new File(args[0]);
		File out = new File("a.out");
		FileOutputStream w = null;
		Scanner s = null;
		try{
			w = new FileOutputStream(out);
			s = new Scanner(in);
		} catch (FileNotFoundException e) {}
		int n = s.nextInt();
		s.nextLine();
		for (int i = 1; i <= n; i++){
			String line = s.nextLine();
			try {
				w.write(("Case #"+ i +": ").getBytes());
				for(int j = 0; j < line.length(); j++){
					if(line.charAt(j) != ' '){
						w.write(dt[line.charAt(j) - 'a']);
					}
					else
						w.write(' ');
				}
				w.write("\r\n".getBytes());
			} catch (IOException e) {
			}
			
		}
		try {
			w.close();
			s.close();
		} catch (IOException e) {}
		
	}

}
