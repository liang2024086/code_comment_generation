package methodEmbedding.Speaking_in_Tongues.S.LYD1193;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Cipher {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("techyrajeev.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("myoutput.out"));
		int num=Integer.valueOf(br.readLine().trim());
		String key="ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv y e q z";
		String value="our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up a o z q";
		HashMap<String,String> m=new HashMap<String,String>();
		for(int i=0;i<key.length();i++){
			if(key.charAt(i)!=' ')
			m.put(key.charAt(i)+"",value.charAt(i)+"");
		}
		int k=1;
		while(num>0){
			String cipher=br.readLine();
			bw.write("Case #"+k+": ");
			for(int i=0;i<cipher.length();i++){
				if(cipher.charAt(i)==' ')
					bw.write(" ");
				else
					bw.write(m.get(cipher.charAt(i)+""));
			}
			bw.newLine();
			num--;
			k++;
		}
		
		br.close();
		bw.close();
	}

}
