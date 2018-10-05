package methodEmbedding.Counting_Sheep.S.LYD985;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;


public class CodeJamSample {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\manee\\Downloads\\A-large-practice.in"));
        StringTokenizer st= new StringTokenizer(br.readLine()); 
        long t = Integer.parseInt(st.nextToken());
        for(long i=0; i<t; i++)
        {
        ArrayList Ar = new ArrayList();
        Ar.add("0");
        Ar.add("1");
        Ar.add("2");
        Ar.add("3");
        Ar.add("4");
        Ar.add("5");
        Ar.add("6");
        Ar.add("7");
        Ar.add("8");
        Ar.add("9");

        st= new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long x = 1;
        if(n == 0)
            System.out.println("Case #"+(i+1) +": " +"INSOMNIA");
        else{  
        while(Ar.size() > 0)
        {
        String temp = Long.toString((n*x));
        char c[] = temp.toCharArray();
        for (int j = 0; j < c.length; j++)
            {
                try{
                    Ar.remove(Character.toString(c[j]));
                }catch(Exception e){
                }
            }
        if(Ar.size() == 0)
            System.out.println("Case #"+(i+1) +": " + (n*x));
        x++;
        }
        }
        }
    }
    
}
