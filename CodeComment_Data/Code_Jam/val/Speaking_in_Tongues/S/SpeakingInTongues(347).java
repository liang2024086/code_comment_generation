package methodEmbedding.Speaking_in_Tongues.S.LYD847;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class SpeakingInTongues {

	int C; 
	int N;
	int T;
	ArrayList<Integer> O = new ArrayList<Integer>();
	ArrayList<Integer> B =  new ArrayList<Integer>();
	Object[][] seq;

	char[] english =  new char[27];
	char[] googlerese =  new char[27];
	char[] googlerese2 =  new char[27];

	public static void main(String[] args) {

		SpeakingInTongues b = new SpeakingInTongues();

		int k=97;
		for(int i=1;i<=26;i++) 
			b.english[i] = (char)(k++);


		try {
			FileReader r=new FileReader("mapping.conf");
			FileReader r2=new FileReader("input1.txt");
			FileWriter w=new FileWriter("output1.txt");

			BufferedReader br = new BufferedReader(r);
			BufferedReader br2 = new BufferedReader(r2);
			BufferedWriter bw = new BufferedWriter(w);

			char[] inputChar1 = br.readLine().toCharArray();
			char[] inputChar2 = br.readLine().toCharArray();

			char[] english2 =  new char[27];

			for(int i=0;i<inputChar1.length;i++){
				char char1 = inputChar1[i];
				char char2 = inputChar2[i];

				if(b.googlerese[(int)char1 - 96] == '\u0000') {
					b.googlerese[(int)char1 - 96] = char2;
					english2[(int)char1 - 96]='a';
				}

			}

			b.googlerese[(int)'q' - 96] = 'z';
			b.googlerese[(int)'z' - 96] = 'q';

			/*for(int i=1;i<b.googlerese.length;i++) {
				System.out.println((char)(i+96)+ " " + b.googlerese[i]);
			}
			 */


			b.T =  Integer.parseInt(br2.readLine());

			for(int i=0;i<b.T;i++) {

				char[] input = br2.readLine().toCharArray();
				char[] output = new char[input.length];
				for(int j=0;j<input.length;j++){
					if(input[j] != ' ') {
						output[j] = b.googlerese[(int)input[j] - 96];
					} else
						output[j] = ' ';

				}

				String toWrite = "Case " + "#" + (i+1) + ": ";
				bw.write(toWrite);
				bw.write(output);
				bw.newLine();
				bw.flush();


			}
			br.close();
			br2.close();
			bw.close();
		}catch(Exception e){  
			e.printStackTrace();
		}
	}

}
