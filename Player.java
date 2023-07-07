package com.example.chohan;
import java.util.Random;
import javax.swing.JOptionPane;

public class Player {
    private String name;
    private String guess;
    private int points;

    public Player(String playerName)
    {
        name = playerName;
        guess = "";
        points = 0;
    }

    public void makeGuessInput(String name)
    {
        boolean done = false;

        while (!done) {

            String input = JOptionPane.showInputDialog(name + ", put your guess here: \n"
                    + "(0 = even, 1 = odd)");
            int number = Integer.parseInt(input);

            if (number == 0) {
                guess = "Cho (even)";
                done = true;
            } else if (number == 1) {
                guess = "Han (odd)";
                done = true;
            } else {
                JOptionPane.showMessageDialog(null, "That is not an option!!!\n" +
                        "Please guess again!!!");
            }
        }
    }

    public void addPoints(int newPoints)
    {
        points += newPoints;
    }

    public String getName()
    {
        return name;
    }

    public String getGuess()
    {
        return guess;
    }

    public int getPoints()
    {
        return points;
    }
}
