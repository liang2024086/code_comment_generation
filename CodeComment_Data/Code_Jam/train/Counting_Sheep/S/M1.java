package methodEmbedding.Counting_Sheep.S.LYD812;

import java.util.Scanner;
class M1 {
	public static void main( String args[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		long h[] = new long[t];
		for(int i = 0; i < t; i++) {
			long a = s.nextLong();
			if (a == 0)
				h[i] = 0;
			else {
				String str = new String();
				str = " ";
				for(long j = 1; j <= 1000 ; j++) {
					int c = 0;
					long x = a * j;
					str = str + x;
						if(str.indexOf('0') != -1 && str.indexOf('1') != -1 && str.indexOf('2') != -1 && str.indexOf('3') != -1 && str.indexOf('4') != -1 && str.indexOf('5') != -1 && str.indexOf('6') != -1 && str.indexOf('7') != -1 && str.indexOf('8') != -1 && str.indexOf('9') != -1 )
						c = c+1;
					if(c == 1){
					h[i] = x;
					break;}
				}
			}
		}
		for(int i= 0 ; i< t; i++) {
		if(h[i] == 0)
				System.out.println("Case #" + (i + 1) + ": INSOMNIA");
		else
				System.out.println("Case #" + (i + 1) + ": " + h[i]);	
		}
	}
}
