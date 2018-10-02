package methodEmbedding.Counting_Sheep.S.LYD104;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Rahul
 * This is the first question on the Google Code Jam 2016
 */
public class CountingSheep 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        //Lets Go
        
        //Read the .in file here for processing
        BufferedReader br=null;
        int limit=0;
        String [] inputarray=new String[101];
        
        try
        {
            
        String sCurrentLine;

			br = new BufferedReader(new FileReader("C:\\Users\\Rahul\\Documents\\NetBeansProjects\\countingSheep\\src\\countingsheep\\inputFile.in"));
                        int lineTracker=0;
			while ((sCurrentLine = br.readLine()) != null) 
                        {
				//System.out.println(sCurrentLine);
                                if(lineTracker==0)
                                {
                                limit=Integer.parseInt(sCurrentLine);
                                }
                                else
                                {
                                    inputarray[lineTracker]=sCurrentLine;
                                }
                                lineTracker++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
        //set the limit first
        boolean limitTracker=false;
        //Scanner getLimit=new Scanner(System.in);
        
        
        do
        {
        //System.out.println("Enter T");
            if(limit <=0 || limit >100)
            {
                System.out.println("Limit not in range");
                limitTracker=false;
            }
            else
            {
                limitTracker=true;
            }
        }while(limitTracker==false);
            
        //System.out.println("Limit is: "+limit);
        
        //Now the algorithm starts
        
        ArrayList<Integer> list = new ArrayList();
        
        //loop till limit
        for (int i=1;i<=limit;i++)
        {
            String sheepInput;
            //Scanner getSheepInput=new Scanner(System.in);
            int finalresult=0;
            //System.out.println("Enter N");
            sheepInput=inputarray[i];
            
            int sheepInputlen=sheepInput.length();
            
            Integer checkInput=Integer.parseInt(sheepInput);
            
            int keepcheckInput=checkInput;
            
                if(checkInput <= 0 || checkInput >200)
                {
                    System.out.println("Case #"+i+": INSOMNIA");
                }
                else
                {
                    list.clear();
                    if(list.isEmpty())
                        
                        //Make list empty here
                    {
                        
                        if(sheepInputlen == 1)
                        {
                            list.add(checkInput);
                        }
                        else
                        {
                            while(checkInput > 0)
                            {
                             
                                Integer currentDigit1=checkInput%10;   
                                   // System.out.println(currentDigit1);
                                    
                                    
                                    
                                     if(list.contains(currentDigit1) == false)
                                       {
                                          list.add(checkInput%10);
                                                 
                                       }
                                     checkInput=checkInput/10;
                            }      
                        }
                        //System.out.println(list);
                        //System.out.println(list.size());
                        int loop=2;
                        while(list.size() <11)
                        {
                            
                            //System.out.println(list.size());
                            Integer currentcheckInput=loop*keepcheckInput;
                            finalresult=currentcheckInput;
                            //System.out.println(currentcheckInput);
                            String sheepInputInside=currentcheckInput.toString();
                            int newLen=sheepInputInside.length();
                            
                         if(newLen == 1)
                        {
                            if(list.contains(currentcheckInput) == false)
                            {
                            list.add(currentcheckInput);
                            //loop++;
                            }
                        }
                        else
                            {
                                
                                while(currentcheckInput > 0)
                                {
                                    
                                    Integer currentDigit=currentcheckInput%10;   
                                   // System.out.println(currentDigit);
                                    
                                    
                                    
                                     if(list.contains(currentDigit) == false)
                                       {
                                          list.add(currentcheckInput%10);
                                                 
                                       }
                                     currentcheckInput=currentcheckInput/10; 
                                }   
                                 
                            }
                             
                          
                         if(list.size() == 10)
                            {
                                //System.out.println("reached");
                                break;
                            }
                         loop++;
                         //System.out.println(list);
                        }
                       
                    }
                    
                System.out.println("Case #"+i+": "+finalresult);
                }          
        }
    }
    
}
