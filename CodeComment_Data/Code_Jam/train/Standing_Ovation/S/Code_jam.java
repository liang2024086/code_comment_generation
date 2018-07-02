package methodEmbedding.Standing_Ovation.S.LYD1612;


import java.io.*;

class Standing_Ovation{
    public static void main(String args[]) throws IOException
    {
        BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));
        int max_loop=0,max_shy=0,frnd_num=0,i=0;
        int tot_std=0,dif=0,tot_stand_temp=0;
        int count=0;
        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt1.in"));
	String c=br.readLine();
        max_loop=Integer.parseInt(c);
	while( max_loop-->0)
        {   frnd_num=0;
            i=0;
             count++;
            tot_std=0;
		//System.out.println("You typed:"+c);
		c=br.readLine();
                String[] parts = c.split(" ");
                max_shy =Integer.parseInt(parts[0]);
                //System.out.println(max_shy);
                String part2 = parts[1];
                System.out.println("nuber="+count);
                while(i<=max_shy)
                {
                    
                   tot_stand_temp=Integer.parseInt(part2.charAt(i)+"");
                    //System.out.println(tot_std);
                   dif=i-tot_std;
                   // System.out.println(dif);
                   if(dif>0)
                   {
                       frnd_num=frnd_num+dif;
                       tot_std=tot_std+dif+tot_stand_temp;
                   }else{tot_std=tot_std+tot_stand_temp;}
                    i++;
                }
                bw.write("Case #"+count+": "+frnd_num+"\n");
               System.out.println("number of friend="+frnd_num);
               
//                System.out.println(parts[1]);
                
	}
        br.close();
        bw.close();

      //  System.out.println("number of friend="+frnd_num);
       

    }



}
