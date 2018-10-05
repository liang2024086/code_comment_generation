package methodEmbedding.Speaking_in_Tongues.S.LYD989;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

int c = sc.nextInt();
sc.nextLine();
for (int i =1; i<=c; i++){
	
	String s = sc.nextLine();
	
	String nw = "";
	for(int j = 0;j<s.length();j++){
		char cho = s.charAt(j);
		char ch;
		switch(cho){
		case 'y':ch='a';break;
		case 'n':ch ='b';break;
		case 'f':ch = 'c';break;
		case 'i':ch = 'd';break;
		case 'c':ch = 'e';break;
		case 'w':ch = 'f';break;
		case 'l':ch = 'g';break;
		case 'b':ch = 'h';break;
		case 'k':ch = 'i';break;
		case 'u':ch = 'j';break;
		case 'o':ch = 'k';break;
		case 'm':ch = 'l';break;
		case 'x':ch = 'm';break;
		case 's':ch = 'n';break;
		case 'e':ch = 'o';break;
		case 'v':ch = 'p';break;
		case 'z':ch = 'q';break;
		case 'p':ch = 'r';break;
		case 'd':ch = 's';break;
		case 'r':ch = 't';break;
		case 'j':ch = 'u';break;
		case 'g':ch = 'v';break;
		case 't':ch = 'w';break;
		case 'h':ch = 'x';break;
		case 'a':ch = 'y';break;
		case 'q':ch = 'z';break;
		default : ch= cho;
		}
		nw = nw+ch;
		//System.out.println(nw);
	}
	
//System.out.println(nw);
System.out.println("Case #"+i+ ": " +nw + "" );
}//end for
}

}
