package methodEmbedding.Speaking_in_Tongues.S.LYD1160;

import java.util.*;
public class Main {
	public static void main(String args[]){
		int t;
		Scanner s = new Scanner(System.in);
		t=s.nextInt();
		HashMap<Character,Character> hm = new HashMap<Character,Character>();
		char[] oldchar=new char[27];
		char[] newchar=new char[27];		
		oldchar[0]=' ';newchar[0]=' ';
		oldchar[1]='a';newchar[1]='y';
		oldchar[2]='b';newchar[2]='h';
		oldchar[3]='c';newchar[3]='e';
		oldchar[4]='d';newchar[4]='s';
		oldchar[5]='e';newchar[5]='o';
		oldchar[6]='f';newchar[6]='c';
		oldchar[7]='g';newchar[7]='v';
		oldchar[8]='h';newchar[8]='x';
		oldchar[9]='i';newchar[9]='d';
		oldchar[10]='j';newchar[10]='u';
		oldchar[11]='k';newchar[11]='i';
		oldchar[12]='l';newchar[12]='g';
		oldchar[13]='m';newchar[13]='l';
		oldchar[14]='n';newchar[14]='b';
		oldchar[15]='o';newchar[15]='k';
		oldchar[16]='p';newchar[16]='r';
		oldchar[17]='q';newchar[17]='z';
		oldchar[18]='r';newchar[18]='t';
		oldchar[19]='s';newchar[19]='n';
		oldchar[20]='t';newchar[20]='w';
		oldchar[21]='u';newchar[21]='j';
		oldchar[22]='v';newchar[22]='p';
		oldchar[23]='w';newchar[23]='f';
		oldchar[24]='x';newchar[24]='m';
		oldchar[25]='y';newchar[25]='a';
		oldchar[26]='z';newchar[26]='q';
		for(int j=0;j<27;j++){
			hm.put(oldchar[j], newchar[j]);
		}
		s.nextLine();
		for(int i=0;i<t;i++){
			StringBuffer str;
			str=new StringBuffer(s.nextLine());
			for(int j=0;j<str.length();j++){
				str.setCharAt(j,hm.get(str.charAt(j)));
			}
			System.out.println("Case #"+(i+1)+": "+str);
		}
		
	}
}
