package methodEmbedding.Magic_Trick.S.LYD863;


import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class MagicTrick {

    public static void main(String[] args){
        BufferedReader buffer = null;
        BufferedWriter bw = null;

        try{
            buffer = new BufferedReader(new FileReader("D:\\jam\\B-small-practice.in"));
            File file = new File("D:\\jam\\B-small-practice.out");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            bw = new BufferedWriter(fw);

            String line = buffer.readLine();
            if(line != null ){
                Integer caseCount = Integer.parseInt(line);
                if(caseCount <0 || caseCount > 10000000) {System.out.println("incorrect case Count"); return;}
                for(int i=1; i<= caseCount; i++ ){
                    StringBuffer output = new StringBuffer();
                    line = buffer.readLine();
                    int selectedLine = Integer.parseInt(line);
                    HashSet<String> lineSet = new HashSet<String>();

                    for(int j=0; j< 4; j++){
                        line = buffer.readLine();
                        if((j+1) == selectedLine ){
                            String[] cardMap = line.split(" ");
                            for(String str: cardMap){
                                lineSet.add(str);
                            }
                        }
                    }

                    String result = null;
                    line = buffer.readLine();
                    selectedLine = Integer.parseInt(line);
                    for(int j=0; j< 4; j++){
                        line = buffer.readLine();
                        if((j+1) == selectedLine ){
                            String[] cardMap = line.split(" ");
                            for(String str: cardMap){
                                if(lineSet.contains(str)){
                                    if(result == null) result = str;
                                    else result = "Bad magician!";
                                }
                            }
                        }
                    }

                    if(result == null) result = "Volunteer cheated!";

                    output.append("Case #"+i+": "+result+"\n");
                    bw.write(output.toString());
                }

            }
        }
        catch(IOException e){
             e.printStackTrace();
        }
        finally {
            try {

            if (buffer != null) buffer.close();
            if (bw != null) bw.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }


        }
    }

}
