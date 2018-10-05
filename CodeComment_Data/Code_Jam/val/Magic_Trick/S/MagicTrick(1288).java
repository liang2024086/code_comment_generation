package methodEmbedding.Magic_Trick.S.LYD2196;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;


public class MagicTrick {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream("/Users/ashwinjain/Downloads/codejam/magictrick_small.txt")));
		int cases = Integer.parseInt(br.readLine());
		
		for(int xx=0;xx<cases;xx++){
            int r1 = Integer.parseInt(br.readLine().trim());

            ArrayList<String> selection1 = new ArrayList<String>();
            for(int i=1;i<=4;i++){
                String[] t = br.readLine().split(" ");
                if(r1==i){
                    for(int j=0;j<t.length;j++)
                        selection1.add(t[j]);
                }
            }

            int r2 =  Integer.parseInt(br.readLine().trim());
            ArrayList<String> selection2 = new ArrayList<String>();
            for(int i=1;i<=4;i++){
                String[] t = br.readLine().split(" ");
                if(r2==i){
                    for(int j=0;j<t.length;j++)
                        selection2.add(t[j]);
                }
            }

            ArrayList<String> matched = new ArrayList<String>();
            for(int i=0;i<selection1.size();i++){
                if(selection2.contains(selection1.get(i))){
                    matched.add(selection1.get(i));
                }
            }

            if(matched.size() == 0)
                System.out.printf("Case #%d: %s\n",(xx+1),"Volunteer cheated!");
            else if(matched.size() == 1)
                System.out.printf("Case #%d: %s\n",(xx+1),matched.get(0));
            else
                System.out.printf("Case #%d: %s\n",(xx+1),"Bad magician!");
		}
		
	}
}
