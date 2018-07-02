package methodEmbedding.Counting_Sheep.S.LYD1296;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class CountingSheeps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter =1;
		Scanner inpu = new Scanner(System.in);
		int ite = inpu.nextInt();
		while (counter <= ite)
		{
		int number = inpu.nextInt()  ;
		int number_comp=number ;
		int power  =  0 ;
		int dinomi =  0 ;
		int quo    =  0 ;
		int remi   =  0 ;
		int lastNum=  1 ;
		int unwanted = 0 ;
		
		List<String> StringCollectionNumber = new ArrayList<String>();
		
		
		String listColString = new String();
		String format        = "0,1,2,3,4,5,6,7,8,9";
		
		
		while(!format.equals(listColString) && number_comp != 0)
		{
			
				
			String numberString = number_comp+"";
			power        = numberString.length()-1;
			for (int i = 0; i < numberString.length(); i++) {
				
				dinomi = (int)Math.pow(10, power);
				quo    =  number_comp / dinomi ;
				remi   =  number_comp % dinomi ;
				number_comp = remi ;
				power -- ;
				
				if(StringCollectionNumber.contains(quo+""))
					unwanted = quo ;
				else
				{
					StringCollectionNumber.add(quo+"");
				}
				Collections.sort(StringCollectionNumber);
			}
			listColString = String.join(",",StringCollectionNumber);
			lastNum = (lastNum+1);
			number_comp = lastNum*number;
		}
		if(number_comp == 0)
		{
			System.out.println("Case #"+(counter)+":"+" INSOMNIA");
			counter ++;
			continue;
		}
		System.out.println("Case #"+(counter)+":"+" "+(lastNum-1)*number);
		counter ++;
	}
	}
}
	
