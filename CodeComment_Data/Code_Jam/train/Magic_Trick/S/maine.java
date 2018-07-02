package methodEmbedding.Magic_Trick.S.LYD360;

import java.util.Scanner;

public class maine {
	static int l =0;
	static int rrrrr=0;
	static int i=0;
	static int lala=0;
	public static void main (String [] args){
	int t,   r, e, rr, f;

	int a[] = new int[16];
	int b[] = new int[16];
	int c[] = new int[4];
	int d[] = new int[4];

 
		Scanner tttt = new Scanner(System.in);
		t = tttt.nextInt();
		for (i = 1; i <t+1; i++) {
			 
			r = tttt.nextInt();
			for (e = 0; e <= 15; e++) {
				a[e] = tttt.nextInt();

			}

			rr = tttt.nextInt();
			for (f = 0; f <= 15; f++) {

				b[f] = tttt.nextInt();

			}

			if (r == 1) {
				for (int j = 0; j <= 3; j++) {
					c[j] = a[j];
				}
			} else if (r == 2) {
				for (int j = 0; j <= 3; j++) {
					c[j] = a[4 + j];
				}
			} else if (r == 3) {
				for (int j = 0; j <= 3; j++) {
					c[j] = a[8 + j];
				}
			} else if (r == 4) {
				for (int j = 0; j <= 3; j++) {
					c[j] = a[12 + j];
				}

			}

			if (rr == 1) {
				for (int j = 0; j <= 3; j++) {
					d[j] = b[j];
				}
			} else if (rr == 2) {
				for (int j = 0; j <= 3; j++) {
					d[j] = b[4 + j];
				}
			} else if (rr == 3) {
				for (int j = 0; j <= 3; j++) {
					d[j] = b[8 + j];
				}
			} else if (rr == 4) {
				for (int j = 0; j <= 3; j++) {
					d[j] = b[12 + j];
				}
 	}
rrrrr=l;
		 for (int rj=0;rj<=3;rj++){
			 
			 for(int hj=0;hj<=3;hj++){
				  
				 if(c[rj]==d[hj]){
					 l++;
					lala=c[rj];
				 }
					
			 }}
			
			
		 
		 
		  if (l-rrrrr>=2){
			 System.out.print("Case #"+i+": Bad Magician!\n" );
		 }  if(l-rrrrr==1)
		 {
			 System.out.print("Case #"+i+": "+lala+"\n"  );
		 }
		 if(l-rrrrr==0){
			 System.out.print("Case #"+i+": Volunteer Cheated!\n"  );
		 }
		}

	}
}
