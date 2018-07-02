package methodEmbedding.Cookie_Clicker_Alpha.S.LYD310;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shashank
 */
public class minesweep {
    public static void main(String arg[]) throws FileNotFoundException, IOException
    {
        File f=new File("input.in");
        File f1=new File("result.out");
        BufferedReader buffer=new BufferedReader(new FileReader(f));
        BufferedWriter writer=new BufferedWriter(new FileWriter(f1));
        int count=1;
        int s=Integer.parseInt(buffer.readLine());
        while(count!=s+1)
        {   ArrayList list=new ArrayList();
            String str[]=buffer.readLine().split(" ");
            BigDecimal farm=new BigDecimal(str[0]);
            BigDecimal rate=new BigDecimal(str[1]);
            BigDecimal achieve=new BigDecimal(str[2]);
            BigDecimal initial=new BigDecimal(2);
            BigDecimal first=achieve.divide(initial,7,RoundingMode.HALF_UP);
            BigDecimal t1=farm.divide(initial,7,RoundingMode.HALF_UP);
            list.add(t1);
            initial=initial.add(rate);
            BigDecimal tt=achieve.divide(initial,7,RoundingMode.HALF_UP);
            BigDecimal t2=t1.add(tt);
            boolean counter=true;
            while(counter==true)
            {
            int res=t2.compareTo(first);
            
            
            if(res== 1 || res==0)
            {
            writer.write("Case #"+count+": "+first);
            writer.newLine();
            counter=false;
            }
            else
            {
            first=t2;
            t1=farm.divide(initial,7,RoundingMode.HALF_UP);
            list.add(t1);
            initial=initial.add(rate);
            BigDecimal rou=new BigDecimal(0);
            for(int x=0;x<list.size();x++)
            {
            rou=rou.add((BigDecimal) list.get(x));
            }
            tt=achieve.divide(initial,7,RoundingMode.HALF_UP);
            t2=rou.add(tt);
            }
            }
            
        count=count+1;
        }
    
        buffer.close();
        writer.close();
    }
    
}
