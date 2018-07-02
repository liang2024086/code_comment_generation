package methodEmbedding.Standing_Ovation.S.LYD1700;

import metrx.util.*;
import java.util.*;
import java.io.*;
public class TestBoard { 

	public static void main(String[] args){
        String filePath = "A-small-attempt3.in";
        String content = "";
        BufferedReader reader = null;
        BufferedWriter writer = null;
        char[][] temp = new char[100][1000];
        int[][] dataset = new int[100][1000];
        int cases = 0;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = "";
            cases = Integer.parseInt(reader.readLine());
            for(int i = 0; i < cases; i++){
                temp[i] = reader.readLine().toCharArray();
              //  System.out.println(temp[i]);
            }
            
            if(reader != null){
                try{
                    reader.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        for(int i = 0; i < cases; i++){
            for(int k = 0; k < temp[i].length; k++){
                if((int)temp[i][k] != 32){
                    dataset[i][k] = Integer.parseInt(""+temp[i][k]);
                }else{
                    dataset[i][k] = 0;
                }
            //    System.out.print(dataset[i][k]);
            }
         //   System.out.println();
        }
        try{
        writer = new BufferedWriter(new FileWriter("2.txt"));
        } catch(Exception e){
            e.printStackTrace();
        }
        
        try{
            for(int i = 0; i < cases; i++){
                int maxShyLvl = dataset[i][0];
                int Friends = 0;
                int AllAudience = dataset[i][2];
                    for(int k = 1; k <= maxShyLvl; k++){
                        if(dataset[i][k+2] != 0){
                           if(k-AllAudience > 0){
                                Friends += k-AllAudience;
                                AllAudience += k-AllAudience;
                                AllAudience += dataset[i][k+2];
                            }
                            else{
                                    AllAudience += dataset[i][k+2];
                            }
                                             System.out.println(AllAudience);
                             System.out.println(Friends);  
                        }                    
                    }
                    writer.write("Case #"+ (i+1) + ": "+Friends);
                    writer.newLine();        
                    System.out.println(AllAudience);
                    System.out.println(Friends);  
                    System.out.println();
                    
            }
            writer.flush();
        } catch(Exception e){
            e.printStackTrace();
        }
        
        if(writer != null){
                try{
                    writer.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
        }
        
        
	}
}
