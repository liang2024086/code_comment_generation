package methodEmbedding.Standing_Ovation.S.LYD432;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1 {
	public static void main(String[] args) throws IOException {
		 BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		 int lineCount = Integer.parseInt(bufferRead.readLine());
		 for (int i = 0; i < lineCount; i++) {
			 String readLine = bufferRead.readLine();
			 String[] strings = readLine.split(" ");
			 int maxCount = Integer.parseInt(strings[0]);
			 String clappers = strings[1];
			 char[] charArray = clappers.toCharArray();
			 int extClappers = 0;
			 int sum = 0;
			 int index = 1;
			 for (char ch :  charArray) {
				 if (ch == '0' && sum < index) {
					 extClappers++;
					 ch = '1';
				 }
				 sum = sum + Integer.parseInt(ch + "");
				 index++;
			 }
			 System.out.println("Case #"+ (i+1) + ": " + extClappers);
		 }
		 
	 
	}
}
