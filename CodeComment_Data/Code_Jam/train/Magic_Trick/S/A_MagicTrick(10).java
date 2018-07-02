package methodEmbedding.Magic_Trick.S.LYD179;


import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class A_MagicTrick {

	public static void main(String[] args) {
		try {
			PrintWriter out = new PrintWriter( "output.txt" );
			Scanner in = new Scanner(System.in);
			int T = in.nextInt();
			int t = 0;
			while(t < T){
				t++;
				int r1 = in.nextInt();
				int [][]C= new int[5][5];
				HashSet<Integer> set = new HashSet<Integer>();
				for(int i =1; i<=4; i++){
					for(int j =1; j<=4; j++){
						int n = in.nextInt();
						if(i == r1){
							set.add(n);
						}
					}
				}
				
				int r2 = in.nextInt();
				int count = 0;
				int card = -1;
				for(int i =1; i<=4; i++){
					for(int j =1; j<=4; j++){
						int n = in.nextInt();
						if( i == r2){
							if (set.contains(n)){
								count++;
								card = n;
							}
						}
					}
				}
				
				if( 0 == count){
					System.out.println("Case #"+t+": Volunteer cheated!");
					out.println("Case #"+t+": Volunteer cheated!");
				}else if(1 == count){
					System.out.println("Case #"+t+": "+card);
					out.println("Case #"+t+": "+card);
				}else{
					System.out.println("Case #"+t+": Bad magician!");
					out.println("Case #"+t+": Bad magician!");
				}
				
			}
			out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
