package methodEmbedding.Magic_Trick.S.LYD1929;

import java.util.Scanner;


public class B {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		String s = "";
		for(int i = 1 ; i<=cases; i++) {
			int row = sc.nextInt();
			boolean [] c = new boolean[16];
			for(int j = 1; j<=16; j++) {
				int a = sc.nextInt() - 1;
				if(row == 1) {
					if(j<5) {
						c[a] = true;
					}
				} else if(row == 2) {
					if(j>=5 && j<9) {
						c[a] = true;
					}
				} else if(row == 3) {
					if(j>=9 && j<13) {
						c[a] = true;
					}
				} else {
					if(j>=13) {
						c[a] = true;
					}
				}
				
			}
			row = sc.nextInt();
			boolean [] cc = new boolean[16];
			for(int j = 1; j<=16; j++) {
				int a = sc.nextInt() - 1;
				if(row == 1) {
					if(j<5) {
						if(c[a]){
							cc[a]= true;
						}
							
					}
				} else if(row == 2) {
					if(j>=5 && j<9) {
						if(c[a]){
							cc[a]= true;
						}					}
				} else if(row == 3) {
					if(j>=9 && j<13) {
						if(c[a]){
							cc[a]= true;
						}						}
				} else {
					if(j>=13) {
						if(c[a]){
							cc[a]= true;
						}						}
				}
			}
			boolean hassol = false;
			boolean hasmany = false;
			int sol = 0;
			for(int j = 0; j<16; j++) {
				if(cc[j]) {
					if(hassol) {
						hasmany = true;
					} else {
						hassol = true;
						sol = j + 1;
					}
				} 
			}
			
			if(hasmany) {
				s += "Case #" + i + ": " + "Bad magician!" +"\n";
			} else if(hassol) {
				s += "Case #" + i + ": " + sol +"\n";
			} else {
				s += "Case #" + i + ": " + "Volunteer cheated!" +"\n";
			}
		
			
			
		}
		System.out.println(s);
		
	}

}
