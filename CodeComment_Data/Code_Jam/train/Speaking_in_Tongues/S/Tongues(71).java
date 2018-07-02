package methodEmbedding.Speaking_in_Tongues.S.LYD812;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Tongues
 * Jason Bradley Nel
 * 16287398
 */
public class Tongues {
    
    public static void main(String[] args) {
        
        char[] original = new char[26];
        char[] mapsto = new char[26];
        
        for (int i = 0; i < 26; i++) {
            original[i] = (char)(97+i);
            //System.out.print(original[i]);
        }
        
        mapsto[0] = 'y';
        mapsto[14] = 'e';
        mapsto[16] = 'z';
        mapsto[25] = 'q';
        
        In samplein = new In("SampleInput.txt");
        In sampleout = new In("SampleOutput.txt");
        
        String i1 = samplein.readLine();
        //System.out.println(i1);
        int i2 = Integer.parseInt(samplein.readLine());
        //System.out.println(i2);
        String o1 = sampleout.readLine();
        //System.out.println(o1);
        
        for (int i = 0; i < i2; i++) {
            String inLine = samplein.readLine();
            //System.out.println(inLine);
            String caseOutLine = sampleout.readLine();
            String outLine = caseOutLine.substring(9, (inLine.length()+9));
            //System.out.println(outLine);
            //if(inLine.length() == outLine.length()) System.out.println(inLine.length());
            
            for (int j = 0; j < inLine.length(); j++) {
                for (int k = 0; k < 26; k++) {
                    if (inLine.charAt(j) == original[k]){
                    mapsto[k] = outLine.charAt(j);
                    }
                }
            }
        }
        /*
        for (int i = 0; i < 26; i++) {
            System.out.println(original[i] + " -> " + mapsto[i]);
        }*/
        
        In input = new In("input.txt");
        
        //String in1 = input.readLine();
        int in2 = Integer.parseInt(input.readLine());
        System.out.println("Output ");
        
        for (int i = 0; i < in2; i++) {
            System.out.printf("Case #%d: ", i+1);
            String inputLine = input.readLine();
            for (int j = 0; j < inputLine.length(); j++) {
                for (int k = 0; k < 26; k++) {
                    if(inputLine.charAt(j) == original[k]) System.out.print(mapsto[k]);
                }
                if(inputLine.charAt(j) == ' ') System.out.print(' ');
            }
            System.out.println();
        }
    }
}
