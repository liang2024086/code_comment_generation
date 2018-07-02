package methodEmbedding.Magic_Trick.S.LYD798;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.TreeSet;
import java.io.PrintWriter;


public class Magic {
    public static void main (String[] args){
        Path path = Paths.get("A-small-attempt2.in");
        PrintWriter out = null;


        try {

            out=new PrintWriter("output.txt");;
            ArrayList<String> rows= (ArrayList<String>) Files.readAllLines(path, StandardCharsets.UTF_8);

//            for (String row:rows){
//                System.out.println(row);
//            }

            int jumlahKasus=Integer.parseInt(rows.get(0));

            int i=1;
            for (int iKasus=0;iKasus<jumlahKasus;iKasus++){
//            while (i<rows.size()){
                int jawaban1=Integer.parseInt(rows.get(i++));

                TreeSet<Integer> prob1=new TreeSet<>();
                for (int j=1; j<5; j++){
                    String rowLine=rows.get(i++);

                    if (j==jawaban1){
                        String[] arrRow=rowLine.split(" ");
//                        System.out.println(rowLine);
                        for (String ss:arrRow){
                            prob1.add(Integer.parseInt(ss));
                        }
                    }
                }

                int jawaban2=Integer.parseInt(rows.get(i++));
//                System.out.println("jawaban 2="+jawaban2);

                ArrayList<Integer> jawaban=new ArrayList<>();
                for (int j=1; j<5; j++){
                    String rowLine=rows.get(i++);

                    if (j==jawaban2){
                        String[] arrRow=rowLine.split(" ");
//                        System.out.println(rowLine);
                        for (String ss:arrRow){
                            int k=Integer.parseInt(ss);
                            if (prob1.contains(k)){
                                jawaban.add(k);
                            }
                        }
                    }
                }

                if (jawaban.size()==1){
                    out.println(String.format("Case #%s: %s", iKasus+1, jawaban.get(0)));
                }else if (jawaban.size()>1){
                    out.println(String.format("Case #%s: Bad magician!", iKasus+1));
                }else{
                    out.println(String.format("Case #%s: Volunteer cheated!", iKasus+1));
                }
            }

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
