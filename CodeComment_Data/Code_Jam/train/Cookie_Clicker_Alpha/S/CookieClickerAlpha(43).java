package methodEmbedding.Cookie_Clicker_Alpha.S.LYD150;


import java.io.*;
import java.util.HashSet;


public class CookieClickerAlpha {

    public static void main(String[] args){
        BufferedReader buffer = null;
        BufferedWriter bw = null;

        try{
            buffer = new BufferedReader(new FileReader("D:\\jam\\B-small-attempt0.in"));
            File file = new File("D:\\jam\\B-small-attempt02.out");
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
                    String[] params = line.split(" ");
                    double initialSpeed = 2.0;
                    double C = Double.parseDouble(params[0]);
                    double F = Double.parseDouble(params[1]);
                    double X = Double.parseDouble(params[2]);

                    double start = 0;
                    double newSpeadTime = 0;
                    double oldSpeadTime = 0;
                    double oldSpead = initialSpeed;
                    double newSpead = 0.00;
                    do{
                        if(oldSpeadTime > newSpeadTime){
                            start += C/oldSpead;
                            oldSpead = oldSpead+F;
                        }
                        oldSpeadTime = start + X/oldSpead;
                        newSpeadTime = start + C/oldSpead+X/(oldSpead+F);
                    }while(newSpeadTime<oldSpeadTime);

                    double result = (newSpeadTime<oldSpeadTime)?newSpeadTime:oldSpeadTime;

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

    //public static double

}
