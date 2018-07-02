package methodEmbedding.Standing_Ovation.S.LYD1164;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;


public class binarySearch {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner kb = new Scanner(new File("input"));
		int cases = kb.nextInt();
		//System.out.println(cases);
		
		for(int c =1; c<cases+1; c++){
			int money = kb.nextInt();
			//System.out.println(money);
			String people = kb.next();
			int curr = 0;
			int invite = 0;
			for(int i = 0; i<=money;i++){
				if(i==0) {
					if(people.charAt(i) == '0') {
						invite++;
						curr = 1;
					}
					else {
						curr = people.charAt(i)-'0';
					}
				}
				else {
					if(curr < i){
						invite ++;
						curr +=(people.charAt(i) -'0' + 1);
					}
					else
						curr += (people.charAt(i) -'0');
				}
			}
			System.out.println("Case #" + c + ": " + invite);
		}
	}
/*	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner kb = new Scanner(new File("input"));
		int cases = kb.nextInt();
		//System.out.println(cases);
		
		for(int c =1; c<cases+1; c++){
			int plates = kb.nextInt();
			HashMap <Integer, Integer> counts = new HashMap <Integer, Integer>();
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>(20,new Comparator<Integer>(){
				public int compare(Integer a, Integer b) {return (b - a) ;}
			});		
			for(int i = 0; i<plates; i++){
				int num = kb.nextInt();
				//System.out.print(num + " ");
				if(counts.containsKey(num)) {
					counts.put(num, counts.get(num) + 1);
				}
				else{
					counts.put(num,1);
				}
			}
			for(int i : counts.keySet()){
				pq.add(i);
			}
			int time = 0;
			int top = 0;
			while(pq.size() > 0){
				top = pq.remove();
				//System.out.print(top + " ");
				
				if(counts.get(top) <= top/2 && (pq.size() == 0 || counts.get(top) <=(top - pq.peek()))){
					time += counts.get(top);
					if(counts.containsKey(top/2)) counts.put(top/2, counts.get(top/2) + counts.get(top));
					else counts.put(top/2, counts.get(top));
					if(counts.containsKey(top-top/2)) counts.put(top-top/2, counts.get(top-top/2) + counts.get(top));
					else counts.put(top-top/2, counts.get(top));
					if(!pq.contains(top/2))  pq.add(top/2);
					if(!pq.contains(top-top/2))  pq.add(top-top/2);
				}
				else {
					break;
				}
			}
			System.out.println("Case #" + c + ": " + (time +top));
		}
	}*/
}

