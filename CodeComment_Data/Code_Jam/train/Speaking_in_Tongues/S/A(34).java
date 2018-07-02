package methodEmbedding.Speaking_in_Tongues.S.LYD1601;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

public class A {

	public static void main(String[] args) throws NumberFormatException, IOException {
		RandomAccessFile raf = new RandomAccessFile("input.in", "r");
		PrintWriter raf2 = new PrintWriter("output.txt");
		int cases = Integer.parseInt(raf.readLine());
		for(int i=0;i<cases;i++)
		{
			char[] s = raf.readLine().toCharArray();
			String res="";
			for(char c : s){
				switch(c)
				{
				case 'a' :res+="y";break;
				case 'b' :res+="h";break;
				case 'c' :res+="e";break;
				case 'd' :res+="s";break;
				case 'e' :res+="o";break;
				case 'f' :res+="c";break;
				case 'g' :res+="v";break;
				case 'h' :res+="x";break;
				case 'i' :res+="d";break;
				case 'j' :res+="u";break;
				case 'k' :res+="i";break;
				case 'l' :res+="g";break;
				case 'm' :res+="l";break;
				case 'n' :res+="b";break;
				case 'o' :res+="k";break;
				case 'p' :res+="r";break;
				case 'q' :res+="z";break;
				case 'r' :res+="t";break;
				case 's' :res+="n";break;
				case 't' :res+="w";break;
				case 'u' :res+="j";break;
				case 'v' :res+="p";break;
				case 'w' :res+="f";break;
				case 'x' :res+="m";break;
				case 'y' :res+="a";break;
				case 'z' :res+="q";break;
				default :res+=" ";break; 
				}
			}
			raf2.write("Case #"+(i+1)+": "+res);
			if(i!=cases-1)
				raf2.println();
		}
		raf.close();
		raf2.close();
	}
}
