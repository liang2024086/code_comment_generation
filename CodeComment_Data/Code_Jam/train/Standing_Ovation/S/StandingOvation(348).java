package methodEmbedding.Standing_Ovation.S.LYD1563;

import java.io.*;
import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class StandingOvation {
	public static void main (String[] args) throws IOException{
		Scanner yolo = new Scanner(new File("A-small-attempt0 (1).in"));
		int loop = yolo.nextInt();
		for(int l = 0; l<loop; l++){
			int times = yolo.nextInt();
			String line = yolo.nextLine().replaceAll(" " , "");
			int total = 0;
			int cur = 0;
			for(int i = 0; i<line.length(); i++){
				if(i>cur){
					total+=i-cur;
					cur+=i-cur;
				}
				cur+=Integer.parseInt(""+line.charAt(i));
			}
			out.println("Case #"+(l+1)+": " +total);
		}
	}
}
