package methodEmbedding.Speaking_in_Tongues.S.LYD19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class ASmall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String s2="our language is impossible to understand";
		String s3="rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		String s4="there are twenty six factorial possibilities";
		String s5="de kr kd eoya kw aej tysr re ujdr lkgc jv";		
		String s6="so it is okay if you want to just give up";
		ArrayList<String> stringArray= new ArrayList<String>();
		stringArray.add(s1);
		stringArray.add(s2);
		stringArray.add(s3);
		stringArray.add(s4);
		stringArray.add(s5);
		stringArray.add(s6);
		
		Map<String, String> dictionary = new TreeMap<String, String>();
		dictionary.put("q", "z");
		dictionary.put("y", "a");
		dictionary.put("z", "q");
		for(int i=0; i<stringArray.size()-1;i=i+2)
		{
			for(int j=0;j<stringArray.get(i).length()-3;j++)
			{
			dictionary.put(stringArray.get(i).charAt(j)+"", stringArray.get(i+1).charAt(j)+"");
			}
		}
		System.out.println(dictionary.size());
		System.out.println(dictionary);
		Scanner myScanner = null;
		int counter=1;
		try {
			 myScanner = new Scanner(new File("input.in"));
			 myScanner.nextLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(myScanner.hasNextLine())
		{
			String tempLine = myScanner.nextLine();
			String tempConverted="";
			for(char tempChar: tempLine.toCharArray())
			{
				tempConverted+=dictionary.get(tempChar+"");
			}
			System.out.println("Case #"+counter +": "+tempConverted);
			counter++;
			
		}
		
	}

}
