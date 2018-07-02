package methodEmbedding.Magic_Trick.S.LYD1290;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class magitian {
	public static void main(String[] args) throws IOException {
		long r, cases;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(new File("input.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("output.out"));
		
		
		cases = sc1.nextInt();

		for (int i = 1; i <= cases; i++) {
			int[][] a= new int[4][4];
			int[][] b= new int[4][4];
			int ans1, ans2;
			int matches=0, number=-1;
			
			ans1 = sc1.nextInt();
			for(int j=0; j<=3; j++){
				for(int k=0; k<=3; k++){
					a[j][k]=sc1.nextInt();
				}
			}
			ans2= sc1.nextInt();
			for(int j=0; j<=3; j++){
				for(int k=0; k<=3; k++){
					b[j][k]=sc1.nextInt();
				}
			}
		
			for(int j=0; j<=3; j++){
				for(int k=0; k<=3; k++){
				if(a[ans1-1][j]==b[ans2-1][k]){
					matches++;
				}
				}
				
		}
			if(matches==1){
				for(int j=0; j<=3; j++){
					for(int k=0; k<=3; k++){
						if(a[ans1-1][j]==b[ans2-1][k]){
							number=a[ans1-1][j];
							break;
					}
					
			}
				
		}
			}
				
				
			
			if(matches==1){
				System.out.println(ans1);
				for(int j=0; j<=3; j++){
					for(int k=0; k<=3; k++){
						System.out.print(a[j][k]+" ");
					}
					System.out.println();
				}
				System.out.println(ans2);
				for(int j=0; j<=3; j++){
					for(int k=0; k<=3; k++){
						System.out.print(b[j][k]+" ");
					}
					System.out.println();
				}
				
				System.out.println(number);
				out.write("Case #"+i+": "+number);
				out.newLine();
			}
			if (matches==0) {
				System.out.println(ans1);
				for(int j=0; j<=3; j++){
					for(int k=0; k<=3; k++){
						System.out.print(a[j][k]+" ");
					}
					System.out.println();
				}
				System.out.println(ans2);
				for(int j=0; j<=3; j++){
					for(int k=0; k<=3; k++){
						System.out.print(b[j][k]+" ");
					}
					System.out.println();
				}
				System.out.println("Volunteer cheated!");
				out.write("Case #"+i+": Volunteer cheated!");
				out.newLine();
			}
			if(matches>1) {
				System.out.println(ans1);
				for(int j=0; j<=3; j++){
					for(int k=0; k<=3; k++){
						System.out.print(a[j][k]+" ");
					}
					System.out.println();
				}
				System.out.println(ans2);
				for(int j=0; j<=3; j++){
					for(int k=0; k<=3; k++){
						System.out.print(b[j][k]+" ");
					}
					System.out.println();
				}
				System.out.println("Bad magician!");
				out.write("Case #"+i+": Bad magician!");
				out.newLine();
			}
		
		
	}
		out.close();
}
}
