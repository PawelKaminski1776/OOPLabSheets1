package Lab5Ex2;

//TestBook.java
/*A driver class for the Book class*/

import Lab5Ex2.Book;
import Lab5Ex2.Computer;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "";

        Lab5Ex2.Book b1 = new Lab5Ex2.Book();

        Lab5Ex2.Computer c1 = new Lab5Ex2.Computer();

        output += "Calling the no-argument Book constructor. " +
                "The first Book object details are: \n\n" + b1.toString();

        Lab5Ex2.Book b2 = new Book("The Davinci Code",19.99,"3452617232",348);

        output += "\n\nCalling the multi-argument Book constructor. " +
                "The second Book object details are: \n\n" + b2.toString();

        JOptionPane.showMessageDialog(null,output,"Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
