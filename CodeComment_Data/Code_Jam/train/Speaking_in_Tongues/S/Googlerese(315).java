package methodEmbedding.Speaking_in_Tongues.S.LYD863;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;


public class Googlerese {

	/**
	 * @param args
	 * @throws Exception 
	 */
	static char[] alpha =  {'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q'};
	static ArrayList<Character> alphList =  new ArrayList<Character>();
	static{
		for(char a : alpha){
			alphList.add(a);
		}
	}
	static char[] gAlpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(new File(args[0]));
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(new File("C:\\Users\\subhar\\Desktop\\DropBox\\Output.txt"));
		BufferedWriter bw = new BufferedWriter(fw);
		int testCases = Integer.parseInt(br.readLine());
		for(int i =1;i<testCases+1;i++){
			bw.write("Case #"+i+": ");
			StringCharacterIterator iter = new StringCharacterIterator(br.readLine());
			for(char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
				if(alphList.indexOf(c)!=-1){
					bw.write(gAlpha[alphList.indexOf(c)]);
				}else{
					bw.write(c);
				}
		    }
			if(i<testCases)bw.write("\r\n");

		}
		bw.flush();
		bw.close();

	}

}
