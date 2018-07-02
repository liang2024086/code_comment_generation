package methodEmbedding.Standing_Ovation.S.LYD288;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StandingOvation {

    public static void main(String[] args) throws IOException {
		String fileName = "A-small-attempt5";
		BufferedReader in = new BufferedReader(new FileReader(fileName+".in"));
        String str;
        String[] stringArr;
        ArrayList list;
        list = new ArrayList();
        while((str = in.readLine()) != null){
            list.add(str);
        }
        stringArr = (String[]) list.toArray(new String[0]);
		int totalcases, clapping, partsNo, clapped, invNeeded, shyAmt,didntclap=0;
		String[] parts, partsVals;
		totalcases = Integer.parseInt(stringArr[0]);
		PrintWriter writer = new PrintWriter(fileName+".out", "UTF-8");
		for(int i=0; i<totalcases; i++) {
			parts = stringArr[i+1].split(" ");
			partsNo = Integer.parseInt(parts[0]);
			partsVals = parts[1].split("");
			clapping=0;
			clapped=0;
			invNeeded=0;
			for(int j=0; j<=partsNo; j++) {
				shyAmt = Integer.parseInt(partsVals[j+1]);
				if(j==0) {
					clapped+=shyAmt;
					System.out.println(j+":"+clapped);
				} else if((j!=0) && (clapped >= j)) {
					clapped+=shyAmt;
					System.out.println(j+":"+clapped);
				} else {
					if((shyAmt!=0) && ((j-clapped)>invNeeded))
						invNeeded=(j-clapped);
					clapped+=shyAmt;
					System.out.println(j+":"+clapped+":"+invNeeded);
				}
			}
			writer.println("Case #"+(i+1)+": "+invNeeded);
		}
		writer.close();
    }
}
