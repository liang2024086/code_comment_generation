package methodEmbedding.Speaking_in_Tongues.S.LYD681;

import java.io.*;

class SpeakingInTongues {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fstream = new FileInputStream("C:\\input.txt");
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		
		int cases = Integer.parseInt(br.readLine());
		String mainOutput = "";
		
		for(int i=0;i<cases;i++)
		{
			String str = br.readLine();
			String newStr = "";
			for(int j=0;j<str.length();j++)
			{
				char x = str.charAt(j);
				switch(x)
				{
				case 'y': newStr = newStr + "a"; break;
				case 'n': newStr = newStr + "b"; break;
				case 'f': newStr = newStr + "c"; break;
				case 'i': newStr = newStr + "d"; break;
				case 'c': newStr = newStr + "e"; break;
				case 'w': newStr = newStr + "f"; break;
				case 'l': newStr = newStr + "g"; break;
				case 'b': newStr = newStr + "h"; break;
				case 'k': newStr = newStr + "i"; break;
				case 'u': newStr = newStr + "j"; break;
				case 'o': newStr = newStr + "k"; break;
				case 'm': newStr = newStr + "l"; break;
				case 'x': newStr = newStr + "m"; break;
				case 's': newStr = newStr + "n"; break;
				case 'e': newStr = newStr + "o"; break;
				case 'v': newStr = newStr + "p"; break;
				case 'z': newStr = newStr + "q"; break;
				case 'p': newStr = newStr + "r"; break;
				case 'd': newStr = newStr + "s"; break;
				case 'r': newStr = newStr + "t"; break;
				case 'j': newStr = newStr + "u"; break;
				case 'g': newStr = newStr + "v"; break;
				case 't': newStr = newStr + "w"; break;
				case 'h': newStr = newStr + "x"; break;
				case 'a': newStr = newStr + "y"; break;
				case 'q': newStr = newStr + "z"; break;
	
				default:
					newStr = newStr+Character.toString(x); break;
					
				}
			}
			mainOutput  = mainOutput + "Case #"+(i+1)+": " + newStr + "\n";			
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
        "C:\\output.txt"), true));
		
		bw.write(mainOutput);
		bw.close();
		
		
		in.close();

	}

}
