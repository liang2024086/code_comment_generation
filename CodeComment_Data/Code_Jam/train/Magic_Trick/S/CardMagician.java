package methodEmbedding.Magic_Trick.S.LYD1808;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/*
 * This code is a protected work and subject to domestic and international
 * copyright law(s).  A complete listing of authors of this work is readily
 * available.  Additionally, source code is, by its very nature, confidential
 * information and inextricably contains trade secrets and other information
 * proprietary, valuable and sensitive to Redknee.  No unauthorized use,
 * disclosure, manipulation or otherwise is permitted, and may only be used
 * in accordance with the terms of the license agreement entered into with
 * Redknee Inc. and/or its subsidiaries.
 *
 * Copyright (c) Redknee Inc. and its subsidiaries. All Rights Reserved.
 */

/**
 * 
 *
 * @author mbarve
 * @since 
 */
public class CardMagician {
	public static void main(String args[]){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input;
			input=br.readLine();
			int totalTests = Integer.parseInt(input);
			
			for (int i =0; i< totalTests; i++){
				input=br.readLine();
				Set<Integer> foundCards = new HashSet<Integer>();
				Integer foundCard = null;
				int firstChosenRow = Integer.parseInt(input);
				Set<Integer> firstRowSet = new HashSet<Integer>();
				for (int row = 0; row<4; row++){
					
					input=br.readLine();
					if (row + 1 == firstChosenRow){
						String[] cardToken = input.split(" ");
						for (String token : cardToken){
							firstRowSet.add(Integer.valueOf(token));
						}
					}
				}
				input=br.readLine();
				int secondChosenRow = Integer.parseInt(input);
				for (int row = 0; row<4; row++){
					
					input=br.readLine();
					if (row + 1 == secondChosenRow){
						String[] cardToken = input.split(" ");
						for (String token : cardToken){
							Integer currentCard = Integer.valueOf(token);
							if (firstRowSet.contains(currentCard)){
								foundCards.add(currentCard);
								foundCard = currentCard;
							}
						}
					}
				}
				if (foundCards.size() == 1){
					System.out.println("Case #" + (i+1) + ": " + foundCard);
				}else if (foundCards.size() > 1){
					System.out.println("Case #" + (i+1) + ": Bad magician!");
				}else if (foundCards.size() == 0){
					System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
