package methodEmbedding.Counting_Sheep.S.LYD809;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class Sheep {
	
	public static void main(String args[]){
		//System.out.println("HEY");
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		//System.out.println("HEY" + N);

		for (int c = 1 ; c <= N ; c++){
			HashMap<String, Integer> decimals = new HashMap<>();
			int n = in.nextInt();
			//System.out.println(n);
			Integer s = new Integer(n);
			if (s.intValue() == 0){
				System.out.println("Case #" + c + ": " + "INSOMNIA");
				continue;
			}

			String sheep = s.toString();
			for (int i = 0 ; i < sheep.length() ; i++){
				decimals.put("" + sheep.charAt(i), 1);
			}
			
			//BigInteger bi = new BigInteger(sheep);
			//BigInteger bb = bi;
			Integer bb = s;
			while ( decimals.size() < 10 ){
				//System.out.println(decimals.size());
				bb = bb + s;
				String ss = bb.toString();
				//System.out.println(ss);
				for (int j = 0 ; j < ss.length() ; j++){
					decimals.put("" + ss.charAt(j), 1);
				}
			}
			
			System.out.println("Case #" + c + ": " + bb.toString());
		}
	}
	
}
