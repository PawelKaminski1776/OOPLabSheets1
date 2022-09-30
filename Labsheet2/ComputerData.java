package Labsheet2;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ComputerData {
    public static void main(String[] args) {
        String serial, harddisk;
        do {
          serial = JOptionPane.showInputDialog(null,"please enter your serial number: (cr to exit)");
          harddisk = JOptionPane.showInputDialog(null,"please enter hard disk space: ");
          for(int i=0;i>harddisk.length();i++){
              char ch1 = harddisk.charAt(i);
              while(Character.isDigit(ch1)){
                  harddisk = JOptionPane.showInputDialog(null, "Error please re-enter space: ");
                  float harddiskf = Float.parseFloat(harddisk);
                  if(harddiskf <= 5000 && harddiskf >= 50){
                      break;
                  }
              }
          }
        }while(!serial.startsWith("cr"));
        System.exit(0);
    }
}
