package Labsheet1;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class SnackDeal {
    public static void main(String[] args) {
        String name, course, snacks;
        float snacksasfloat, cost;

        name = JOptionPane.showInputDialog(null, "Please enter your name: ","Input",JOptionPane.INFORMATION_MESSAGE);
        course = JOptionPane.showInputDialog(null, "Please enter your course: ","Input",JOptionPane.INFORMATION_MESSAGE);
        snacks = JOptionPane.showInputDialog(null, "Please enter your number of snacks: ","Input",JOptionPane.INFORMATION_MESSAGE);

        snacksasfloat=Float.parseFloat(snacks);

        cost=snacksasfloat*2;

        JOptionPane.showMessageDialog(null,"Name: " + name + "\nCourse: "+course+"\nsnacks: "+snacks+"\nCost: "+"€"+cost,"Output",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
