package methodEmbedding.Counting_Sheep.S.LYD301;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class CoutingSheep {
static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		File file = new File("out.txt");
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		int t=leer.nextInt();
		int ncase=1;
		while(t-->0){
			BigInteger num=leer.nextBigInteger();
			if(num.equals(BigInteger.ZERO)){
				bw.write("Case #"+(ncase++)+": INSOMNIA\n");
			}
			else{
				BigInteger i = new BigInteger("1");
				Set<Character> set = new HashSet<Character>();
				String dig=num.toString();
				while(set.size()<10){
					dig = num.multiply(i).toString();
					for(int p = 0; p < dig.length(); p++){
						set.add(dig.charAt(p));
					}
					i = i.add(BigInteger.ONE);
				}
				String sol="Case #"+(ncase++)+": "+dig+"\n";
				bw.write(sol);

				System.out.println();
			}
		}
		bw.close();

	}

}
