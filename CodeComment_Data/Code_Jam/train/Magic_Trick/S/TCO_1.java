package methodEmbedding.Magic_Trick.S.LYD1447;

import java.io.PrintWriter;
import java.util.Scanner;


public class TCO_1 {
	public static void main(String[] args){
		PrintWriter pw = new PrintWriter(System.out, true);
		Scanner sc = new Scanner(System.in);
		int a, b, c, T = sc.nextInt();
		
		for(int I=1;I<=T;I++){
			int[] N = new int[17];
			a = sc.nextInt();
			for(int i=1;i<=4;i++){
				
				if(i == a){
					for(int j=1;j<=4;j++){
						N[sc.nextInt()]++;
					}
				}else{
					for(int j=1;j<=4;j++){
						c = sc.nextInt();
					}
				}
			}
			b = sc.nextInt();
			for(int i=1;i<=4;i++){
				if(i == b){
					for(int j=1;j<=4;j++){
						N[sc.nextInt()]++;
					}
				}else{
					for(int j=1;j<=4;j++){
						c = sc.nextInt();
					}
				}
			}
			c = 0;
			for(int i=1;i<=16;i++){
				if(N[i] == 2){
					c++;
				}
			}
			pw.print("Case #"+I+": ");
			if(c > 1){
				pw.println("Bad magician!");
			}else if(c == 0){
				pw.println("Volunteer cheated!");
			}else{
				for(int i=1;i<=16;i++){
					if(N[i] == 2){
						c = i;
					}
				}
				
				pw.println(c);
			}
			
			
			
			
		}
				
				
		pw.close();		
	}
}
