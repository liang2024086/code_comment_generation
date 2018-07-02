package methodEmbedding.Magic_Trick.S.LYD1012;

/**
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Himanshu Jain (erhimanshujain)
 *
 */
public class Entry {

	public static void main(String[] args) {
		BufferedReader buffReader=null;
		BufferedWriter buffWriter=null;
		Integer testCases=null;
		int firstChoice, secondChoice;
		String[][]firstArrangement=null;
		String[][]secondArrangement=null;
		String[] highCards=null;
		String result=null;
		ArrayList<String> tempList=null;
		try{
			buffReader=new BufferedReader(new FileReader(new File("C:\\Users\\Himanshu Jain\\Desktop\\CodeJam\\Qualifying2014\\Submission1\\A-small-attempt1.in")));
			buffWriter=new BufferedWriter(new FileWriter(new File("C:\\Users\\Himanshu Jain\\Desktop\\CodeJam\\Qualifying2014\\Submission1\\A-small-attempt1.out")));
			
			// Read the input file
			testCases=Integer.valueOf(buffReader.readLine());	// No. of test cases
			
			for(short tcIndex=1;tcIndex<=testCases;tcIndex++) {
				// First choice
				firstChoice=Integer.parseInt(buffReader.readLine())-1;	//	First choice

				// Reading first arrangement
				firstArrangement=new String[4][4];
	
				for(byte bTmp=0;bTmp<4;bTmp++) {
					firstArrangement[bTmp]=buffReader.readLine().split(" ", 4);
					if(bTmp==firstChoice)
						highCards=firstArrangement[bTmp];	
				}
				
				if(highCards==null) {
					buffWriter.write("Case #"+tcIndex+": Invalid choice by volunteer");
					continue;
				}
				// Second choice
				secondChoice=Integer.parseInt(buffReader.readLine())-1;	//	Second choice
				
				secondArrangement=new String[4][4];
				
				for(byte bTmp=0;bTmp<4;bTmp++)
					secondArrangement[bTmp]=buffReader.readLine().split(" ", 4);
				
				result=null;
				tempList=new ArrayList<String>(Arrays.asList(secondArrangement[secondChoice]));
				for(byte cTmp=0;cTmp<4;cTmp++) {
					
					if(result==null) {
						if(tempList.indexOf(highCards[cTmp])!=-1) {
							result="Case #"+tcIndex+": "+highCards[cTmp];	// check if contains exactly one high card per row
							tempList.remove(highCards[cTmp]);
						}
					}
					else if(tempList.indexOf(highCards[cTmp])!=-1) {
						result="Case #"+tcIndex+": Bad magician!";
						break;
					}
				}
				if(result==null)
					result="Case #"+tcIndex+": Volunteer cheated!";
				
				buffWriter.write(result);
				buffWriter.newLine();
				buffWriter.flush();
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(buffReader!=null)	buffReader.close();
				if(buffWriter!=null)	buffWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				buffReader=null;
				buffWriter=null;
			}
			
			testCases=null;
			firstArrangement=null;
			secondArrangement=null;
			highCards=null;
			result=null;
			tempList=null;
		}
	}
}
