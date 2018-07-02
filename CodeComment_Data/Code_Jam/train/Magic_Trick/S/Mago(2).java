package methodEmbedding.Magic_Trick.S.LYD1374;



import java.util.ArrayList;
import java.util.Scanner;

public class Mago {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int t=leer.nextInt();
		int f1,f2;
		for (int c = 1; c <= t; c++) {
			f1=leer.nextInt();
			int []v=new int[17];
			int l;
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
					if (i==f1) {
						v[leer.nextInt()]=1;
					}else {
						l=leer.nextInt();
					}
				}
			}
			f2=leer.nextInt();
			int []v2=new int[17];
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
					if (i==f2) {
						v2[leer.nextInt()]=1;
					}else {
						l=leer.nextInt();
					}
				}
			}
			ArrayList<Integer> cartas=new ArrayList<Integer>();
			for (int i = 1; i <= 16; i++) {
				if (v[i]==1 && v2[i]==1) {
					cartas.add(i);
				}
			}
			if (cartas.size()==1) {
				System.out.printf("Case #%d: %d%n",c,cartas.get(0));
			} else {
				if (cartas.size()!=0) {
					System.out.printf("Case #%d: Bad magician!%n",c);
				} else {
					System.out.printf("Case #%d: Volunteer cheated!%n",c);
				}
			}
			

		}
				
		
	}

}
