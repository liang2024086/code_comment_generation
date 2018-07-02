package methodEmbedding.Standing_Ovation.S.LYD618;

// Google Code Jam Qualification Round 2015
// Problem Problem A. Standing Ovation

import java.util.*;
import java.io.*;

class StandingOvation{
    static String inname = "A-small-attempt0.in";    // input file name here
    static String outname = "A-small-attempt0.out";  // output file name here
    static int n;
    public static void main(String[] args){
        try{
            Scanner in = new Scanner(new BufferedReader(new FileReader(inname)));
        	//Scanner in = new Scanner(System.in);
            BufferedWriter out = new BufferedWriter(new FileWriter(outname));
            int t = in.nextInt();
            in.nextLine();
            for (int cas = 1; cas <= t; cas++){
            	int ans = 0;
            	int sum = 0;
            	int n = in.nextInt()+1;
            	String aud = in.next();
            	for (int i = 0; i < n; i++){
            		//System.out.println(i + " " + sum + " " + ans);
            		if (aud.charAt(i) > '0'){
            			if (sum < i){
            				int inv = i-sum;
            				ans += inv;
            				sum += inv;
            			}
            		}
            		sum += aud.charAt(i)-'0';
            	}
                //System.out.println(n + " " + aud);
                //System.out.print("Case #" + cas + ": " + ans + "\n");
                out.write("Case #" + cas + ": " + ans + "\n");
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
