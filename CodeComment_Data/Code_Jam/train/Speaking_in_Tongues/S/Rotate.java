package methodEmbedding.Speaking_in_Tongues.S.LYD489;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Rotate {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File( "A-small-attempt1.in" );
		FileWriter out=new FileWriter("output.txt");

		Scanner in = new Scanner(new FileReader(f));

		if(f.exists()){
			int T;
			char[] t = new char[100];
			char[] trad = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};


			T = in.nextInt();
			in.nextLine();

			for(int i = 1 ; i <= T ; i++)
			{
				out.write("Case #" + i + ": ");
				t = in.nextLine().toCharArray();
				for(int k = 0; k < t.length ; k++)
				{
					if(t[k] == ' ')
						out.append(' ');
					else
						out.append((trad[(t[k]-'a')]));
				}
				out.append("\n");
			}
		}

		in.close();
		out.close();

		
	}
}
