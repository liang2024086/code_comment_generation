package methodEmbedding.Standing_Ovation.S.LYD1214;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class A {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("A.in"));
		int numT = sc.nextInt();
		for(int test=1; test<=numT; ++test)
		{
			int N = sc.nextInt();
			char[] arr = sc.next().toCharArray();
			int tot=0, fr=0;
			for(int i=0; i<=N; ++i)
			{
				if(arr[i]!='0' && tot<i)
				{
					fr+=i-tot;
					tot=i;
				}
				tot+=arr[i]-'0';
			}
			System.out.printf("Case #%d: %d\n", test, fr);
		}
	}

}
