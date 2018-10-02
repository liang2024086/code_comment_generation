package methodEmbedding.Speaking_in_Tongues.S.LYD917;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {

	/**
	 * @param args
	 */
	
	public static String str1 = "abcdefghijklmnopqrstuvwxyz";
	public static String str2 = "ynficwlbkuomxsevzpdrjgthaq";
	public static void main(String[] args) throws NumberFormatException, IOException {
		HashMap map = new HashMap();
		
		for (int i = 0 ; i < str1.length() ; i ++){
			map.put(str2.charAt(i), str1.charAt(i));
		}
		File fin = new File("A-small-attempt1.in");
		File fout = new File("A-small-attempt1.out");		
		BufferedReader br = new BufferedReader(new FileReader(fin));
		FileOutputStream fos = new FileOutputStream(fout);
		int c = Integer.parseInt(br.readLine());
		String op = "";
		for (int i = 0 ; i < c ;i ++ ){
			op+="Case #"+ (i+1)+": ";
			String strin = br.readLine();
			String strout = "";
			for (int k = 0 ;k < strin.length() ;k ++){
				if (strin.charAt(k) == ' '){
					strout+=" ";
				}
				else{
					strout+= map.get(strin.charAt(k));
				}
			}
			op+=strout+"\n";
		}
		
		
		fos.write(op.getBytes());
		fos.close();
	}

}
