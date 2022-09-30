package Labsheet1;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Lab1Ex4 {
    public static void main(String[] args) {
        String name, kmAsString;
        name = JOptionPane.showInputDialog(null,"Please enter your name: ","input",JOptionPane.INFORMATION_MESSAGE);
        kmAsString = JOptionPane.showInputDialog(null,"Please KMS cycled: ","input",JOptionPane.INFORMATION_MESSAGE);

        float cost, km = Float.parseFloat(kmAsString);

        if(km<=10){
            cost=km*1.75f;
        }
        else{
            cost=km*2.5f;
        }
        JOptionPane.showMessageDialog(null,"Name: " + name + "\nDistance Cycled: "+km+"\nCost: "+"€"+cost,"Output",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
