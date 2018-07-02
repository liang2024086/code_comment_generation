package methodEmbedding.Revenge_of_the_Pancakes.S.LYD842;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FlipCake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = null;
		try {
			scan = new Scanner(new File("B-small-attempt0.in"));
			//scan = new Scanner(System.in);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int t=0,bitSize;
		BigInteger currentId,tId,mask;
		//int[] visit = null;
		HashMap<BigInteger,Integer> visit; 
		Queue<BigInteger> searchQueue=new LinkedList<BigInteger>();
		String init_state,writeString;
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("output");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter bw = new BufferedWriter(fw);
		
		t=Integer.parseInt(scan.next());
		for(int i=0;i<t;i++){
			searchQueue=new LinkedList<BigInteger>();
			init_state=scan.next();
			bitSize=init_state.length();
			//System.out.println(1<<(bitSize));
			//visit=new int[(1<<(bitSize+1))];
			visit=new HashMap<BigInteger,Integer>();
			/*for(int j=0;j<(1<<(bitSize+1));j++){
				visit[j]=-1;
			}*/
			currentId=new BigInteger("0");
			for(int j=0;j<bitSize;j++){
				currentId=currentId.shiftLeft(1);
				if(init_state.charAt(j)=='+'){
					currentId=currentId.add(new BigInteger("1"));
				}
			}
			//System.out.println(currentId);
			searchQueue.add(currentId);
			//visit[currentId]=0;
			visit.put(currentId, 0);
			while(searchQueue.size()!=0){
				tId=searchQueue.poll();
				//System.out.println("tId: "+tId+" "+visit[tId]);
				mask=new BigInteger("0");
				for(int j=0;j<bitSize;j++){
					mask=mask.shiftLeft(1);
					mask=mask.add(new BigInteger("1"));
				}
				//System.out.println(mask);
				for(int j=0;j<bitSize;j++){
					//System.out.println("visitId: "+(tId^(mask>>j))+" "+visit[(tId^(mask>>j))]);
					/*if(visit[tId.xor(mask.shiftRight(j).shiftLeft(j))]==-1){
						visit[tId.xor(mask.shiftRight(j).shiftLeft(j))]=visit[tId]+1;
						searchQueue.add(tId.xor(mask.shiftRight(j).shiftLeft(j)));
					}*/
					if(visit.get(tId.xor(mask.shiftRight(j).shiftLeft(j)))==null){
						visit.put(tId.xor(mask.shiftRight(j).shiftLeft(j)), visit.get(tId)+1);
						searchQueue.add(tId.xor(mask.shiftRight(j).shiftLeft(j)));
					}
					//System.out.println(searchQueue.size());
				}
				/*if(visit[mask]!=-1){
					System.out.println("Case #"+(i+1)+": "+visit[mask]);
					break;
				}*/
				if(visit.get(mask)!=null){
					//System.out.println("Case #"+(i+1)+": "+visit.get(mask));
					writeString=("Case #"+(i+1)+": "+visit.get(mask)+"\n");
					try {
						bw.write(writeString);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
			}
		}
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
