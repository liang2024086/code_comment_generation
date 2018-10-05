package methodEmbedding.Magic_Trick.S.LYD1617;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class MagicTrick {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		int r1, r2;
		String s1 = "", s2 = "", tmp;
		PrintWriter pw = new PrintWriter(new FileOutputStream("C:\\Users\\Evgenija\\Desktop\\out.txt"));
		
		for(int i = 0; i < cases; i++){
			
			
			r1 = Integer.parseInt(in.readLine());
			for(int j = 1; j <=4; j++){
				if(j == r1){
					s1 = in.readLine();
				}else{
					tmp = in.readLine();
				}
			}
			
			r2 = Integer.parseInt(in.readLine());
			for(int j = 1; j <=4; j++){
				if(j == r2){
					s2 = in.readLine();
				}else{
					tmp = in.readLine();
				}
			}
			
			StringTokenizer st1 = new StringTokenizer(s1);
			StringTokenizer st2 = new StringTokenizer(s2);
			HashSet<Integer> h1 = new HashSet<Integer>();
			HashSet<Integer> h2 = new HashSet<Integer>();
			
			for(int j = 0; j < 4; j++){
				h1.add(Integer.parseInt(st1.nextToken()));
				h2.add(Integer.parseInt(st2.nextToken()));
			}
			
			h1.retainAll(h2);
			if(h1.size() == 1){
				Iterator<Integer> iter = h1.iterator();
				int k = iter.next();
				pw.print("Case #"+ (i+1) +": " + k + "\n");
				System.out.println("Case #"+ (i+1) +": " + k);
			}else if(h1.isEmpty()){
				System.out.println("Case #"+ (i+1) +": Volunteer cheated!");
				pw.print("Case #"+ (i+1) +": Volunteer cheated!" + "\n");
			}else{
				System.out.println("Case #"+ (i+1) +": Bad magician!");
				pw.print("Case #"+ (i+1) +": Bad magician!"+ "\n");
			}
			pw.flush();
		}
		pw.close();
	}
	
}
