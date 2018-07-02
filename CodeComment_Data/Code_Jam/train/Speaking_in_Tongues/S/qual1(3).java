package methodEmbedding.Speaking_in_Tongues.S.LYD571;


import java.io.*;

public class qual1 {
	public static void main(String[] args) {
		String[] map = new String[] {"y","h","e","s","o",
									"c","v","x","d","u",
									"i","g","l","b","k",//o
									"r","z","t","n","w",
									"j","p","f","m","a","q"};//z
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("src/a-small-attempt0.in");
			FileOutputStream fos = new FileOutputStream("out1.txt");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
			int lines = Integer.parseInt(br.readLine());
			String outp;
			String inp;
			
			for(int i = 0; i < lines; i++) {
				inp = br.readLine();
				outp = "Case #" + (i+1) + ": ";
				for(byte b : inp.getBytes()) {
					if(b >= 97)
						outp += map[b - 97];
					else
						outp += " ";
				}
				outp += "\r\n";
		
				fos.write(outp.getBytes());
				
			}
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
