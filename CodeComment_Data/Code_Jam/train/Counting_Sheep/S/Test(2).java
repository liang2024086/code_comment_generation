package methodEmbedding.Counting_Sheep.S.LYD481;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohammad Jamel
 */
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        Integer line=Integer.parseInt(in.readLine());
        for (int i = 0; i < line; i++) {
            int x=Integer.parseInt(in.readLine());
            HashSet<Integer>list=new HashSet<>();
            long j=1;
            if(x==0){
                System.out.println("Case #"+(i+1)+": INSOMNIA");
                continue;
            }
            long out=0;
            while(list.size()!=10){
                out=x*j;
                j++;
                for (int k = 0; k < (out+"").length(); k++) {
                    list.add(((String.valueOf(out)).charAt(k))-'0');
                }
                if(list.size()==10){
                    System.out.println("Case #"+(i+1)+": "+out);
                    break;
                }
            }
        }
            
    }
}
