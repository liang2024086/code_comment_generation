package methodEmbedding.Standing_Ovation.S.LYD2006;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CodeJam1 {

    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        CodeJam1 t = new CodeJam1();
        ArrayList<String> lines = new ArrayList<String>();
        String[] num;
        FileInputStream fStream = new FileInputStream("C:\\Users\\Sandeepa Madhusanka\\Downloads\\A-small-attempt0.in");
        DataInputStream in = new DataInputStream(fStream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        BufferedWriter fw = new BufferedWriter(new FileWriter("C:\\Users\\Sandeepa Madhusanka\\Desktop\\codejam\\output.txt"));
        String readLine;
        while ((readLine = br.readLine()) != null) {
                lines.add(readLine);
        }
        int ans=0;
        for(int x=1;x<lines.size();x++){
            num=lines.get(x).split(" ");
            int sMax=new Integer(num[0]);
            String digits=num[1];
            String[] stringArray=digits.split("");
            int[] intArray=new int[sMax+1];
            int answer=0;
            int people=0;
            for(int i=0;i<sMax+1;i++){
                intArray[i]=new Integer(stringArray[i]);
                    if(people<i&&intArray[i]!=0){
                        answer=answer+i-people;
                        people=people+answer;
                    }
                    people=people+intArray[i];

            }
            
            fw.write("Case #"+x+": "+answer);
            fw.newLine();
            fw.flush();
            System.out.println("Case #"+x+": "+answer);
        }
    }
}
