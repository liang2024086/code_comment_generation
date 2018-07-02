package methodEmbedding.Revenge_of_the_Pancakes.S.LYD993;


import java.io.IOException;

/**
 * Created by hugoloza on 4/9/16.
 */
public class BRevengePancakes extends ContestWrapper {
    public BRevengePancakes(String[] args) {
        super(args);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        BRevengePancakes contestClass = new BRevengePancakes(args);
        String line, message;

        int T, i, j;


        try {
            T=Integer.parseInt(contestClass.getLine());
            if(!((T>=1)&&(T<=100))) throw new Exception("T ...");
            i=0;
            while((line=contestClass.getLine()) != null){
                i++;
                j=0;
                do {
                    if (line.lastIndexOf("-") >= 0) {
                        j++;
                        line=line.substring(0, line.lastIndexOf("-") + 1).replaceAll("\\+", "*").replaceAll("-", "+").replaceAll("\\*", "-")+line.substring(line.lastIndexOf("-") + 1);
                    }
                }while(line.lastIndexOf("-") >= 0);

                message = "Case #"+i+": "+j;

                //System.out.println(message);

                contestClass.addLine(message);
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
