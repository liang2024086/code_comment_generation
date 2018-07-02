package method_new_test.All_Your_Base.S.LYD112;

import java.io.*;
import java.util.Arrays;
import javax.swing.*;

public class base {
    public static void main(String args[]) {
        try {
            String file = JOptionPane.showInputDialog("Enter the input file: ");
            FileReader input = new FileReader(file);
            BufferedReader in = new BufferedReader(input);

            String ofile = JOptionPane.showInputDialog("Enter the output file: ");
            FileWriter output = new FileWriter(ofile);
            PrintWriter out = new PrintWriter(output);

            int cases = Integer.parseInt(in.readLine());

            for ( int i=0; i<cases; i++ ) {
                int symbols[] = new int[36];
                Arrays.fill(symbols, -1);
                String number = in.readLine();
                int newNum = 0;

                int values = 1;
                for ( int j=0; j<number.length(); j++ ) {
                    char x = number.charAt(j);
                    if (x < 'a') {
                        if (symbols[26 + x - 48] == -1 ) {
                            symbols[26 + x - 48] = values;
                            if ( values == 1 ) {
                                    values = 0;
                            } else if ( values == 0 ) {
                                    values = 2;
                            } else {
                                    values++;
                            }
                        }
                    } else {
                        if (symbols[x - 'a'] == -1 ) {
                            symbols[x - 'a'] = values;
                            if ( values == 1 ) {
                                    values = 0;
                            } else if ( values == 0 ) {
                                    values = 2;
                            } else {
                                    values++;
                            }
                        }
                    }
                }

                int base;
                if ( values == 0 ) { base = 2; }
                else { base = values; }

                for ( int j=0; j<number.length(); j++ ) {
                char x = number.charAt(j);
                int pos;
                if (x < 'a') { pos = 26 + x - 48; }
                else { pos = x - 'a'; }

                newNum = (newNum * base) + symbols[pos];
                }

                out.println("Case #" + (i+1) + ": " + newNum);
            }

            out.flush();
            in.close();
            out.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
