package method_all.GoroSort.S.LYD114;

import java.util.Scanner;
public class G_D_test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int keis = sc.nextInt();
		for (int kei = 1; kei <=keis; kei++) {
			int n = sc.nextInt();
			int[] ar = new int[n];
			int tama = 0;
			for (int i = 0; i < n; i++) {
				ar[i]=sc.nextInt();
				if(ar[i]==i+1)tama++;
			}
			System.out.print("Case #"+kei+": "+ (n-tama)+".000000\n");
		}
	}
}
