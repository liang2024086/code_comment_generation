package methodEmbedding.Revenge_of_the_Pancakes.S.LYD536;



import java.util.*;
import java.io.*;


public class B {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		File file = new File("B-small-attempt0.in.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		Scanner sc = new Scanner(br);
		int t = sc.nextInt();
		for(int i=1; i<= t; i++){
			String st = sc.next();
			int flips = 0;
			char PrevChar = st.charAt(0);
			for(int j=1; j<st.length(); j++){
				char c = st.charAt(j);
				if(c == PrevChar){
					
				} else{
					flips++;
				}
				PrevChar = c;
			}
			if(st.charAt(st.length() - 1) == '-'){
				flips++;
			}
			
			System.out.println("Case #" + i + ": " + flips);
		}
		
		br.close();

		
		
	}


}
