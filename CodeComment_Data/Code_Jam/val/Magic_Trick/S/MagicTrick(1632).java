package methodEmbedding.Magic_Trick.S.LYD348;

/*
 * MagicTrick.java
 *
 * $HeadURL: $
 */

/*
 * Copyright (c) 2008 D. E. Shaw & Co., L.P. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of D. E. Shaw & Co., L.P. ("Confidential Information").  You
 * shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with D. E. Shaw & Co., L.P.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author shuklab
 * @version $Id: $
 */
public class MagicTrick {

	public static void main(String[] args) throws IOException {

		int SZ;
		String CurLine = "";
		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);
		CurLine = in.readLine();
		SZ = Integer.parseInt(CurLine);
		for (int i = 1; i <= SZ; i++) {
			CurLine = in.readLine();
			int row1 = Integer.parseInt(CurLine);
			int roww1[] = new int[4];
			for (int j = 1; j <= 4; j++) {
				CurLine = in.readLine();
				if (row1 != j)
					continue;
				int k =0;
				for (String ss :  CurLine.split(" "))
					roww1[k++] = Integer.parseInt(ss);

			}
			// second
			CurLine = in.readLine();
			int row2 = Integer.parseInt(CurLine);
			int roww2[] = new int[4];
			for (int j = 1; j <= 4; j++) {
				CurLine = in.readLine();
				if (row2 != j)
					continue;

				int k =0;
				for (String ss :  CurLine.split(" "))
					roww2[k++] = Integer.parseInt(ss);
			}
			int count =0;
			int solno = -1;
			for (int p = 0; p < 4; p++) {
				for (int q = 0; q < 4; q++) {
					if (roww1[p] == roww2[q]) {
						count++;
						solno = roww1[p];
					}
				}
			}
			if(count <=0) System.out.println("Case #"+i+": Volunteer cheated!");
			if(count ==1) System.out.println("Case #"+i+": "+solno);
			if(count >=2) System.out.println("Case #"+i+": Bad magician!");
			
		}

	}

}
