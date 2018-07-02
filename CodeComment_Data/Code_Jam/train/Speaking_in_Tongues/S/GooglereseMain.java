package methodEmbedding.Speaking_in_Tongues.S.LYD1330;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: ganga
 * Date: 4/14/12
 * Time: 7:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class GooglereseMain {
    public static void main(String[] args) {
        try{
            FileInputStream fstream = new FileInputStream("/home/ganga/Downloads/A-small-attempt2.in");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            strLine = br.readLine();
            Integer noOfCases = Integer.valueOf(strLine);
            Googlerese googlerese = new Googlerese();
            int i = 0;
            while(i < noOfCases) {
               String line = br.readLine();
                int length = line.length();
                StringBuilder sb = new StringBuilder(length);

                for(int count=0; count< length;count++){
                    String i1 = line.substring(count,count+1);
                    sb.append(googlerese.mapping.get(i1));
               }
                i++;
                System.out.println("Case #"+i+": " +  sb.toString());
            }
        }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

    }
}
