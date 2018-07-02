package methodEmbedding.Counting_Sheep.S.LYD939;

import java.util.Scanner;

public class codejam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		int temp=tc;
		while(tc--!=0) {
			int N = in.nextInt();
			if(N==0) {
				System.out.println("Case #"+(temp-tc)+": "+"INSOMNIA");
				continue;
			}
			int set[] = {0,1,2,3,4,5,6,7,8,9};
			int counter = 10;
			Integer mul=0;
			for(int i=1;counter!=0;i++) {
				mul = new Integer(N*i);
				String str = mul.toString();
				for(int j=0;j<str.length();j++) {
					int digit = str.charAt(j)-48;
					if(set[digit]!=-1) {
						set[digit]=-1; counter--;
					}
				}
			}
			System.out.println("Case #"+(temp-tc)+": "+mul);
		}
		in.close();
	}
}
