package Lab5Ex3;

import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {
        String output = "*****Thermometer Testing UwU*****";
        Thermometer T1 = new Thermometer();
        output += "\nUwU: "+T1;
        Thermometer T2 = new Thermometer();
        output += "\nUwU: "+T2;
        Thermometer T3 = new Thermometer();
        output += "\nUwU: "+T3;
        JOptionPane.showMessageDialog(null,output,"",JOptionPane.INFORMATION_MESSAGE);

    }
}
