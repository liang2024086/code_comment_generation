package methodEmbedding.Standing_Ovation.S.LYD1734;


import java.util.ArrayList;

import javax.swing.JFileChooser;


public class Test {

	public static void main(String[] args) {
		JFileChooser c = new JFileChooser();
		c.showOpenDialog(null);
		

		ArrayList<String> strings = IO.readFile(c.getSelectedFile()); 
	
		IO.writeFile(StandingOvation.getSolution(strings));
		System.out.println("done!");
	}
}
