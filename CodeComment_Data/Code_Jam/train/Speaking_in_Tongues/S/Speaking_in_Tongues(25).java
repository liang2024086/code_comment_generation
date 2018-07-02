package methodEmbedding.Speaking_in_Tongues.S.LYD421;

import java.awt.color.CMMException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;


public class Speaking_in_Tongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strFileName = "A-small-attempt1";
		String strInputFileName = strFileName + ".in";
		String strOutputFileName = strFileName + ".out";


		int iInSum = 0;
		int iOutSum =0;
		int iCaseNumber = 1;

		HashMap<Integer, Integer> mChar = new HashMap<>();		
		HashMap<String, String> mString = new HashMap<>();

		String sExIn1 = "y qee";
		String sExOut1 = "a zoo";
		String sExIn2 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String sExOut2 = "our language is impossible to understand";
		String sExIn3 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		String sExOut3 = "there are twenty six factorial possibilities";
		String sExIn4 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String sExOut4 = "so it is okay if you want to just give up";

		mString.put(sExIn1, sExOut1);
		mString.put(sExIn2, sExOut2);
		mString.put(sExIn3, sExOut3);
		mString.put(sExIn4, sExOut4);

		for (String sKey : mString.keySet()) {
			// string to array
			char[] caIn = sKey.toCharArray();
			char[] caOut = mString.get(sKey).toCharArray();

			for (int idx = 0; idx < caIn.length; idx++) {
				if (caIn[idx] < 'a') {
					continue;
				}
				else {
					int iIn = caIn[idx];
					int iOut = caOut[idx];
					mChar.put(iIn,  iOut);
				}
			}
		}

		int iSum = 0;

		for (int idx = 'a'; idx <= 'z'; idx++) {
			iSum += idx;
		}

		for (int iKey : mChar.keySet()) {
			iInSum += iKey;
			iOutSum += mChar.get(iKey);

			//System.out.println(String.format("Map %c is %c", iKey, mChar.get(iKey)));
		}

		//		System.out.println(String.format("Count is %d", mChar.size()));
		//		System.out.println(String.format("TotalSum is %d", iSum));
		//		System.out.println(String.format("InSum is %d, so have to add %c, Diff is %d", iInSum, iSum-iInSum,iSum-iInSum));
		//		System.out.println(String.format("OutSum is %d, so have to add %c, Diff is %d", iOutSum, iSum-iOutSum, iSum-iOutSum));

		mChar.put(iSum-iInSum, iSum-iOutSum);

		try {
			////////////////////////////////////////////////////////////////
			BufferedReader in = new BufferedReader(new FileReader(strInputFileName));
			BufferedWriter out = new BufferedWriter(new FileWriter(strOutputFileName));
			String inString;
			String outString;

			String sTotalCount = in.readLine();

			while ((inString = in.readLine()) != null) {
				//System.out.println(inString);
				// String to array
				char[] caInput = inString.toCharArray();

				for (int idx = 0; idx < caInput.length; idx++) {
					if (caInput[idx] < 'a') {
						continue;
					}

					int iKey = caInput[idx];
					int iValue = mChar.get(iKey);
					caInput[idx] =(char) iValue; 
				}

				String sResult = new String(caInput);
				outString = String.format("Case #%d: %s\n", iCaseNumber++, sResult); 
				System.out.print(outString);
				out.write(outString);
			}
			in.close();
			out.close();
			////////////////////////////////////////////////////////////////
		} catch (IOException e) {
			System.err.println("ERROR");
			System.err.println(e); // ?????? ?????? ?????? ????
			System.exit(1);
		}	     


	}

}
