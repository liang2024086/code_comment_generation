package methodEmbedding.Counting_Sheep.S.LYD1251;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Mr. SanD on 4/9/2016.
 */
public class Bleatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int noofinput= sc.nextInt();
        ArrayList<String>al=new ArrayList<>();
        String temp="";
        String def="INSOMNIA";
        for (int i=0;i<noofinput;i++){
            int num=sc.nextInt();
            if (num==0){
                al.add(def);
            }
            else{
                TreeSet<String>ts=new TreeSet<>();
                temp="";
                int tempnum=num;
                while(ts.size()<=10){
                    temp=String.valueOf(num);
                    for (int j=0;j<temp.length();j++) {
                        ts.add(String.valueOf(temp.charAt(j)));
                    }
                    if (ts.size()==10){
                        break;
                    }
                    num+=tempnum;
                }
                al.add(String.valueOf(num));
            }
        }
        for(String temp1:al){
            System.out.println(temp1);
        }
    }
}
