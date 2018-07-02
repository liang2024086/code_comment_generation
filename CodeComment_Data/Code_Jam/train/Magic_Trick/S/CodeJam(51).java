package methodEmbedding.Magic_Trick.S.LYD1172;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.IOException;

/**
 *
 * @author KHURSHEED
 */
public class CodeJam {
    private final static String  rPath="C:\\Users\\KHURSHEED\\Documents\\NetBeansProjects2\\Code jam\\build\\classes\\code\\jam\\";    
    private final static String  orPath="C:\\Users\\KHURSHEED\\Documents\\NetBeansProjects2\\Code jam\\src\\code\\jam\\";    
    private final static String  o1Path="D:\\";
    private final static String  i1Path="C:\\";
    public static void main(String[] args) throws IOException {        
        InputReading ir=new InputReading(i1Path +"input.in",10);
        OutputWriting or=new OutputWriting(o1Path +"output.txt");
        //ir.getTestCaseCount();
        MagicTrick mt=new MagicTrick();
        while(ir.hasNext()){
            IObj o;            
            o=mt.TakeInput(ir.next());
            String r=mt.solve(o);
            System.out.println(r);
            or.write(r);
        }
        or.close();
    }
    
}
