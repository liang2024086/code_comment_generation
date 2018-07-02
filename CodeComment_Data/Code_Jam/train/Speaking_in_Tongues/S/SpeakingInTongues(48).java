package methodEmbedding.Speaking_in_Tongues.S.LYD631;

import java.util.Scanner;

public class SpeakingInTongues {
	public static void main(String[] args){
		char[][] map={
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
		Scanner keyin=new Scanner(System.in);
		int T=keyin.nextInt();
		keyin.nextLine();
		int caseCount=0;
		while ((T--)!=0){
			String str=keyin.nextLine();
			String result="";
			caseCount++;
			for (int i=0; i<str.length(); i++){
				for (int j=0; j<map.length; j++){
					if (str.charAt(i)==map[j][0]){
						result+=map[j][1];
					}
					else if (str.charAt(i)==' '){
						result+=' ';
						break;
					}
				}
			}
			System.out.println("Case #"+caseCount+": "+result);
		}
	}
}
