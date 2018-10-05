package methodEmbedding.Counting_Sheep.S.LYD1220;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		boolean[] seen = new boolean[10];
		Scanner in = new Scanner(new File("../../../stuff1.txt"));
		PrintWriter o = new PrintWriter("out.txt");
		int k = 1;
		in.nextInt();
		while (in.hasNextInt()){
			o.print("Case #"+k+": ");
			k++;
			for (int i = 0; i<10; i++){
				seen[i]=false;
			}
			long n = (long) in.nextInt();
			if (n==0){
				o.println("INSOMNIA");
				continue;
			}
			for (int i = 1;;i++){
				String s = n*i+"";
				for (int j = 0; j < s.length(); j++){
					seen[Integer.parseInt(s.charAt(j)+"")] = true;
				}
				boolean t = true;
				for (boolean b : seen){
					if (!b){
						t = false;
						break;
					}
				}
				if (t){
					o.println(s);
					break;
				}
			}
		}
		o.close();
	}
}
