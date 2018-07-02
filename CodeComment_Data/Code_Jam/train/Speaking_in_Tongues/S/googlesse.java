package methodEmbedding.Speaking_in_Tongues.S.LYD1140;


import java.util.*;

public class Googlesse {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Hashtable translator = new Hashtable();
		List<String> firstList = new ArrayList<String>();
		List<String> secondList = new ArrayList<String>();
		String firstLine = "ejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jv";
		String secondLine = "our language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give up";
		for(int i = 0; i<firstLine.length();i++){
			firstList.add(""+firstLine.charAt(i));
			secondList.add(""+secondLine.charAt(i));
		}
		List<String> repeatedList = new ArrayList<String>();
		translator.put("z","q");
		translator.put("q","z");
		for(int i = 0; i<firstLine.length();i++){
			if(!repeatedList.contains(firstList.get(i))){
				translator.put(firstList.get(i), secondList.get(i));
			}
			repeatedList.add(firstList.get(i));
		}
		int testCase = Integer.parseInt(sc.nextLine());
		for(int i = 0;i<testCase;i++){
			int caseCount = i+1;
			String line = sc.nextLine();
			System.out.print("Case #"+caseCount+": ");
			for (int j = 0;j<line.length();j++){
				String c = ""+line.charAt(j);
				String t = (String) translator.get(c);
				System.out.print(t);
			}
			System.out.println();
		}
	}
}
