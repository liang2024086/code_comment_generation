package methodEmbedding.Cookie_Clicker_Alpha.S.LYD393;

import java.io.*;
import java.util.*;

/*
 * Kirsten Erich (kirstenaerich)
 * Google Code Jam 2014
 * Cookie Clicker - https://code.google.com/codejam/contest/2974486/dashboard#s=p1
 * cookieclicker.java
 * 12 April 2014
 */

public class cookieclicker {
	
	public static void main (String args[]) throws NumberFormatException, IOException{
		
		int test_cases = 0;
		
		double farm_cost = 0;
		double extra_cookies = 0;
		double cookie_goal = 0;
		
		double current_rate = 2; // 2 cookies per second
		
		double temp_seconds = 0;
		double seconds = 0;
		double final_seconds = 0;
		
		String oneLine = null;
		StringTokenizer strtok;
		
		File file = new File("C:/Users/Kirsten/Downloads/B-small-attempt0.in");
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(file));
		
		test_cases = Integer.parseInt(reader.readLine());
		
		int ct = 1;
		while (ct <= test_cases){
			oneLine = reader.readLine();
			strtok = new StringTokenizer(oneLine, " ");
			
			farm_cost = Double.parseDouble(strtok.nextToken());
			extra_cookies = Double.parseDouble(strtok.nextToken());
			cookie_goal = Double.parseDouble(strtok.nextToken());
			
			seconds = cookie_goal/current_rate;
			temp_seconds = (farm_cost/current_rate) + (cookie_goal/(current_rate+extra_cookies));
			
			if (seconds <= temp_seconds){
				final_seconds = seconds;
			}
			
			while (temp_seconds < seconds){
				seconds = cookie_goal/current_rate + final_seconds;
				//System.out.println("seconds: " + cookie_goal/current_rate + " + " + final_seconds + " = " + seconds);
				if (farm_cost/current_rate < cookie_goal/current_rate){
					temp_seconds = (farm_cost/current_rate) + (cookie_goal/(current_rate+extra_cookies)) + final_seconds;
					//System.out.println("temp_seconds: " + farm_cost/current_rate + " + " + cookie_goal/(current_rate+extra_cookies) + " = " + temp_seconds);
				}
				
				if (temp_seconds < seconds){
					final_seconds += farm_cost/current_rate;
					//System.out.println("final_seconds: " + final_seconds);
				}
				else{
					final_seconds += cookie_goal/current_rate;
				}
				current_rate+=extra_cookies;
			} // while the time has yet to be found

			System.out.format("Case #%d: %.7f%n", ct, final_seconds);
			final_seconds = 0;
			current_rate = 2;
			ct++;
			
		} // while there are still test cases
		
		reader.close();
		
	} // main

} // cookieclicker
