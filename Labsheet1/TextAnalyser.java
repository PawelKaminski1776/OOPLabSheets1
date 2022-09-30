package Labsheet1;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class TextAnalyser {
    public static void main(String[] args) {
        String sentence, smallest="5555555555555555555555555555555555555555555555555555555555555555555555555555555555";
        int counter=0, lowercaseletters=0, ed=0, average=0;

        do {
            sentence = JOptionPane.showInputDialog(null,"Please enter a sentence: ","input",JOptionPane.INFORMATION_MESSAGE);
            int words=1;
            int length = sentence.length();
            for(int i=0;i<length;i++) {
                char ch1 = sentence.charAt(i);
                if (ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' || ch1 == 'a') {
                    lowercaseletters++;
                }
                if(ch1 == ' '){
                    words++;
                }
            }
            for(int k=0;k<length;k++) {
                if(k % 2 == 0) {
                    if (sentence.contains("ed")) {
                        ed++;
                    }
                }
            }
            if(sentence.length() < smallest.length()){
                smallest = sentence;
            }
            JOptionPane.showMessageDialog(null, "This sentence is: " + length + " characters" +
                    "\nNumber of Lowercase Letters: " + lowercaseletters +
                    "\nNumber of words: " + words +
                    "\nNumber of eds: " + ed,"output",JOptionPane.INFORMATION_MESSAGE);
            average=average+words;
            lowercaseletters=lowercaseletters-lowercaseletters;
            words=words-words;
            ed=ed-ed;
            counter++;
        }
        while(counter<3);

        average=average/3;
        JOptionPane.showMessageDialog(null,"Shortest piece of text: "+ smallest +
                "\nAverage number of words: " + average,"output",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
