package method_new_test.Part_Elf.S.LYD79;

import java.util.*;
public class Fourteen1CA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++)
		{
			String PQ = sc.next();
			long p = Long.parseLong(PQ.split("/")[0]);
			long q = Long.parseLong(PQ.split("/")[1]);
			int n = 0;
			if(p*Math.pow(2,40)%q!=0)
			{
				System.out.println("Case #"+t+": impossible");
				continue;
			}
			while(q>p)
			{
				p = p*2;
				n++;
			}
			System.out.println("Case #"+t+": "+n);
		}
	}
}
