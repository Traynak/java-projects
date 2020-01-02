//*************************************************************
// TicTacToe.java Author: Trevor Raynak
//
// Driver for the game of Tic Tac Toe
//**************************************************************
import javax.swing.*;
import java.awt.*;
import tictactoepanel.TicTacToePanel;
public class TicTacToe 
{
public static void main (String[] args) {
 JFrame frame = new JFrame ("Tic Tac Toe");
 frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
 frame.getContentPane().add(new TicTacToePanel());
 frame.pack();
 frame.setVisible(true);
 }
}
