package methodEmbedding.Counting_Sheep.S.LYD1092;


import java.io.*;

/**
 * Created by noMoon on 2016-04-08.
 */
public class CountingSheep {
    public static void main(String[] args) throws Exception{
        File file = new File("A-small-attempt0.in.txt");
        File outputFile = new File("CountingSheep.out");
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line = br.readLine();
        int t=Integer.parseInt(line);
        int[] numberMap=new int[10];
        numberMap[0]=1;
        for(int i=1;i<10;i++){
            numberMap[i]=numberMap[i-1]*2;
        }
        int numberOfTestCases=0;
        while(numberOfTestCases<t){
            bw.write("Case #" + String.valueOf(numberOfTestCases + 1) + ": ");
            boolean[] numberFlag=new boolean[10];
            for(int i=0;i<10;i++){
                numberFlag[i]=true;
            }
            int n=Integer.parseInt(br.readLine());
            if(n==0){
                bw.write("INSOMNIA");

            }else{
                int flag=0;
                int m=n;
                while(flag!=1023){
                    String number=String.valueOf(m);
                    for(char ch:number.toCharArray()){
                        int singleNumber=ch-'0';
                        if(numberFlag[singleNumber]){
                            flag+=numberMap[ch-'0'];
                            numberFlag[singleNumber]=false;
                        }
                    }
                    m+=n;
                }
                bw.write(String.valueOf(m-n));

            }

            bw.newLine();
            numberOfTestCases++;
        }
        br.close();
        bw.close();

    }
}
