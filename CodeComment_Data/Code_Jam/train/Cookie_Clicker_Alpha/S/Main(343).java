package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1562;


/*
ID: zhing
LANG: JAVA
PROG: cowtour
*/
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;



class Main {
	
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader f = new BufferedReader(new FileReader("B-small-attempt0.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("B-small-attempt0.out")));
        //StringTokenizer st = new StringTokenizer(f.readLine());
        Scanner reader = new Scanner(f);
        //int i1 = Integer.parseInt(st.nextToken());    // first integer
        //int i2 = Integer.parseInt(st.nextToken());    // second integer
        //out.println(i1+i2);                           // output result
        
        int T = reader.nextInt();
        int mux = 10000000;
        List<Long> ls=new ArrayList<Long>();
        //List<Long> lresult = new ArrayList<Long>();
        for(int i=1;i<=T;i++){
        	double C=reader.nextDouble();
        	double X=reader.nextDouble();
        	double F=reader.nextDouble();
        	//System.out.println(C+" "+X+" "+F);
        	ls.clear();ls.add((long)0);
        	//lresult.clear();lresult.add((long)((F/X)*mux));
        	int count=1;long lastresult=(long)((F/2)*mux);
        	for(;;){
        		long p = (long)Math.round((double)((C/(2+(count-1)*X))*mux));
        		long q = (long)Math.round((double)((F/(2+count*X))*mux));
        		//System.out.println(p+" "+q);
        		long result = ls.get(count-1)+p+q;
        		if(result>=lastresult){
        			//System.out.println(result/mux);
        			break;
        		}else{
        			ls.add(ls.get(count-1)+p);
        			count++;
        			lastresult=result;
        		}
        	}
        	double result=(double)lastresult/mux;
        	DecimalFormat df  = new DecimalFormat("###.0000000");
        	out.println("Case #"+i+": "+df.format(result));
        }
        
        out.close();
        System.exit(0);
    }

}







