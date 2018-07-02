package methodEmbedding.Standing_Ovation.S.LYD1797;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bytz
 */
public class StandingOvation {

	/**
	 * @param args the command line arguments
	 * @throws java.io.FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner scanner=new Scanner(new File("StandingOvation.in"));
		FileWriter fileWriter=new FileWriter("StandingOvation.out");
		ArrayList<Integer> results=new ArrayList<>();
		Integer T=scanner.nextInt();
		for(int t=0;t<T;t++){
			Integer Smax=scanner.nextInt();
			String values=scanner.next();
			Integer peopleStanding=0;
			Integer peopleExtra=0;
			for(int shyness=0;shyness<values.length();shyness++){
				Byte peopleShy=Byte.valueOf(""+values.charAt(shyness));
				if(peopleStanding<shyness){
					Integer peopleNeed=shyness-peopleStanding;
					peopleExtra+=peopleNeed;
					peopleStanding+=peopleNeed;
				}
				peopleStanding+=peopleShy;
			}
			results.add(peopleExtra);
		}
		for(int i=0;i<results.size();i++){
			fileWriter.write("Case #"+(i+1)+": "+results.get(i));fileWriter.write(System.lineSeparator());
		}
		fileWriter.close();
		scanner.close();
	}
	
}
