package methodEmbedding.Speaking_in_Tongues.S.LYD697;

import java.io.*;

class Main{
	public static void main(String[] ar) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\A-small-attempt3.in"));
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\User\\Desktop\\outputA3.out")); 
		int k = Integer.parseInt(br.readLine());
		String[] w= new String[26];
		w[0] = "y"; w[1] = "h"; w[2] = "e";w[3] = "s"; w[4] = "o"; w[5] = "c"; w[6] = "v"; w[7] = "x"; w[8] = "d"; w[9] = "u";
		w[10] = "i"; w[11]="g"; w[12] = "l"; w[13]="b"; w[14] = "k"; w[15] = "r"; w[16] = "z"; w[17]="t"; w[18] = "n"; w[19] = "w";
		w[20] = "j"; w[21] = "p"; w[22] = "f"; w[23] = "m"; w[24] = "a"; w[25] = "q";
		for (int i=0; i<k; i++){
			String ks = br.readLine();
			String res = "Case #"+(i+1)+": ";
			for (int j=0; j<ks.length(); j++){
				char m = ks.charAt(j);
				if (m==' '){
					res+= " ";
				} else {
					res+= ""+w[m-'a'];
				}
			}
			out.println(res);	
		}
		out.close();
	}
}	


