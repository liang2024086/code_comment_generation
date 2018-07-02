package methodEmbedding.Cookie_Clicker_Alpha.S.LYD628;

/**
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 * @author Himanshu Jain	erhimanshujain
 *
 */
public class SecondQualifying {
	
	public static void main(String[] args) {
		BufferedReader buffReader=null;
		BufferedWriter buffWriter=null;
		Integer testCases=null;
		String[] tempArray=null;
		double cookieFarmCost;
		double bonusCookiesPerSec;
		double cookieHouse;
		double cookiesPerSec;
		double estCookiesPerSec;
		double totalBuyTime;
		double currentTime;
		double calculatedTime;
		double buyTime;
		double estBuyTime;
		String result;
		DecimalFormat formatter = new DecimalFormat("0.0000000");
		try{
			buffReader=new BufferedReader(new FileReader(new File("C:\\Users\\Himanshu Jain\\Desktop\\CodeJam\\Qualifying2014\\Submission2\\B-small-attempt0.in")));
			buffWriter=new BufferedWriter(new FileWriter(new File("C:\\Users\\Himanshu Jain\\Desktop\\CodeJam\\Qualifying2014\\Submission2\\B-small-attempt0.out")));
			
			// Read the input file
			testCases=Integer.valueOf(buffReader.readLine());	// No. of test cases
			
			for(short tcIndex=1;tcIndex<=testCases;tcIndex++) {
				tempArray=buffReader.readLine().split(" ",3);
				cookieFarmCost=Float.parseFloat(tempArray[0]);
				bonusCookiesPerSec=Float.parseFloat(tempArray[1]);
				
				cookiesPerSec=2;
				calculatedTime=0.00f;
				currentTime=0.00f;
				totalBuyTime=0.00f;
				currentTime=0.00f;
				calculatedTime=0.00f;
				buyTime=0.00f;
				estBuyTime=0.00f;
				result=null;
				estCookiesPerSec=cookiesPerSec;
				
				cookieHouse=Float.parseFloat(tempArray[2]);
				currentTime=cookieHouse/cookiesPerSec;
				
				if(cookieHouse<cookieFarmCost) {
					result="Case #"+tcIndex+": "+formatter.format(currentTime);
					buffWriter.write(result);
					buffWriter.newLine();
					continue;
				}
				
				// buy a house and match calculated time with current time
				
				do {
					buyTime=cookieFarmCost/cookiesPerSec;
					estBuyTime+=buyTime;
					estCookiesPerSec+=bonusCookiesPerSec;
					calculatedTime=estBuyTime+(cookieHouse/estCookiesPerSec);
					currentTime=totalBuyTime+(cookieHouse/cookiesPerSec);
					if(calculatedTime<currentTime) {
						totalBuyTime=estBuyTime;
						cookiesPerSec=estCookiesPerSec;
						currentTime=totalBuyTime+(cookieHouse/cookiesPerSec);
					} else
						break;
				}while(true);
				result="Case #"+tcIndex+": "+formatter.format(currentTime);
				buffWriter.write(result);
				buffWriter.newLine();
				buffWriter.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(buffReader!=null)	buffReader.close();
				if(buffWriter!=null)	buffWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				buffReader=null;
				buffWriter=null;
			}
		}
	}

	/*private static float buyFarm(float farmCost, float bonusCookiesPerSec, float cookiesPerSec, float currentTime, float calculatedTime, float houseCost) {
		
		float buyTime=farmCost/cookiesPerSec;
		return buyTime;
	}*/
}
