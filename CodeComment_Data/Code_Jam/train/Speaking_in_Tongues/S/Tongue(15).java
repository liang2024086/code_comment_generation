package methodEmbedding.Speaking_in_Tongues.S.LYD1029;

import java.io.*;
import java.util.*;

public class Tongue {
	public static void main(String args[]) {
		try {
			String strFileName = args[0];
			BufferedReader bfReader = new BufferedReader(new FileReader(strFileName));
			long nTestCases = Integer.parseInt(bfReader.readLine());
			char []map = new char[] {'y','h','e','s','o','c','v','x','d','u','i','g','l',
					'b','k','r',
					'z','t','n','w','j','p','f','m','a',
					'q'};
			
			for(int testCaseCounter=0;testCaseCounter<nTestCases;testCaseCounter++) {
				char []st = bfReader.readLine().toCharArray();
				System.out.print("Case #" + (testCaseCounter+1) + ": ");
				
				for(int i=0;i<st.length;i++) {
					if(st[i]==' ')
						System.out.print(' ');
					else
						System.out.print(map[st[i]-'a']);
				}
				System.out.println();
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
