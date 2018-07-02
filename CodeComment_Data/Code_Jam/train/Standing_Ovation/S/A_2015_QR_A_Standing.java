package methodEmbedding.Standing_Ovation.S.LYD49;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

import com.petrodavi.utils.ReadDataFromFile;


public class A_2015_QR_A_Standing {



	public static void main(String[] args) throws Throwable {

		List<String> mList = null;

		try {
			mList = ReadDataFromFile.readStringsArraysFromFile(
					"Ex/Ex_2015_QR_A_Small.in");
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}


		String outString = "";
		int numrow=0;
		int T = Integer.parseInt(mList.get(numrow++));
		int t=1;

		while ( t<=T ) {

			StringTokenizer strTkn = new  StringTokenizer(mList.get(numrow++));
			int Smax = Integer.parseInt(strTkn.nextToken());
			String tmpString = strTkn.nextToken();
			int[] svector = new int[tmpString.length()];

			for (int i = 0 ; i<tmpString.length();i++){
				svector[i]=Integer.parseInt(String.valueOf(tmpString.charAt(i)));
				System.out.print(svector[i]+" ");
			}
			System.out.println();

			int resultFinal = 0;

			int howManyIhave = 0;
			for (int i = 0 ; i<svector.length;i++){
				if (svector[i] != 0){
					if (i == 0){
						howManyIhave+=1*svector[i];
					}
					else {
						if (howManyIhave >= i){
							howManyIhave+=svector[i];
						}
						else {
							resultFinal+=(i-howManyIhave);
							howManyIhave+=svector[i]+(i-howManyIhave);
						}
					}
				}
			}

			System.out.println(howManyIhave);



			String m_outString=String.format("Case #%d: %d", t++,resultFinal);
			m_outString+=String.format("\n");	
			System.out.println(m_outString);
			outString+=m_outString;

		}


		try {
			ReadDataFromFile.writeToFile("Sol/"+"solution.txt", outString);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
