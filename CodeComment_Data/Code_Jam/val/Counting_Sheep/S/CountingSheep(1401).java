package methodEmbedding.Counting_Sheep.S.LYD1004;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Alona on 09.04.2016.
 */
public class CountingSheep {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "D:\\A-small-attempt0.in";
        String fileNameOut = "D:\\A-small-attempt0OUT.out";

        //StringBuilder sb = new StringBuilder();
        File file = new File(fileName);
        FileWorker.exists(fileName);

        try {
            //???????????? ?????? ???????????? ?????????? ?? ??????????
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                //?? ?????????? ?????????????????? ?????????????????? ????????
                String s;
                Integer num=0, N=0;
                String firstLine = in.readLine();
                Integer n = Integer.parseInt(firstLine); //n-????????????????????
                StringBuilder sb1 = new StringBuilder();
                for (int i = 1; i <= n; i++) {
                    sb1.append("Case #"+ i +": ");
                    if ((s = in.readLine()) != null){
                        num = Integer.parseInt(s); // num=N
                        N=num;
                        ArrayList<Integer> digits = new ArrayList<Integer>();
                        for (int j = 0; j < 10; j++) {
                            digits.add(j);
                        }
                        int counter=0;
                        int Nuuum = num;
                        while ((digits.size()>0) && (counter<Integer.MAX_VALUE)) {
                            num=(++counter)*N;
                            Nuuum = num;
                            while(Nuuum>0){
                                int last = Nuuum%10;
                                Nuuum=Nuuum/10;
                                for(Integer nuum1: digits)
                                    if(nuum1==last) {
                                        digits.remove(nuum1);
                                        break;
                                    }
                            }
                        }
                        if(digits.size()==0)
                        {
                            sb1.append(num);
                            sb1.append('\n');
                        }else{
                            sb1.append("INSOMNIA"+'\n');
                        }

                    }
                }
                String res = sb1.toString();
                FileWorker.write(fileNameOut,res);
            } finally {
                //?????????? ???? ???????????????? ?????????????? ????????
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
