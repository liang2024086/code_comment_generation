package methodEmbedding.Magic_Trick.S.LYD1427;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Magician{
	//Scanner sc;
    //PrintWriter pw;
    /*static void err(Object o) {
        System.err.println(o.toString());
    }
    void err2(Object o) {
        System.err.print(o.toString());
    }
    static void out(String s) {
        pw.println(s);
       // err(o);
    }
    void out2(Object o) {
        pw.print(o.toString());
        err2(o);
    }*/
	public static void main(String[] args) {
		int[] multi = new int[4];
		int[] multi2 = new int[4];
		int j,k,m,n,match=0;
		int counter=0;
		int cases=1;
		int testcase=0;
		int nomatch=0;
		int choice=0;
		String[] str=null;
				int cout=0;;
    File file = new File("C:\\Users\\Devanshu\\Desktop\\codejam\\input.in");

    try {
    	PrintWriter pw = new PrintWriter(new File("C:\\Users\\Devanshu\\Desktop\\codejam\\output.txt"));
    	Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
        	 String i = sc.nextLine().trim();
        	if(testcase!=0){

            if(i.contains(" ")){

            if(counter==(choice-1)){
            	//System.out.println(i);
            	str[cout]=i;
            	cout++;


            }
            	counter++;

            	//System.out.println(counter);
            }
            else{
            choice=Integer.parseInt(i);
            counter=0;

            }
            ////////operation begins


        }
        	else{
        		str=new String[(Integer.parseInt(i))*2];
        	}
        //sc.close();
        	testcase++;
        }
        for(k=0;k<cout;k+=2){
        	System.out.println(k+"->"+str[k]);
        	System.out.println((k+1)+"->"+str[k+1]);
        	nomatch=0;
        	/*if(str[k].equalsIgnoreCase(str[k+1])){
        		//pw.write("Case #"+k+": Bad magician!");
        		pw.println("Case #"+(cases++)+": Bad magician!");

        	}*/
        		String[]temp=str[k].trim().split("\\s");
        		String[]temp2=str[k+1].trim().split("\\s");

        		for(m=0;m<4;m++){
        			for(n=0;n<4;n++){
        			if(Integer.parseInt(temp[m])==Integer.parseInt(temp2[n])){
        				//pw.write("Case #"+k+": "+temp[m]);
        				match=Integer.parseInt(temp[m]);
        				nomatch++;
        			}
        			}
        		}
        		if(nomatch==0){
        			//pw.write("Case #3: Volunteer cheated!");
        			pw.println("Case #"+(cases++)+": Volunteer cheated!");
        		}

        		else if(nomatch==1){
        			pw.println("Case #"+(cases++)+": "+match);
        		}
        		else{
        			pw.println("Case #"+(cases++)+": Bad magician!");
        		}

        	//System.out.println(str[k]);
        }
        System.out.println(cout);
        sc.close();
        pw.close();
    }
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }

 }
}
