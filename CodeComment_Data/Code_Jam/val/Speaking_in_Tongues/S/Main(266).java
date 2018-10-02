package methodEmbedding.Speaking_in_Tongues.S.LYD927;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner sc;
	static int nroLin;
		
	
	public static void main(String[] args) throws IOException{
		
		try{
			File in = new File( "input.txt" );
			//File out = new File( "output.txt" );
			sc = new Scanner(in);
			while (sc.hasNext()){
				nroLin = sc.nextInt();	
				String l = sc.nextLine();
				for (int i=1; i<=nroLin; i++){
					/*una linea*/
					l = sc.nextLine();
					int tam = l.length();
					System.out.print("Case #"+i+": ");
					for (int j=0; j<tam; j++){
						switch(l.charAt(j)){
						/*a q y h e s o c v x d u i g l b k r z t n w j p f m*/
						case 'y': System.out.print('a'); break;
						case 'z': System.out.print('q'); break;
						case 'a': System.out.print('y'); break;
						case 'b': System.out.print('h'); break;
						case 'c': System.out.print('e'); break;
						case 'd': System.out.print('s'); break;
						case 'e': System.out.print('o'); break;
						case 'f': System.out.print('c'); break;
						case 'g': System.out.print('v'); break;
						case 'h': System.out.print('x'); break;
						case 'i': System.out.print('d'); break;
						case 'j': System.out.print('u'); break;
						case 'k': System.out.print('i'); break;
						case 'l': System.out.print('g'); break;
						case 'm': System.out.print('l'); break;
						case 'n': System.out.print('b'); break;
						case 'o': System.out.print('k'); break;
						case 'p': System.out.print('r'); break;
						case 'q': System.out.print('z'); break;
						case 'r': System.out.print('t'); break;
						case 's': System.out.print('n'); break;
						case 't': System.out.print('w'); break;
						case 'u': System.out.print('j'); break;
						case 'v': System.out.print('p'); break;
						case 'w': System.out.print('f'); break;
						case 'x': System.out.print('m'); break;
						default: System.out.print(l.charAt(j)); break;
						}
					}
					System.out.println();
					
				}
				
			}
			
		}
		catch(IOException e){
			System.out.println("no se que sucedio :P");
		}

	}
	
}
