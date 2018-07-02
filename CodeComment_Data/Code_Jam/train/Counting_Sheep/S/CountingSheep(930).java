package methodEmbedding.Counting_Sheep.S.LYD1567;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class CountingSheep {

	public static void main(String[] args) {
		// The name of the file to open.
        String fileName = "C:\\Users\\nicks\\Downloads\\A-small-attempt0.in";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            int i =1;
            while((line = bufferedReader.readLine()) != null) {
                if(i==1){
                	i++;
                	continue;           
                }else{
                	Map<Long,Integer> count = new HashMap<>();
                	long x = Long.valueOf(line);
                	if(x==0){
                		System.out.println("Case #" + (i-1) +": INSOMNIA");
                	}else{
                		long mult = 0;
                		long next=x;
                		int cnt=0;
                		while(cnt<10){
                			mult++;
                			next=x*mult;
                			while(next!=0){
                				if(!count.containsKey(next%10)){
                					cnt++;
                					count.put(next%10, 1);
                				}
                				next=next/10;
                			}
                		}
                		System.out.println("Case #" + (i-1) +": "+x*mult);
                	}
                	i++;
                }
            }   

            // Always close files.
            bufferedReader.close();         
        }catch(Exception e){
        	
        }

	}

}
