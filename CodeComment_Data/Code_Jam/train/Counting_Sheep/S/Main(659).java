package methodEmbedding.Counting_Sheep.S.LYD1711;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            String allDigits = "0123456789";
            String inputStr = br.readLine();
            int input = Integer.parseInt(inputStr);
            boolean isInsomnia = true;
            int lastNum = input;
            for(int j=1; j<1000; j++){
                lastNum = input * j;
                for(Character c : Integer.toString(lastNum).toCharArray()){
                    allDigits = allDigits.replace(String.valueOf(c), "");
                }
                if(allDigits.isEmpty()){
                    isInsomnia = false;
                    break;
                }
            }
            if(isInsomnia)
                System.out.println("Case #"+(i+1)+": INSOMNIA");
            else
                System.out.println("Case #"+(i+1)+": " + lastNum);
        }
    }
}
