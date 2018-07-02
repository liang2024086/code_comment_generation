package methodEmbedding.Speaking_in_Tongues.S.LYD892;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class A {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("A-small-attempt2.in"));
		PrintWriter out = new PrintWriter((new FileWriter("A-small-attempt0.out")));
		int num = Integer.parseInt(f.readLine());
		char lan[] = new char[26];
		//a
		lan[0] = 'y';
		//b
		lan[1] ='n' ;
		//c
		lan[2] ='f' ;
		//d
		lan[3] ='i';
		//e
		lan[4] ='c';
		//f
		lan[5] = 'w';
		//g
		lan[6] ='l';
		//h
		lan[7] ='b';
		//i
		lan[8] ='k';
		//j
		lan[9] ='u';
		//k
		lan[10] ='o';
		//l
		lan[11] ='m';
		//m	
		lan[12] ='x';
		//n
		lan[13] ='s';
		//o
		lan[14] ='e';
		//p
		lan[15] ='v';
		//q
		lan[16] ='z';
		//r
		lan[17] ='p';
		//s
		lan[18] ='d';
		//t
		lan[19] ='r';
		//u
		lan[20] ='j';
		//v
		lan[21] ='g';
		//w
		lan[22] ='t';
		//x
		lan[23] ='h';
		//y
		lan[24] ='a';
		//z
		lan[25] ='q';
		String ans[] = new String[num];
		for (int i=0;i<num;i++){
			String str = f.readLine();
			String neStr = "";
			for (int k=0;k<str.length();k++)
				if (str.charAt(k)!=' '){
					int m=0;
					while (lan[m]!= str.charAt(k))
						m++;
					char c = (char) (97+m);
					neStr = neStr.concat(""+c);
				}
				else 
					neStr = neStr.concat(""+' ');
			ans[i] = neStr;
		}
		for (int i=0;i<num;i++){
			out.println("Case #" + (i+1) +": "+ans[i]);
		}
		out.close();
		System.exit(0);
	}

}
