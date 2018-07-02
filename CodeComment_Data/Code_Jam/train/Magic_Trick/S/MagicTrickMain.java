package methodEmbedding.Magic_Trick.S.LYD1444;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class MagicTrickMain {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter fw = null;
		int InputCount = 0;
		
		try {
			in = new BufferedReader(new FileReader("A-small-attempt0.in"));
			//in = new BufferedReader(new FileReader("A-large.in"));
			fw = new BufferedWriter(new FileWriter("A-small.out"));

			String tmpReadLine = in.readLine();
			InputCount = Integer.parseInt(tmpReadLine);
//			System.out.println("InputCount:" + InputCount);

			int[] numbers = new int[4];
			
			for ( int i = 0 ; i < InputCount ; i++ ) {
				int selectedIndex =Integer.parseInt(in.readLine());
//				System.out.println("selectedIndex:" + selectedIndex);
				
				for ( int j = 1; j < 5; j++ ) {
					tmpReadLine = in.readLine();
					
					if(tmpReadLine == null) 
						break;
					
					if ( j == selectedIndex ) {
						StringTokenizer stk = new StringTokenizer( tmpReadLine," " );
						
						for ( int k = 0 ; k < 4; k++ ) {
							numbers[k] = Integer.parseInt(stk.nextToken());
//							System.out.println("numbers[" + k + "]:"  + numbers[k]);
						}
					}
				}

				selectedIndex =Integer.parseInt(in.readLine());
//				System.out.println("selectedIndex2:" + selectedIndex);

				for ( int j = 1; j < 5; j++ ) {
					tmpReadLine = in.readLine();
					if(tmpReadLine == null) 
						break;
					
					if ( j == selectedIndex ) {
//						System.out.println("readline2:" + tmpReadLine);
						
						StringTokenizer stk = new StringTokenizer( tmpReadLine," " );
						
						int CurrCount = 0;
						int selNumber = -1;

						for ( int k = 0 ; k < 4; k++ ) {
							int num = Integer.parseInt(stk.nextToken());
							
							for ( int p = 0 ; p < 4; p++) {
								if (numbers[p] == num) {
									selNumber = num;
									CurrCount++;
								}
							}
						}
												
//						System.out.println("CurrCount :"  + CurrCount);
						String outStr = "";
						switch (CurrCount) {
							case 0:
								outStr = "Case #" + (i + 1) + ": Volunteer cheated!";
								break;
	
							case 1:
								outStr = "Case #" + (i + 1) + ": " + selNumber;
								break;
								
							default:
								outStr = "Case #" + (i + 1) + ": Bad magician!";
								break;
						}
//						System.out.println(outStr);
						fw.write(outStr + "\n");
					}
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null ) try{ in.close(); } catch(IOException e){}
			if (fw != null ) try{ fw.close(); } catch(IOException e){}
		}
	}

}
