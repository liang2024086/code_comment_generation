package methodEmbedding.Speaking_in_Tongues.S.LYD255;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class TestA {
	private final static String DAT_PATH = "/Users/ttsurumi/Downloads/";

//	private final static String dat = "A-sample-practice.in";
//	private final static String dat = "A-small-practice.in";
	private final static String dat = "A-small-attempt0.in";

	public static String datPath = DAT_PATH + dat;
	public static String ansPath = DAT_PATH + dat + ".ans";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new FileReader(datPath));
			BufferedWriter bw = new BufferedWriter(new FileWriter(ansPath));
            String[] movCounts = br.readLine().split(" ");
            String tmp_str;
            int count = 1;
            char[] map = new char[26];
            map[0] = 'y';
            map[1] = 'h';
            map[2] = 'e';
            map[3] = 's';
            map[4] = 'o';
            map[5] = 'c';
            map[6] = 'v';
            map[7] = 'x';
            map[8] = 'd';
            map[9] = 'u';
            map[10] = 'i';
            map[11] = 'g';
            map[12] = 'l';
            map[13] = 'b';
            map[14] = 'k';
            map[15] = 'r';
            map[16] = 'z';
            map[17] = 't';
            map[18] = 'n';
            map[19] = 'w';
            map[20] = 'j';
            map[21] = 'p';
            map[22] = 'f';
            map[23] = 'm';
            map[24] = 'a';
            map[25] = 'q';           
            while((tmp_str = br.readLine()) != null){
            	bw.write("Case #" + count + ": " );
            	for(int i = 0; i < tmp_str.length(); i++){
            		char ch = tmp_str.charAt(i);
            		if(ch == ' '){
            			bw.write(' ');
            		}else{
//            		System.out.println(ch);
            			bw.write(map[ch-'a']);
            		}
            	}
            	bw.newLine();
            	count++;
            }
            bw.flush();
		}catch(IOException e){
			System.err.println(e);
		}
	}

}
