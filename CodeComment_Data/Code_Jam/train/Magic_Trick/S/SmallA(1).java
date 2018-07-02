package methodEmbedding.Magic_Trick.S.LYD1048;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Scanner;


public class SmallA {
	
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		File file = new File("input.txt");
		Scanner sc = new Scanner (file);
		int TC =  Integer.parseInt(sc.next());
		PrintWriter out = new PrintWriter("output1.txt", "UTF-8");
		int count = 0;
		while( TC != 0){
			HashMap<Integer, Integer> arr = new HashMap<>();
			int a1, a2, k;
			TC--;
			out.print("Case #"+(++count)+": ");
			int counter = 0;
			int cardNo = 0;
			a1 =  Integer.parseInt(sc.next());
			for(int i = 0 ; i < 4 ; i++){
				for(int j = 0 ; j < 4 ; j++){
					k = Integer.parseInt(sc.next());
					if(a1 == (i+1))
						arr.put(k, k);
				}
			}
			a2 =  Integer.parseInt(sc.next());
			for(int i = 0 ; i < 4 ; i++){
				for(int j = 0 ; j < 4 ; j++){
					k =  Integer.parseInt(sc.next());
					if(a2 == (i+1))
						if(arr.containsKey(k)){
							counter ++;
							cardNo = k;
						}
				}
			}
			if(counter == 0){
				out.println("Volunteer cheated!");
			}else if (counter == 1){
				out.println(cardNo);
			}else{
				out.println("Bad magician!");
			}
		}
		out.close();
	}

}
