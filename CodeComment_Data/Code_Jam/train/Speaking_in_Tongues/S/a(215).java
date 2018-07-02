package methodEmbedding.Speaking_in_Tongues.S.LYD687;

import java.io.IOException;
import java.util.Scanner;


public class a {
	//static FileWriter fw;
	//static BufferedWriter out;
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//fw = new FileWriter("a-output.txt");
		//out = new BufferedWriter(fw);
		Scanner sc = new Scanner(System.in);
		
		String en = "abcdefghijklmnopqrstuvwxyz";
		String gl = "ynficwlbkuomxsevzpdrjgthaq";
		String res = "";
		
		int n = sc.nextInt();//n cases
		for (int i = 0; i < n+1; i++) {
			//for each case
			String googletext = sc.nextLine();
			res+="Case #"+i+": ";
			for (char mychar : googletext.toCharArray()) {
				if (mychar==' ') {
					res += ' ';
				}else{
					for (int j = 0; j < gl.length(); j++) {
						if (mychar==gl.charAt(j)) {
							res += en.charAt(j);
							break;
						}
					}
				}
			}
		
			res+="\n";
			
		}
		
		System.out.println(res);
	
	}
	
	

}
