/*package Labsheet2;

import javax.swing.JOptionPane;

public class NamesArray {
    String[] name = new String[30];
    public static void main(String[] args) {
        String[] name = new String[30];
        String Long = "", names = "";
        for (int i = 0; i < 4; i++) {
            name[i] = JOptionPane.showInputDialog(null, "Please enter a name: ", "Input", JOptionPane.INFORMATION_MESSAGE);
            names = name[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, "Longest name: " + getLongest(names) + "Array in order\n" + names);
    }
        public void getLongest (String[] name, String Long) {
            for (int j = 0; j < 4; j++)
                for (int k = 3; k > -1; k--) {
                    if (name[j].length() > name[k].length()) {
                        Long = name[j];
                    } else {
                        Long = name[k];
                    }
                }
        }
    }
*/