package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1167;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.Queue;

public class B {
	public static void main(String args[]) {
		//File file = new File(".");
		//for(String fileNames : file.list()) System.out.println(fileNames);
		
		try (BufferedReader reader = new BufferedReader(new FileReader("sample-b.in"))) {
//			PrintWriter writer = new PrintWriter(new FileWriter("sample-b.out"));
			
		    String line = reader.readLine();
		    int case_number = 0;
		    while ((line = reader.readLine()) != null) {
		    	case_number++;
//		        System.out.println("test case: " + line);
		        
		        String line2 = line;
		        int count = 0;
		        while (line2.lastIndexOf('-') != -1) {
			        char s = line2.charAt(0);
			        int next = 1;
			        while (next < line2.length() && line2.charAt(next) == s) {
			        	next++;
			        }
			        
			        StringBuilder sb = new StringBuilder();
        			sb.append(line2
					.substring(0,next)
					.replace('-', 't')
					.replace('+', '-')
					.replace('t', '+')
					);
        			sb.reverse();
					sb.append(line2.substring(next,line2.length()));
					line2 = sb.toString();
					count++;
		        }
		        System.out.println("Case #"+case_number+": "+count);
//		        System.out.println("greedy: " + flips);
		        
//		        Queue<String> q = new LinkedList<String>();
//		        Queue<String> nq = new LinkedList<String>();
//		        q.add(line);
//		        int checked = 0;
//		        int level = 0;
//		        while(true) {
//		        	checked++;
//		        	String s = q.poll();
//		        	//System.out.println(s);
//		        	//s = s.replaceFirst("\\++$", "");
//		        	int cut = s.length();
//		        	while(cut > 0 && s.charAt(cut-1) == '+') {
//		        		cut--;
//		        	}
//		        	s = s.substring(0,cut);
//		        	if (s.length() > 0) {
//		        		for (int i = 1; i <= s.length(); i++) {
//		        			StringBuilder sb = new StringBuilder();
//		        			for (int j = i-1; j >=0; j--) {
//		        				if (s.charAt(j) == '+') {
//		        					sb.append('-');
//		        				} else {
//		        					sb.append('+');
//		        				}
//		        				
//		        			}
////		        			sb.append(s
////		        					.substring(0,i)
////		        					.replace('-', 't')
////		        					.replace('+', '-')
////		        					.replace('t', '+')
////		        					);
////		        			sb.reverse();
//		        			sb.append(s.substring(i,s.length()));
//		        			nq.add(sb.toString());
//		        		}
//		        	} else {
//		        		System.out.println(level + " found in " + checked);
//		        		break;
//		        	}
//		        	if (q.isEmpty()) {
//		        		q = nq;
//		        		nq = new LinkedList<String>();
//		        		level++;
//		        	}
//		        }
		        
//			    writer.println(line);
		    }
//		    writer.close();
		    
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		
	}
}
