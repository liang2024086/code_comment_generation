package methodEmbedding.Magic_Trick.S.LYD558;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GoogleMagician {

	private static List<String> resultList = new ArrayList<String>();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = null;
		int testCount = -1;
		int caseNo = 1;
		int fstArrIndx = 0;	
		int sndArrIndx = 0;
		int fstArrNum = -1;
		int sndArrNum = -1;
		String fstArr[][] = new String[4][4];
		String sndArr[][] = new String[4][4];
		while((in=br.readLine())!=null){
			if(testCount == -1){
				testCount = Integer.parseInt(in);
			} else if(fstArrNum == -1){
				fstArrNum = Integer.parseInt(in);
			} else if(fstArrIndx < 4){
				fstArr[fstArrIndx]=in.split(" ");
				fstArrIndx++;
			} else if(sndArrNum == -1){
				sndArrNum = Integer.parseInt(in);
			} else if(sndArrIndx < 4){
				sndArr[sndArrIndx]=in.split(" ");
				sndArrIndx++;
				if(sndArrIndx == 4){
					//get result
					fstArrNum--;
					sndArrNum--;
					int match = 0;
					String matchCard = "";
					for(String each : sndArr[sndArrNum]){
						for(String s : fstArr[fstArrNum]){
							if(each.equals(s)){
								match++;
								matchCard = s;
							}
						}
					}					
					
					if(match == 0){
						resultList.add("Case #"+caseNo+": Volunteer cheated!");
					} else if(match > 1){
						resultList.add("Case #"+caseNo+": Bad magician!");
					} else {
						resultList.add("Case #"+caseNo+": "+matchCard);
					}
					caseNo++;
					if(testCount < caseNo){
						break;
					}
					fstArrIndx = 0;	
					sndArrIndx = 0;
					fstArrNum = -1;
					sndArrNum = -1;
					fstArr = new String[4][4];
					sndArr = new String[4][4];
				}
			}
						
		}
		for(String out: resultList){
			System.out.println(out);
		}
		
	}

}
