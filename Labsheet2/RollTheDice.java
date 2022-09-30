package Labsheet2;

import javax.swing.JOptionPane;
import java.util.Random;

public class RollTheDice {
    public static void main(String[] args) {
        String Question;
        int won=0, loss=0, draw=0, counter=0;
        do {
            Question = JOptionPane.showInputDialog(null,"Would you like to roll a dice?(yes/no): ","Input", JOptionPane.INFORMATION_MESSAGE);
            if(Question.equals("yes")){
                counter++;
                int min = 2;
                int max = 12;

                //Generate random int value from 2 to 12
                Random rand = new Random();
                int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
                int random_int2 = (int)Math.floor(Math.random()*(max-min+1)+min);

                JOptionPane.showMessageDialog(null,"You rolled " + random_int + " The computer rolled: " + random_int2,"Output", JOptionPane.INFORMATION_MESSAGE);
                if(random_int > random_int2){
                    JOptionPane.showMessageDialog(null,"You won","Output", JOptionPane.INFORMATION_MESSAGE);
                    won++;
                }
                if(random_int < random_int2){
                    JOptionPane.showMessageDialog(null,"Computer has won","Output", JOptionPane.INFORMATION_MESSAGE);
                    loss++;
                }
                if(random_int == random_int2){
                    JOptionPane.showMessageDialog(null,"You drew with the computer","Output", JOptionPane.INFORMATION_MESSAGE);
                    draw++;
                }
            }

        }while(!Question.equals("no"));

        JOptionPane.showMessageDialog(null,
                "Games you won: " + won +
                "\nGames the computer won: " + loss +
                "\nTotal draws: " + draw +
                "\nGames played: " + counter,"Final Table", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
