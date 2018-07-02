package methodEmbedding.Standing_Ovation.S.LYD2018;


import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\aschonfe\\Desktop\\tmp.out"));
        String firstLine = scan.nextLine();
        Boolean isFile = !Character.isDigit(firstLine.charAt(0));
        int T;
        if(isFile){
            scan = new Scanner(new FileReader(firstLine));
            T = scan.nextInt();
        }else{
            T = Integer.parseInt(firstLine);
        }
        for(int t=1;t<=T;t++){
            int Smax = scan.nextInt();
            String shyness_level_str = scan.next();
            int[] shyness_levels = new int[Smax+1];
            for(int s=0;s<=Smax;s++){
            	shyness_levels[s] = Character.getNumericValue(shyness_level_str.charAt(s));
            }
            
            int total_friends = 0;
            int total = 0;
            for(int i=0;i<=Smax;i++){
            	int Si = shyness_levels[i];
            	if(total < i){
            		int friends = i - total;
            		total_friends += friends;
            		total += friends;
            	}
            	total += Si;
            }

            System.out.printf("Case #%d: %d%n", t, total_friends);
            out.write(String.format("Case #%d: %d%n", t, total_friends));
        }
        if(isFile){
            scan.close();
        }
        out.close();
    }
}
