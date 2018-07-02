package methodEmbedding.Cookie_Clicker_Alpha.S.LYD815;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;


public class Main {
    public static void main(String args[]){
        BufferedReader br = null;
        int inputCount=0;

        try {

            String sCurrentLine;
            br = new BufferedReader(new FileReader("input.txt"));

            //reading first line
           // br.readLine();

            if((sCurrentLine = br.readLine()) != null) {
                inputCount = Integer.parseInt(sCurrentLine);
            }

            for(int i=0;i<inputCount;i++){
                String[] inputs = br.readLine().split(" ");
                double c = Double.parseDouble(inputs[0]);
                double f = Double.parseDouble(inputs[1]);
                double x= Double.parseDouble(inputs[2]);
                //System.out.println();

                double currentTime=0;
                double currentRate =2;

                double moreToGet = x;

                if(x>c){
                    moreToGet = x-c;
                }
                int increments=0;

                while(true){


                    if(moreToGet/currentRate<x/(currentRate+f)){
                        break;
                    }
                    if(x==moreToGet){
                        break;
                    }




                    increments++;
                    currentTime =currentTime+ c/currentRate;
                  //  System.out.println(c/currentRate);
                    currentRate=currentRate+f;
                }
               // System.out.println(currentTime);

               // System.out.println(currentTime+(x/currentRate));
                int casenumber = i+1;
                DecimalFormat df = new DecimalFormat("#.0000000");
                System.out.println("Case #"+casenumber+": "+df.format(currentTime+(x/currentRate)));

            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}

