package methodEmbedding.Magic_Trick.S.LYD140;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("E:\\A-small-attempt1.in"));

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < n; i++) {
			set.clear();
			int r = in.nextInt() - 1;
			for(int j=0; j<16; j++) {
				int x = in.nextInt();
				if(j >= r*4 && j< r*4+4){
					set.add(x);
				}
			}
			
			r = in.nextInt() - 1;
			int a = 0;
			for(int j=0; j<16; j++) {
				int x = in.nextInt();
				if(j >= r*4 && j< r*4+4){
					if(set.remove(x)){
						a = x;
					}
				}
			}
			
			System.out.print("Case #"+(i+1)+": ");
			if(set.size() == 3){
				System.out.println(a);
			}else if(set.size() == 4){
				System.out.println("Volunteer cheated!");
			}else{
				System.out.println("Bad magician!");
			}
		}
	}
}
