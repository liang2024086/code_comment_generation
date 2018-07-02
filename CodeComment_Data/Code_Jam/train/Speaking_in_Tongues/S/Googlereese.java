package methodEmbedding.Speaking_in_Tongues.S.LYD1501;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Googlereese {

	/**
	 * @param args
	 */
	
	static char[] map = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
	
	public static void main(String[] args) throws Exception{
		
		//FileOutputStream fos = new FileOutputStream("testop.txt");
		File file_op = new File("output.o");
		FileOutputStream fos = new FileOutputStream(file_op);
		DataOutputStream dos = new DataOutputStream(fos);

		File file = new File("A-small-attempt3.in");
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		
		int numCase = Integer.parseInt(dis.readLine());
		int Case = 1;
		while(numCase > 0) {
			String message = dis.readLine();
			
			dos.writeBytes("Case #" + Case + ": ");
			char[] symbols = message.toCharArray();
			
			for(int i = 0; i < symbols.length; i++) {
				if(symbols[i] != 32) {
					symbols[i] = map[symbols[i] - 97];
				}
				dos.write(symbols[i]);
			}
			numCase--;
			Case++;
			dos.writeBytes("\n");
		}
		fos.close();
		dos.close();
		dis.close();
		fis.close();
		
	}

}
