package Labsheet2;

import javax.swing.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

public class NamesGUI {
    JFrame jFrameWindow;
    JTextField name;
    JLabel underBox;
    JButton search, longest;
    int i=0, k=4;
    String[] names = new String[6];


    public NamesGUI() {
        jFrameWindow = new JFrame(); // create jframe

        FlowLayout flowlayout = new FlowLayout(); // create layout
        jFrameWindow.setLayout(flowlayout); // add layout to jframe

        jFrameWindow.setSize(500,100); // set size of jframe
        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit function of jframe
        jFrameWindow.setTitle("Student Names"); // title of jframe

        JLabel label = new JLabel("Name: "); // create name label
        jFrameWindow.add(label); // add name label to frame
        name = new JTextField(20); // create jtextfield
        jFrameWindow.add(name); // add jtextfield to jframe
        underBox = new JLabel("This array is empty please enter names to fill it out");// create new label
        jFrameWindow.add(underBox); // add label

        EventHandler handler = new EventHandler();  // event handler
        name.addActionListener(handler); // add handler to jtextfield

        jFrameWindow.setVisible(true); // show jframe

    }

    public static void main(String[] args) {
        NamesGUI guiApp = new NamesGUI();
    }
    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == name && i <= 4) {
                names[i] = name.getText();
                JOptionPane.showMessageDialog(null, "This has been added to the database: " + names[i], "Input",
                        JOptionPane.INFORMATION_MESSAGE);
                underBox.setText(k+" slots remaining please enter more names");
                name.setText("");
                i++;
                k--;
                if(i==5){
                    JOptionPane.showMessageDialog(null,"Name array full","Full Array!",JOptionPane.INFORMATION_MESSAGE);
                    underBox.setVisible(false);
                    search = new JButton("Search");
                    jFrameWindow.add(search);
                    longest = new JButton("Longest Name");
                    jFrameWindow.add(longest);
                    EventHandler handler = new EventHandler();
                    longest.addActionListener(handler);
                    search.addActionListener(handler);
                }
            }
            else if (e.getSource()==search ){
                String searched = name.getText();
                boolean yesorno;
                for(int p=0;p<=4;p++){
                    if(searched.equals(names[p])){
                        yesorno=true;
                    }
                    else {
                        yesorno=false;
                    }
                }
                if(yesorno=true) {
                    JOptionPane.showMessageDialog(null, searched + " was found in the array", "Output",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                if(yesorno=false) {
                    JOptionPane.showMessageDialog(null, searched + " was not found in the array", "Output",
                            JOptionPane.INFORMATION_MESSAGE);
                }

            }
            else if (e.getSource()==longest ){
                String Longest = names[0];
                for(int j=1;j<=4;j++){
                    if(Longest.length() < names[j].length()){
                        Longest = names[j];
                    }
                }
                JOptionPane.showMessageDialog(null,"The longest name is: " + Longest,"Longest name",JOptionPane.INFORMATION_MESSAGE);
            }

            else {
                JOptionPane.showMessageDialog(null, "error", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        }

    }
}
