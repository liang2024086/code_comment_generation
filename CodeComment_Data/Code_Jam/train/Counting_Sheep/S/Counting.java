package methodEmbedding.Counting_Sheep.S.LYD1173;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;


public class Counting {
	public static void main(String[] args) throws Throwable {
		File file = new File("A-small-attempt0.in");
		PrintWriter writer = new PrintWriter("op.txt", "UTF-8");
		BufferedReader reader = new BufferedReader(new FileReader(file));
	    String text = null;
	    int t = Integer.parseInt(reader.readLine());
	    for(int k=1;k<=t;k++){
		    int num = Integer.parseInt(reader.readLine());
		    boolean check[] = new boolean[10];
		    int ans = 0;
	    	boolean flag = true;
		    for(int i=1;i<1000000;i++){
		    	if(num ==0){
		    		flag=false;
		    		break;
		    	}
		    	int newnum = num*i;
		    	ans = newnum;
		    	while (newnum > 0) {
		    	    check[newnum % 10]=true;
		    	    newnum = newnum / 10;
		    	}
		    	flag = true;
		    	for(int j=0;j<10;j++)
		    		if (!check[j]){
		    			flag = false;
		    			break;
		    		}
		    	if(flag)break;
		    }
		    
		    if(flag){
		    	writer.println("Case #"+k+": "+ans);
		    	System.out.println("Case #"+k+": "+ans);

		    }
		    else{
		    	writer.println("Case #"+k+": INSOMNIA");
		    	System.out.println("Case #"+k+": INSOMNIA");
		    }
	    }
	    writer.close();

	   
	}
}
