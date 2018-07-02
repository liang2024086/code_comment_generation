package methodEmbedding.Magic_Trick.S.LYD1717;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		// XYZ + XY = 6pp
		// Integer.parseInt("");
		/*
		String p = "XYZ";
		String q = "XY";
		String r = "6PP";
		
		int x=1;
		int y=1;
		int z=1 ;
		int result = 0;
		
		for(int i=1; i<10; i++){
			
			 x=i*110;
			 
			 for(int j=1; j<10; j++){
				 if(i==j)
					 continue;
				 y=j*11;
				 
				 for(int k=1; k<10; k++){
					 if(k==i || k==j)
						 continue;
					 z=k;
					 
					 result = x+y+z;
					 
					 if(result == 600 || 
						result == 611 ||
						result == 622 ||
						result == 633 ||
						result == 644 ||
						result == 655 ||
						result == 666 ||
						result == 677 ||
						result == 688 ||
						result == 699){
						 
						System.out.println(i + "/" + j + "/" + k + "/" + result);
						 
					 }
					 
					 
				 }
			 }
			 
		}
		
		
		*/
		
		FileInputStream fis = new FileInputStream("test.txt");
		DataInputStream dis = new DataInputStream(fis);
		BufferedReader br = new BufferedReader(new InputStreamReader(dis));
		String strLine;
		
		FileWriter fw = new FileWriter("out.txt");

		Scanner scan = new Scanner(new File("test.txt"));
		BufferedWriter bw = new BufferedWriter(fw);

		
		String line = null;
		
		int test_case =0 ;
		
		int a = 0;
		int b = 0 ;
		int c = 0;
		
		int tmp = b;
		int r1 = 0;
		int r2 = 0;
		int[] l1 = new int[16];
		int[] l2 = new int[16];
		
		int[] p1 = new int[4];
		int[] p2 = new int[4];
		
		test_case = scan.nextInt();
		
		int poia,poib;
		for(int i=0; i<test_case; i++){
			
			poia = scan.nextInt(); // 
			for(int j=0,k=0; j<16; j++){
				l1[j] = scan.nextInt();
				if( ((poia*4 - j) < 5) && ((poia*4 - j) > 0) ){
					p1[k]=l1[j];
					k++;
				}
			} 
			
			
			poib = scan.nextInt();
			for(int j=0, k=0; j<16; j++){
				l2[j] = scan.nextInt();
				if( ((poib*4 - j) < 5) && ((poib*4 - j) > 0) ){
					p2[k]=l2[j];
					k++;
				}
			}
			
			int cnt =0;
			int ans = 0;
			for(int j=0; j<4; j++){
				for(int k=0; k<4; k++){
					if(p1[j]==p2[k]){
						cnt++;
						ans = p2[k];
					}
				}
			}
			
			
			String result = "";
			
			if(cnt==1){
				result = String.valueOf(ans);
			}
			else if(cnt>1){
				result = "Bad magician!";
			}
			else if(cnt==0){
				result = "Volunteer cheated!";
			}
			
			
			
			int no = i+1;
			
			 bw.write("Case #" + no + ": " + result + "\n");
			 

		}
		
		 bw.close();

		
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}
