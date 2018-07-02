package methodEmbedding.Speaking_in_Tongues.S.LYD858;

	import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class word {

	

	

		public static void main(String[] args) throws FileNotFoundException{
			
			Scanner kb = new Scanner(System.in);
			PrintWriter out  = new PrintWriter("answer.txt");
			int numcase = kb.nextInt();
		kb.nextLine();
			for(int i=0;i<numcase;i++){
				String sen = kb.nextLine();
				String answer = "";
				for(int k=0;k<sen.length();k++){
					char c = sen.charAt(k);
					switch(c){
					case 'a':
					answer+= "y";
					break;
					case 'b':
						answer+= "h";
						break;
					case 'c':
						answer+= "e";
						break;
					case 'd':
						answer+= "s";
						break;
					case 'e':
						answer+= "o";
						break;
					case 'f':
						answer+= "c";
						break;
					case 'g':
						answer+= "v";
						break;
					case 'h':
						answer+= "x";
						break;
					case 'i':
						answer+= "d";
						break;
					case 'j':
						answer+= "u";
						break;
					case 'k':
						answer+= "i";
						break;
					case 'l':
						answer+= "g";
						break;
					case 'm':
						answer+= "l";
						break;
					case 'n':
						answer+= "b";
						break;
					case 'o':
						answer+= "k";
						break;
					case 'p':
						answer+= "r";
						break;
					case 'q':
						answer+= "z";
						break;
					case 'r':
						answer+= "t";
						break;
					case 's':
						answer+= "n";
						break;
					case 't':
						answer+= "w";
						break;
					case 'u':
						answer+= "j";
						break;
					case 'v':
						answer+= "p";
						break;
					case 'w':
						answer+= "f";
						break;
					case 'x':
						answer+= "m";
						break;
					case 'y':

						answer+= "a";
						break;
					case 'z':
						answer+= "q";
						break;
					case ' ':
						answer+= " ";
					}
				
			}
				out.println("Case #"+(i+1)+": "+answer);
		}
			out.close();
	
}
}
