package methodEmbedding.Speaking_in_Tongues.S.LYD520;

import java.util.HashMap;
import java.util.Scanner;
public class SpeakingInTongues {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Character langmapping[][]={								
				{'a','y'},
				{'b','h'},
				{'c','e'},
				{'d','s'},
				{'e','o'},
				{'f','c'},
				{'g','v'},
				{'h','x'},
				{'i','d'},
				{'j','u'},
				{'k','i'},
				{'l','g'},
				{'m','l'},
				{'n','b'},
				{'o','k'},
				{'p','r'},
				{'q','z'},
				{'r','t'},
				{'s','n'},
				{'t','w'},
				{'u','j'},
				{'v','p'},
				{'w','f'},
				{'x','m'},
				{'y','a'},
				{'z','q'}
		};

		HashMap<Character,Character> langMap = new HashMap<Character, Character>();
		for(int k=0;k<langmapping.length;k++){
			langMap.put(langmapping[k][0], langmapping[k][1]);
		}
		StringBuilder output=new StringBuilder();
		StringBuilder line = null;
		int NoOfTestCases = in.nextInt();
		in.nextLine();
		for(int i=1;i<=NoOfTestCases;i++){
			line=new StringBuilder(in.nextLine());
			for(int j=0;j<line.length();j++){
				if(line.charAt(j)!=' '){
					line.setCharAt(j, langMap.get(line.charAt(j)));
				}
			}		
			output.append("Case #"+i+": "+line+"\n");			
		}
		System.out.println(output);
	}
}
