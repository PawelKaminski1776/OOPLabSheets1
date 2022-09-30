package Labsheet1;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class HeightStats {

    public static void main(String[] args) {
        int counter=1;
            while (counter < 7) {
                String height = JOptionPane.showInputDialog(null, counter + " Enter Your height: ");
                int ham = height.length();
                for(int i=0;i<ham;i++){
                    char ch1=height.charAt(i);
                if (Character.isDigit(ch1)) {
                    counter++;
                }
                else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
            }
            }
    }
}
