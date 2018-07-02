package methodEmbedding.Speaking_in_Tongues.S.LYD1596;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class GoogleReese {

	/**
	 * @param args
	 */
	static int setCount=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		char[] map={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		/*Scanner scn=new Scanner(System.in);
		int cases=scn.nextInt();*/
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(br.readLine().trim());
		for(int i=0;i<cases;i++){
			System.out.print("Case #"+(i+1)+": ");
			String str=br.readLine().trim();
			char[] arr=str.toCharArray();
			for(int j=0;j<arr.length;j++){
				if(arr[j]==' ')
					continue;
				arr[j]=map[arr[j]-'a'];
			}
			System.out.println(new String(arr));
		}
	}
}
